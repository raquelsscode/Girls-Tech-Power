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

import br.com.cravoecanela.cravo.canela.model.HospedagemTipo;
import br.com.cravoecanela.cravo.canela.service.IHospedagemTipoService;


@RestController
public class HospedagemTipoController {
	
	@Autowired
	private IHospedagemTipoService service;
	
	@GetMapping("/hospedagemTipo")
	public ArrayList<HospedagemTipo> getAll(){
		return (ArrayList<HospedagemTipo>)service.listarHospedagemTipos();
	}
	
	@PostMapping("/hospedagemTipo")
	public ResponseEntity<HospedagemTipo> criarHospedagemTipo(@RequestBody HospedagemTipo novo){
		HospedagemTipo res = service.criarHospedagemTipo(novo);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/hospedagemTipo")
	public ResponseEntity<HospedagemTipo> updateHospedagemTipo(@RequestBody HospedagemTipo data){
		HospedagemTipo res = service.updateHospedagemTipo(data);
		if(res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/hospedagemTipo/{id}")
	public ResponseEntity<HospedagemTipo> deleteHospedagemTipo(@PathVariable Integer id){
		service.deletarHospedagemTipo(id);
		return ResponseEntity.ok(null);
			
	}
	
	@GetMapping("/hospedagemTipo/{id}")
	public ResponseEntity<HospedagemTipo> getHospedagemTipoById(@PathVariable Integer id){
		HospedagemTipo res = service.hospedagemTipoPorId(id);
		if(res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
			
	}
}


		




