package br.com.cravoecanela.cravo.canela.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cravoecanela.cravo.canela.dao.HospedagemTipoDao;
import br.com.cravoecanela.cravo.canela.model.HospedagemTipo;

@Service
public class HospedagemTipoServiceImp implements IHospedagemTipoService{
	@Autowired
	private HospedagemTipoDao dao;

	@Override
	public HospedagemTipo criarHospedagemTipo(HospedagemTipo novo) {
		return dao.save(novo);		
	}

	@Override
	public HospedagemTipo updateHospedagemTipo(HospedagemTipo dados) {
		if(dados.getHospedagemTipoId() != null) {
			return dao.save(dados);
		}
		return null;
	}

	@Override
	public ArrayList<HospedagemTipo> listarHospedagemTipos() {
		return (ArrayList<HospedagemTipo>)dao.findAll();
	}
	

	@Override
	public HospedagemTipo hospedagemTipoPorId(Integer id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void deletarHospedagemTipo(Integer id) {
		dao.deleteById(id);
		
	}
	
	
}



