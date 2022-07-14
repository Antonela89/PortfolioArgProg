package com.Argprog.porfolio.controller;

import com.Argprog.porfolio.models.Usuario;
import com.Argprog.porfolio.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
		
	@Autowired
	private IUsuarioService usuarioService;
	
	@PostMapping("/nuevo/usuario")
	public void agregarUsuario (@RequestBody Usuario usuario){
		usuarioService.crearUsuario(usuario);
	}		

	@GetMapping("/ver/usuario")
	@ResponseBody 
	public List<Usuario> verUsuario (){
		return usuarioService.verUsuarios();
	}
	
	@DeleteMapping("/borrar/{id}")
	public void eliminarUsuario (@PathVariable Long id) {
		usuarioService.eliminarUsuario(id);
	} 
	
	@PutMapping("/editar/{id}")
	public Usuario editarUsuario(@PathVariable Long id,
                                @RequestParam("nombreUsuario") String nuevoNombre,
				@RequestParam("apellidoUsuario") String nuevoApellido,
				@RequestParam("tituloUsuario") String nuevoTitulo,
				@RequestParam("acercaMiUsuario") String nuevoAcercaMi,
				@RequestParam("urlFotoUsuario") String nuevoUrlFoto){
        Usuario usuario = usuarioService.buscarUsuario(id);
        
        usuario.setNombre(nuevoNombre);
	usuario.setApellido(nuevoApellido);
	usuario.setTitulo(nuevoTitulo);
	usuario.setAcercaMi(nuevoAcercaMi);
	usuario.setUrlFoto(nuevoUrlFoto);
        
       usuarioService.crearUsuario(usuario);
        return usuario;
    }
}
		
	


		

