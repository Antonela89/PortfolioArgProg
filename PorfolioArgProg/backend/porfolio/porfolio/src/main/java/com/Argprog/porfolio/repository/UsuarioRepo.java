package com.Argprog.porfolio.repository;


import com.Argprog.porfolio.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository <Usuario, Long> {
	
}
