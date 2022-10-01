package br.com.cravoecanela.cravo.canela.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cravoecanela.cravo.canela.dao.ReservasClienteDao;
import br.com.cravoecanela.cravo.canela.model.ReservasCliente;

@Service
public class ReservasClienteImp implements IReservasClienteService {
	@Autowired
	private ReservasClienteDao dao;

	@Override
	public ArrayList<ReservasCliente> recuperarReserva() {
		return (ArrayList<ReservasCliente>) dao.findAll();
	}
	
	@Override
	public ArrayList<ReservasCliente> listarReservasNome(String nome) {
		return (ArrayList<ReservasCliente>) dao.findByclienteNomeContains(nome);
	}

}

