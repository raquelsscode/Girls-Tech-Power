package br.com.cravoecanela.cravo.canela.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.cravoecanela.cravo.canela.model.Cidade;
import br.com.cravoecanela.cravo.canela.model.ReservasCliente;
import br.com.cravoecanela.cravo.canela.service.IReservasClienteService;


@RestController
public class ReservasClienteController {
	
	@Autowired
	private IReservasClienteService service;
	
	@GetMapping("/reservasclientes")
	public ArrayList<ReservasCliente> getAll(){
		return (ArrayList<ReservasCliente>)service.recuperarReserva();
	}
	

	@GetMapping("/reservasclientes/{nome}")
	public ArrayList<ReservasCliente> getReservasBynome(@PathVariable String nome){
		return (ArrayList<ReservasCliente>)service.listarReservasNome(nome);
			
	}

}
