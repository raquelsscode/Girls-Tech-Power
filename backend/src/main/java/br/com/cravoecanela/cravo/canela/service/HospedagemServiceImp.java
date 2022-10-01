package br.com.cravoecanela.cravo.canela.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cravoecanela.cravo.canela.dao.HospedagemDao;
import br.com.cravoecanela.cravo.canela.model.Hospedagem;

@Service
public class HospedagemServiceImp implements IHospedagemService{
	@Autowired
	private HospedagemDao dao;

	@Override
	public Hospedagem criarHospedagem(Hospedagem novo) {
		return dao.save(novo);		
	}

	@Override
	public Hospedagem updateHospedagem(Hospedagem dados) {
		if(dados.getHospedagemId() != null) {
			return dao.save(dados);
		}
		return null;
	}

	@Override
	public ArrayList<Hospedagem> listarHospedagems() {
		return (ArrayList<Hospedagem>)dao.findAll();
	}
	

	@Override
	public Hospedagem hospedagemPorId(Integer id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void deletarHospedagem(Integer id) {
		dao.deleteById(id);
		
	}
	
	
}



