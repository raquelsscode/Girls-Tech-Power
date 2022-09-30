package br.com.cravoecanela.cravo.canela.model;


import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity  
@Table(name="cidade") 
public class Cidade {
	@Column(name="cidade_id")
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer cidadeId;
	@Column(name="cidade_nome", length = 100, nullable = false)
	private String cidadeNome;
	
	@ManyToOne
	@JoinColumn(name = "estado_id")
	@JsonIgnoreProperties("listaCidades")
	private Estado estado;	

	
	public Integer getCidadeId() {
		return cidadeId;
	}

	public void setCidadeId(Integer cidadeId) {
		this.cidadeId = cidadeId;
	}

	public String getCidadeNome() {
		return cidadeNome;
	}

	public void setCidadeNome(String cidadeNome) {
		this.cidadeNome = cidadeNome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
//	public List<Cliente> getListaClientes() {
//		return listaClientes;
//	}
//
//	public void setListaClientes(List<Cliente> listaClientes) {
//		this.listaClientes = listaClientes;
//	}

}
