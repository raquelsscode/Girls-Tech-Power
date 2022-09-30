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
@Table(name="hospedagem") 
public class Hospedagem {
	@Column(name="hospedagem_id")
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer hospedagemId;
	@Column(name="hospedagem_nome", length = 50, nullable = false)
	private String hospedagemNome;
	@Column(name="hospedagem_cnpj", length = 18, nullable = false)
	private String hospedagemCnpj;
	@Column(name="hospedagem_ie", length = 15, nullable = false)
	private String hospedagemIe;
	@Column(name="hospedagem_endereco", length = 100)
	private String hospedagemEndereco;
	@Column(name="hospedagem_nro", length = 10)
	private String hospedagemNro;
	@Column(name="hospedagem_complemento", length = 50)
	private String hospedagemComplemento;
	@Column(name="hospedagem_bairro", length = 50)
	private String hospedagemBairro;
	@Column(name="hospedagem_cep", length = 9)
	private String hospedagemCep;
	@Column(name="hospedagem_email", length = 50)
	private String hospedagemEmail;
	@Column(name="hospedagem_telefone", length = 14)
	private String hospedagemTelefone;

	@ManyToOne
	@JoinColumn(name = "tipo_id")
	@JsonIgnoreProperties("listaHospedagens")
	private HospedagemTipo hospedagemTipo;
	
	@ManyToOne
	@JoinColumn(name = "cidade_id")
	//@JsonIgnoreProperties("listaEstados")
	private Cidade cidade;

	public Integer getHospedagemId() {
		return hospedagemId;
	}

	public void setHospedagemId(Integer hospedagemId) {
		this.hospedagemId = hospedagemId;
	}

	public String getHospedagemNome() {
		return hospedagemNome;
	}

	public void setHospedagemNome(String hospedagemNome) {
		this.hospedagemNome = hospedagemNome;
	}

	public String getHospedagemCnpj() {
		return hospedagemCnpj;
	}

	public void setHospedagemCnpj(String hospedagemCnpj) {
		this.hospedagemCnpj = hospedagemCnpj;
	}

	public String getHospedagemIe() {
		return hospedagemIe;
	}

	public void setHospedagemIe(String hospedagemIe) {
		this.hospedagemIe = hospedagemIe;
	}

	public String getHospedagemEndereco() {
		return hospedagemEndereco;
	}

	public void setHospedagemEndereco(String hospedagemEndereco) {
		this.hospedagemEndereco = hospedagemEndereco;
	}

	public String getHospedagemNro() {
		return hospedagemNro;
	}

	public void setHospedagemNro(String hospedagemNro) {
		this.hospedagemNro = hospedagemNro;
	}

	public String getHospedagemComplemento() {
		return hospedagemComplemento;
	}

	public void setHospedagemComplemento(String hospedagemComplemento) {
		this.hospedagemComplemento = hospedagemComplemento;
	}

	public String getHospedagemBairro() {
		return hospedagemBairro;
	}

	public void setHospedagemBairro(String hospedagemBairro) {
		this.hospedagemBairro = hospedagemBairro;
	}

	public String getHospedagemCep() {
		return hospedagemCep;
	}

	public void setHospedagemCep(String hospedagemCep) {
		this.hospedagemCep = hospedagemCep;
	}

	public String getHospedagemEmail() {
		return hospedagemEmail;
	}

	public void setHospedagemEmail(String hospedagemEmail) {
		this.hospedagemEmail = hospedagemEmail;
	}

	public String getHospedagemTelefone() {
		return hospedagemTelefone;
	}

	public void setHospedagemTelefone(String hospedagemTelefone) {
		this.hospedagemTelefone = hospedagemTelefone;
	}
	
	
	public HospedagemTipo getHospedagemTipo() {
		return hospedagemTipo;
	}

	public void setHospedagemTipo(HospedagemTipo hospedagemTipo) {
		this.hospedagemTipo = hospedagemTipo;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	


	
}
