package br.com.cravoecanela.cravo.canela.service;
import java.util.ArrayList;

import br.com.cravoecanela.cravo.canela.model.Pais;

public interface IPaisService {
	public Pais criarPais(Pais novo);
	public Pais updatePais(Pais dados);
	public ArrayList<Pais> listarPaises();
	public Pais paisPorId(Integer id);
	public void deletarPais(Integer id);

}


