package com.Argprog.porfolio.service;


import com.Argprog.porfolio.models.Usuario;
import com.Argprog.porfolio.repository.UsuarioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	public UsuarioRepo usuarioRepo;

	@Override
	public List<Usuario> verUsuarios() {
		return usuarioRepo.findAll();
	}

	@Override
	public void crearUsuario(Usuario usuario) {
		usuarioRepo.save(usuario);
	}

	@Override
	public void eliminarUsuario(Long id) {
		usuarioRepo.deleteById(id);
	}

	@Override
	public Usuario buscarUsuario(Long id) {
		return usuarioRepo.findById(id).orElse(null);
	}
	
}
