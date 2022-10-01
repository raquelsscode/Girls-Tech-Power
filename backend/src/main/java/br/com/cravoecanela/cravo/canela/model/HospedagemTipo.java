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
@Table(name="hospedagem_tipo") 
public class HospedagemTipo {
	@Column(name="hospedagem_tipo_id")
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer hospedagemTipoId;
	@Column(name="hospedagem_tipo_nome", length = 50, nullable = false, unique = true)
	private String hospedagemTipoNome;
	
	@OneToMany(mappedBy = "hospedagemTipo", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("hospedagemTipo")
	private List<Hospedagem> listaHospedagens;

	public Integer getHospedagemTipoId() {
		return hospedagemTipoId;
	}

	public void setHospedagemTipoId(Integer hospedagemTipoId) {
		this.hospedagemTipoId = hospedagemTipoId;
	}

	public String getHospedagemTipoNome() {
		return hospedagemTipoNome;
	}

	public void setHospedagemTipoNome(String hospedagemTipoNome) {
		this.hospedagemTipoNome = hospedagemTipoNome;
	}

	public List<Hospedagem> getListaHospedagens() {
		return listaHospedagens;
	}

	public void setListaHospedagens(List<Hospedagem> listaHospedagens) {
		this.listaHospedagens = listaHospedagens;
	}


	

	
	
}
