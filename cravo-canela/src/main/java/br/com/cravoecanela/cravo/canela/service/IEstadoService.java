package br.com.cravoecanela.cravo.canela.service;
import java.util.ArrayList;

import br.com.cravoecanela.cravo.canela.model.Estado;

public interface IEstadoService {
	public Estado criarEstado(Estado novo);
	public Estado updateEstado(Estado dados);
	public ArrayList<Estado> listarEstados();
	public Estado estadoPorId(Integer id);
	public void deletarEstado(Integer id);

}
