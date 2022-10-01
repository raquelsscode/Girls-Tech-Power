package br.com.cravoecanela.cravo.canela.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity  
@Table(name="pais") 
public class Pais {
	@Column(name="pais_id")
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer paisId;
	@Column(name="pais_nome", length = 50, nullable = false)
	private String paisNome;
	
	@OneToMany(mappedBy = "pais", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("pais")
	private List<Estado> listaEstados;

	public Integer getPaisId() {
		return paisId;
	}

	public void setPaisId(Integer paisId) {
		this.paisId = paisId;
	}

	public String getPaisNome() {
		return paisNome;
	}

	public void setPaisNome(String paisNome) {
		this.paisNome = paisNome;
	}

	public List<Estado> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<Estado> listaEstados) {
		this.listaEstados = listaEstados;
	}

	
	
}
