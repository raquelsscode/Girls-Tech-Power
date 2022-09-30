package br.com.cravoecanela.cravo.canela.dao;

import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.cravoecanela.cravo.canela.model.ReservasCliente;

@Repository
public interface ReservasClienteDao extends CrudRepository<ReservasCliente, Integer> {
	
	public ArrayList<ReservasCliente> findByclienteNomeContains(String nome);

}
