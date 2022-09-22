package br.com.cravoecanela.cravo.canela.service;
import java.util.ArrayList;

import br.com.cravoecanela.cravo.canela.model.ClienteHospedagem;

public interface IClienteHospedagemService {
	public ClienteHospedagem criarClienteHospedagem(ClienteHospedagem novo);
	public ClienteHospedagem updateClienteHospedagem(ClienteHospedagem dados);
	public ArrayList<ClienteHospedagem> listarClienteHospedagems();
	public ClienteHospedagem clienteHospedagemPorId(Integer id);
	public void deletarClienteHospedagem(Integer id);

}

