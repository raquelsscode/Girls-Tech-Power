package br.com.cravoecanela.cravo.canela.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cravoecanela.cravo.canela.dao.CidadeDao;
import br.com.cravoecanela.cravo.canela.model.Cidade;

@Service
public class CidadeServiceImp implements ICidadeService{
	@Autowired
	private CidadeDao dao;

	@Override
	public Cidade criarCidade(Cidade novo) {
		if(listarCidadesNome(novo.getCidadeNome()) == null)
			return dao.save(novo);	
		return listarCidadesNome(novo.getCidadeNome());
	}

	@Override
	public Cidade updateCidade(Cidade dados) {
		if(dados.getCidadeId() != null) {
			return dao.save(dados);
		}
		return null;
	}

	@Override
	public ArrayList<Cidade> listarCidades() {
		return (ArrayList<Cidade>)dao.findAll();
	}
	

	@Override
	public Cidade cidadePorId(Integer id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void deletarCidade(Integer id) {
		dao.deleteById(id);
		
	}
	
	@Override
	public Cidade listarCidadesNome(String cidade) {
		return dao.findFirstBycidadeNome(cidade);
		
	}
	
	
}


