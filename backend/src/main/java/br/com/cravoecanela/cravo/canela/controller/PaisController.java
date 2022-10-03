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

import br.com.cravoecanela.cravo.canela.model.Pais;
import br.com.cravoecanela.cravo.canela.service.IPaisService;


@RestController
public class PaisController {
	
	@Autowired
	private IPaisService service;
	
	@GetMapping("/pais")
	public ArrayList<Pais> getAll(){
		return (ArrayList<Pais>)service.listarPaises();
	}
	
	@PostMapping("/pais")
	public ResponseEntity<Pais> criarPais(@RequestBody Pais novo){
		Pais res = service.criarPais(novo);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/pais")
	public ResponseEntity<Pais> updatePais(@RequestBody Pais data){
		Pais res = service.updatePais(data);
		if(res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/pais/{id}")
	public ResponseEntity<Pais> deletePais(@PathVariable Integer id){
		service.deletarPais(id);
		return ResponseEntity.ok(null);
			
	}
	
	@GetMapping("/pais/{id}")
	public ResponseEntity<Pais> getPaisById(@PathVariable Integer id){
		Pais res = service.paisPorId(id);
		if(res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
			
	}
}


		

