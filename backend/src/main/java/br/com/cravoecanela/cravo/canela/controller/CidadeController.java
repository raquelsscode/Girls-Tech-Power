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

import br.com.cravoecanela.cravo.canela.model.Cidade;
import br.com.cravoecanela.cravo.canela.service.ICidadeService;


@RestController
public class CidadeController {
	
	@Autowired
	private ICidadeService service;
	
	@GetMapping("/cidade")
	public ArrayList<Cidade> getAll(){
		return (ArrayList<Cidade>)service.listarCidades();
	}
	
	@PostMapping("/cidade")
	public ResponseEntity<Cidade> criarCidade(@RequestBody Cidade novo){
		Cidade res = service.criarCidade(novo);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/cidade")
	public ResponseEntity<Cidade> updateCidade(@RequestBody Cidade data){
		Cidade res = service.updateCidade(data);
		if(res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/cidade/{id}")
	public ResponseEntity<Cidade> deleteCidade(@PathVariable Integer id){
		service.deletarCidade(id);
		return ResponseEntity.ok(null);
			
	}
	
	@GetMapping("/cidade/{nome}")
	public ResponseEntity<Cidade> getCidadeById(@PathVariable String nome){
		Cidade res = service.listarCidadesNome(nome);
		if(res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
			
	}
	
//	
//	@GetMapping("/cidade/busca")
//	public ArrayList<Cidade> listarCidadesNome(@RequestParam(name="palavra") String palavra) {
//		return service.listarCidadesNome(palavra) ;
//	}
}


		



