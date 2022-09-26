package br.com.cravoecanela.cravo.canela.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cravoecanela.cravo.canela.dao.PaisDao;
import br.com.cravoecanela.cravo.canela.model.Pais;

@Service
public class PaisServiceImp implements IPaisService{
	@Autowired
	private PaisDao dao;

	@Override
	public Pais criarPais(Pais novo) {
		if(novo.getPaisNome() != null && paisPorNome(novo.getPaisNome())==null)  {
			return dao.save(novo);
		}
		return paisPorNome(novo.getPaisNome());
	}

	@Override
	public Pais updatePais(Pais dados) {
		if(dados.getPaisId() != null && dados.getPaisNome() != null) {
			return dao.save(dados);
		}
		return null;
	}

	@Override
	public ArrayList<Pais> listarPaises() {
		return (ArrayList<Pais>)dao.findAll();
	}
	

	@Override
	public Pais paisPorId(Integer id) {
		return dao.findById(id).orElse(null);
	}
	
	
	@Override
	public void deletarPais(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public Pais paisPorNome(String nome) {
		return dao.findFirstByNome(nome);
		
	}
	
	
}


















