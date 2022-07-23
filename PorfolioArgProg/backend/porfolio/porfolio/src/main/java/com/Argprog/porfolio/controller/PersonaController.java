package com.Argprog.porfolio.controller;

import com.Argprog.porfolio.models.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.Argprog.porfolio.service.IPersonaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/persona")

public class PersonaController {
	
	@Autowired
	private IPersonaService personaService;
	
	@PostMapping("/nuevo/persona")
	public void agregarPersona (@RequestBody Persona persona){
		personaService.crearPersona(persona);
	}		

	@GetMapping("/ver/persona")
	@ResponseBody 
	public List<Persona> verPersona (){
		return personaService.verPersonas();
	}
	
	@DeleteMapping("/borrar/{id}")
	public void eliminarPersona (@PathVariable Long id) {
		personaService.eliminarPersona(id);
	} 
	
	@PutMapping("/editar/{id}")
	public Persona editarPersona(@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
				@RequestParam("apellido") String nuevoApellido,
				@RequestParam("titulo") String nuevoTitulo,
				@RequestParam("acercaMi") String nuevoAcercaMi,
				@RequestParam("urlFoto") String nuevoUrlFoto){
        Persona persona = personaService.buscarPersona(id);
        
        persona.setNombre(nuevoNombre);
	persona.setApellido(nuevoApellido);
	persona.setTitulo(nuevoTitulo);
	persona.setAcercaMi(nuevoAcercaMi);
	persona.setUrlFoto(nuevoUrlFoto);
        
       personaService.crearPersona(persona);
        return persona;
    }
}
		
	


		

