package br.com.cravoecanela.cravo.canela.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cravoecanela.cravo.canela.model.Cliente;
import br.com.cravoecanela.cravo.canela.service.IClienteService;


@RestController
public class ClienteController {
	
	@Autowired
	private IClienteService service;
	
	@GetMapping("/cliente")
	public ArrayList<Cliente> getAll(){
		return (ArrayList<Cliente>)service.listarClientes();
	}
	
	@PostMapping("/cliente")
	public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente novo){
		Cliente res = service.criarCliente(novo);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/cliente")
	public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente data){
		Cliente res = service.updateCliente(data);
		if(res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/cliente/{id}")
	public ResponseEntity<Cliente> deleteCliente(@PathVariable Integer id){
		service.deletarCliente(id);
		return ResponseEntity.ok(null);
			
	}
	
	@GetMapping("/cliente/{id}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable Integer id){
		Cliente res = service.clientePorId(id);
		if(res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
			
	}
}


		




