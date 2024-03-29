package com.Argprog.porfolio.security.service;

import com.Argprog.porfolio.security.entity.Rol;
import com.Argprog.porfolio.security.enums.RolNombre;
import com.Argprog.porfolio.security.repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
@Transactional
public class RolService {
	@Autowired 
	IRolRepository irolRepository;
	
	public Optional<Rol>getByRolNombre(RolNombre rolNombre){
		return irolRepository.findByRolNombre(rolNombre);
	}
	
	public void save(Rol rol){
		irolRepository.save(rol);
	}
}
