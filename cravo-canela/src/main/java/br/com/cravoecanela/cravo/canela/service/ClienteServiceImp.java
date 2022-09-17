package br.com.cravoecanela.cravo.canela.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cravoecanela.cravo.canela.dao.ClienteDao;
import br.com.cravoecanela.cravo.canela.model.Cliente;

@Service
public class ClienteServiceImp implements IClienteService{
	@Autowired
	private ClienteDao dao;

	@Override
	public Cliente criarCliente(Cliente novo) {
		return dao.save(novo);		
	}

	@Override
	public Cliente updateCliente(Cliente dados) {
		if(dados.getClienteId() != null) {
			return dao.save(dados);
		}
		return null;
	}

	@Override
	public ArrayList<Cliente> listarClientes() {
		return (ArrayList<Cliente>)dao.findAll();
	}
	

	@Override
	public Cliente clientePorId(Integer id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void deletarCliente(Integer id) {
		dao.deleteById(id);
		
	}
	
	
}



