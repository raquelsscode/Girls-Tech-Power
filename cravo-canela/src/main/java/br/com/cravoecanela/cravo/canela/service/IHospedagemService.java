package br.com.cravoecanela.cravo.canela.service;

import java.util.ArrayList;

import br.com.cravoecanela.cravo.canela.model.Hospedagem;

public interface IHospedagemService {
	public Hospedagem criarHospedagem(Hospedagem novo);
	public Hospedagem updateHospedagem(Hospedagem dados);
	public ArrayList<Hospedagem> listarHospedagems();
	public Hospedagem hospedagemPorId(Integer id);
	public void deletarHospedagem(Integer id);
}
