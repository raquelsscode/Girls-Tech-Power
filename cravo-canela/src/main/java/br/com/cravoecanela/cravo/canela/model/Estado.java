package br.com.cravoecanela.cravo.canela.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity  
@Table(name="estado") 
public class Estado {
	@Column(name="estado_id")
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer estadoId;
	@Column(name="estado_nome", length = 50, nullable = false)
	private String estadoNome;
	@Column(name="estado_sigla", length = 50, nullable = false)
	private String estadoSigla;
	
	@ManyToOne
	@JoinColumn(name = "pais_id")
	@JsonIgnoreProperties("listaEstados")
	private Pais pais;
	
	@OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("estado")
	private List<Cidade> listaCidades;
	
	public List<Cidade> getListaCidades() {
		return listaCidades;
	}
	public void setListaCidades(List<Cidade> listaCidades) {
		this.listaCidades = listaCidades;
	}
	public Integer getEstadoId() {
		return estadoId;
	}
	public void setEstadoId(Integer estadoId) {
		this.estadoId = estadoId;
	}
	public String getEstadoNome() {
		return estadoNome;
	}
	public void setEstadoNome(String estadoNome) {
		this.estadoNome = estadoNome;
	}
	public String getEstadoSigla() {
		return estadoSigla;
	}
	public void setEstadoSigla(String estadoSigla) {
		this.estadoSigla = estadoSigla;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	

}
