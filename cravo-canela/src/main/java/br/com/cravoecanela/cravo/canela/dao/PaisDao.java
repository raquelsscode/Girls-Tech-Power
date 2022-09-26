package br.com.cravoecanela.cravo.canela.dao;



import org.springframework.data.repository.CrudRepository;
import br.com.cravoecanela.cravo.canela.model.Pais;

public interface PaisDao extends CrudRepository<Pais,Integer>{
	
	public Pais findFirstByNome(String palavra);
}
