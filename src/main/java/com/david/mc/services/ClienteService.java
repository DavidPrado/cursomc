package com.david.mc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.mc.domain.Cliente;
import com.david.mc.repositories.ClienteRepository;
import com.david.mc.services.exceptions.ObjectNotFoundException;



@Service
public class ClienteService {
	
	@Autowired 
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo:" + Cliente.class.getName()));
	}
}
