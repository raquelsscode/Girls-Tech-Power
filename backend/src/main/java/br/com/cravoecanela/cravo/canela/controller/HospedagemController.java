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

import br.com.cravoecanela.cravo.canela.model.Hospedagem;
import br.com.cravoecanela.cravo.canela.service.IHospedagemService;


@RestController
public class HospedagemController {
	
	@Autowired
	private IHospedagemService service;
	
	@GetMapping("/hospedagem")
	public ArrayList<Hospedagem> getAll(){
		return (ArrayList<Hospedagem>)service.listarHospedagems();
	}
	
	@PostMapping("/hospedagem")
	public ResponseEntity<Hospedagem> criarHospedagem(@RequestBody Hospedagem novo){
		Hospedagem res = service.criarHospedagem(novo);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/hospedagem")
	public ResponseEntity<Hospedagem> updateHospedagem(@RequestBody Hospedagem data){
		Hospedagem res = service.updateHospedagem(data);
		if(res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/hospedagem/{id}")
	public ResponseEntity<Hospedagem> deleteHospedagem(@PathVariable Integer id){
		service.deletarHospedagem(id);
		return ResponseEntity.ok(null);
			
	}
	
	@GetMapping("/hospedagem/{id}")
	public ResponseEntity<Hospedagem> getHospedagemById(@PathVariable Integer id){
		Hospedagem res = service.hospedagemPorId(id);
		if(res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
			
	}
}


		




