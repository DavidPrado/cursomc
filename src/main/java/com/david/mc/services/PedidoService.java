package com.david.mc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.mc.domain.Pedido;
import com.david.mc.repositories.PedidoRepository;
import com.david.mc.services.exceptions.ObjectNotFoundException;



@Service
public class PedidoService {
	
	@Autowired 
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo:" + Pedido.class.getName()));
	}
}
