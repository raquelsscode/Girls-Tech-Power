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

import br.com.cravoecanela.cravo.canela.model.ClienteHospedagem;
import br.com.cravoecanela.cravo.canela.service.IClienteHospedagemService;


@RestController
public class ClienteHospedagemController {
	
	@Autowired
	private IClienteHospedagemService service;
	
	@GetMapping("/clienteHospedagem")
	public ArrayList<ClienteHospedagem> getAll(){
		return (ArrayList<ClienteHospedagem>)service.listarClienteHospedagems();
	}
	
	@PostMapping("/clienteHospedagem")
	public ResponseEntity<ClienteHospedagem> criarClienteHospedagem(@RequestBody ClienteHospedagem novo){
		ClienteHospedagem res = service.criarClienteHospedagem(novo);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/clienteHospedagem")
	public ResponseEntity<ClienteHospedagem> updateClienteHospedagem(@RequestBody ClienteHospedagem data){
		ClienteHospedagem res = service.updateClienteHospedagem(data);
		if(res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/clienteHospedagem/{id}")
	public ResponseEntity<ClienteHospedagem> deleteClienteHospedagem(@PathVariable Integer id){
		service.deletarClienteHospedagem(id);
		return ResponseEntity.ok(null);
			
	}
	
	@GetMapping("/clienteHospedagem/{id}")
	public ResponseEntity<ClienteHospedagem> getClienteHospedagemById(@PathVariable Integer id){
		ClienteHospedagem res = service.clienteHospedagemPorId(id);
		if(res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
			
	}
}


		




