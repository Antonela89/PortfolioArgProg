package com.Argprog.porfolio.security.repository;

import com.Argprog.porfolio.models.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository <Persona, Integer> {
	Optional <Persona> findByNombreUsuario (String nombreUsuario);
	
	boolean existsByNombreUsuario (String nombreUsuario);
	
	boolean existsByEmail (String email);

	public void save(com.Argprog.porfolio.security.service.UsuarioService usuario);
}
