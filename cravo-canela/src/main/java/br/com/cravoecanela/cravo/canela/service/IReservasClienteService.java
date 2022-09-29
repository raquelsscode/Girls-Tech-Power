package br.com.cravoecanela.cravo.canela.service;

import java.util.ArrayList;

import br.com.cravoecanela.cravo.canela.model.ReservasCliente;

public interface IReservasClienteService {
	public ArrayList<ReservasCliente> recuperarReserva();
	public ArrayList<ReservasCliente> listarReservasNome(String nome);
	
}
