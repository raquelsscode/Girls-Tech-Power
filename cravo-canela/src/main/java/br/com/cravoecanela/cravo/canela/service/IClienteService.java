package br.com.cravoecanela.cravo.canela.service;

import java.util.ArrayList;

import br.com.cravoecanela.cravo.canela.model.Cliente;

public interface IClienteService {
	public Cliente criarCliente(Cliente novo);
	public Cliente updateCliente(Cliente dados);
	public ArrayList<Cliente> listarClientes();
	public Cliente clientePorId(Integer id);
	public void deletarCliente(Integer id);
}


