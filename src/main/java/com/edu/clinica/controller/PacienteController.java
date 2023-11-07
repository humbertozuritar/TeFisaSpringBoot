package com.edu.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edu.clinica.models.Paciente;
import com.edu.clinica.service.IEnfermedadService;
import com.edu.clinica.service.IMedicoService;
import com.edu.clinica.service.IPacienteService;
import com.edu.clinica.service.ISedeService;
import com.edu.clinica.service.IUsuarioService;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IEnfermedadService enfermedadService;
	
	@Autowired
	private IMedicoService medicoService;
	
	@Autowired
	private ISedeService sedeService;
	
    @GetMapping("/")
    public String Listar(Model model) {
    	model.addAttribute("pacientes", pacienteService.ListarTodos());
        return "/ListarPaciente";
    }
    
    @GetMapping("/nuevo")
    public String Nuevo(Model model) {
    	Paciente obj = new Paciente();
    	obj.setIdPaciente(pacienteService.CodigoGenerado());
    	
    	model.addAttribute("paciente", obj);
    	model.addAttribute("accion", 1);
        return "/NuevoPaciente";
    }
    
    @GetMapping("/editar/{id}")
    public String Editar(Model model , @PathVariable("id") String id) {
    	Paciente obj = pacienteService.BuscarPorId(id);
    	
    	if(obj == null) {
    		return "redirect:/paciente/";
    	}
    	model.addAttribute("paciente", obj);
    	model.addAttribute("accion", 2);
        return "/NuevoPaciente";
    }
    
    @PostMapping("/guardar")
	public String Guardar(Paciente obj , int accion,
			Model model , RedirectAttributes attributes)
			throws Exception {
    	
    	if(pacienteService.Guardar(obj) == null) {
    		attributes.addFlashAttribute("error", "Por favor verifique que los datos ingresados sean correctos");
    		model.addAttribute("paciente", obj);
        	model.addAttribute("accion", 2);
    		return "/NuevoPaciente";
    	} 
		
		attributes.addFlashAttribute("success","Los datos del paciente se guardaron de forma correcta");
		return "redirect:/paciente/";
	}
    
    @GetMapping("/eliminar/{id}")
   	public String Eliminar(@PathVariable("id") String id,
   			Model model , RedirectAttributes attributes)
   			throws Exception {
       	
       	if(pacienteService.Eliminar(id)) {
       		attributes.addFlashAttribute("success", "Paciente eliminado correctamente");
       	} else {
       		attributes.addFlashAttribute("error","No se pudo eliminar datos del paciente con el id "+id);
       	}

   		return "redirect:/paciente/";
   	}
    
    @ModelAttribute
	public void setDatos(Model model){
		model.addAttribute("enfermedades", enfermedadService.ListarTodos());
		model.addAttribute("medicos", medicoService.ListarTodos());	
		model.addAttribute("sedes", sedeService.ListarTodos());	
	}
}
