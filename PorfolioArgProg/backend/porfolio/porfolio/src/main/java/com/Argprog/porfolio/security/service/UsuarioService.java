package com.Argprog.porfolio.security.service;


import com.Argprog.porfolio.security.entity.Usuario;
import com.Argprog.porfolio.security.repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
@Transactional
public class UsuarioService {
	@Autowired 
	IUsuarioRepository iusuarioRepository;
	
	public Optional<com.Argprog.porfolio.models.Persona>getByNombreUsuario(String nombreUsuario){
		return iusuarioRepository.findByNombreUsuario(nombreUsuario);
	}
	
	public boolean existsByNombreUsuario(String nombreUsuario) {
		return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
	}

	public boolean existsByEmail(String email) {
		return iusuarioRepository.existsByEmail(email);
	}
	
	public void save(UsuarioService usuarioservice){
		iusuarioRepository.save(usuarioservice);
	}
	
}