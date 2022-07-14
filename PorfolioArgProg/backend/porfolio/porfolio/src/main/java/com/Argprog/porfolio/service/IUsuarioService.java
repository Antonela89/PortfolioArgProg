
package com.Argprog.porfolio.service;

import com.Argprog.porfolio.models.Usuario;
import java.util.List;


public interface IUsuarioService {
	
	public List <Usuario> verUsuarios ();
	
	public void crearUsuario (Usuario usuario);
	
	public void eliminarUsuario (Long id);
	
	public Usuario buscarUsuario (Long id);
}
