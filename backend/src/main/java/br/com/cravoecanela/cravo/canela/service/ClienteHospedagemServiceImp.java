package br.com.cravoecanela.cravo.canela.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cravoecanela.cravo.canela.dao.ClienteHospedagemDao;
import br.com.cravoecanela.cravo.canela.model.ClienteHospedagem;

@Service
public class ClienteHospedagemServiceImp implements IClienteHospedagemService{
	@Autowired
	private ClienteHospedagemDao dao;

	@Override
	public ClienteHospedagem criarClienteHospedagem(ClienteHospedagem novo) {		
		return dao.save(novo);		
	}

	@Override
	public ClienteHospedagem updateClienteHospedagem(ClienteHospedagem dados) {
		if(dados.getClienteHospedagemId() != null) {
			return dao.save(dados);
		}
		return null;
	}

	@Override
	public ArrayList<ClienteHospedagem> listarClienteHospedagems() {
		return (ArrayList<ClienteHospedagem>)dao.findAll();
	}
	

	@Override
	public ClienteHospedagem clienteHospedagemPorId(Integer id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void deletarClienteHospedagem(Integer id) {
		dao.deleteById(id);
		
	}
	
	
}




