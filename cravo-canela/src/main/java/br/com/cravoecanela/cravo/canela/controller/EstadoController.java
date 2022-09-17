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

import br.com.cravoecanela.cravo.canela.model.Estado;
import br.com.cravoecanela.cravo.canela.service.IEstadoService;


@RestController
public class EstadoController {
	
	@Autowired
	private IEstadoService service;
	
	@GetMapping("/estado")
	public ArrayList<Estado> getAll(){
		return (ArrayList<Estado>)service.listarEstados();
	}
	
	@PostMapping("/estado")
	public ResponseEntity<Estado> criarEstado(@RequestBody Estado novo){
		Estado res = service.criarEstado(novo);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/estado")
	public ResponseEntity<Estado> updateEstado(@RequestBody Estado data){
		Estado res = service.updateEstado(data);
		if(res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/estado/{id}")
	public ResponseEntity<Estado> deleteEstado(@PathVariable Integer id){
		service.deletarEstado(id);
		return ResponseEntity.ok(null);
			
	}
	
	@GetMapping("/estado/{id}")
	public ResponseEntity<Estado> getEstadoById(@PathVariable Integer id){
		Estado res = service.estadoPorId(id);
		if(res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
			
	}
}


		


