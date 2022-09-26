package br.com.cravoecanela.cravo.canela.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.cravoecanela.cravo.canela.model.Cidade;

public interface CidadeDao extends CrudRepository<Cidade,Integer>{
	
	public ArrayList<Cidade> findBycidadeNomeContaining(String palavraChave);

}



