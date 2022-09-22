package br.com.cravoecanela.cravo.canela.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity  
@Table(name="cliente") 
public class Cliente {
	@Column(name="cliente_id")
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer clienteId;
	@Column(name="cliente_nome", length = 100, nullable = false)
	private String clienteNome;
	@Column(name="cliente_data_nascimento", nullable = false)
	private Date clienteDataNascimento;
	@Column(name="cliente_cpf", length = 14,  nullable = false, unique =true)
	private String clienteCpf;
	@Column(name="cliente_rg", length = 15)
	private String clienteRg;
	@Column(name="cliente_endereco", length = 100)
	private String clienteEndereco;
	@Column(name="cliente_numero", length = 10)
	private String clienteNumero;
	@Column(name="cliente_complemento", length = 50)
	private String clienteComplemento;
	@Column(name="cliente_bairro", length = 50)
	private String clienteBairro;
	@Column(name="cliente_cep", length = 9)
	private String clienteCep;
	@Column(name="cliente_email", length = 50)
	private String clienteEmail;
	@Column(name="cliente_telefone", length = 14)
	private String clienteTelefone;
	
	@ManyToOne
	@JoinColumn(name = "cidade_id")
	//@JsonIgnoreProperties("listaClientes")
	private Cidade cidade;
	
	
	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public Date getClienteDataNascimento() {
		return clienteDataNascimento;
	}

	public void setClienteDataNascimento(Date clienteDataNascimento) {
		this.clienteDataNascimento = clienteDataNascimento;
	}

	public String getClienteCpf() {
		return clienteCpf;
	}

	public void setClienteCpf(String clienteCpf) {
		this.clienteCpf = clienteCpf;
	}

	public String getClienteRg() {
		return clienteRg;
	}

	public void setClienteRg(String clienteRg) {
		this.clienteRg = clienteRg;
	}

	public String getClienteEndereco() {
		return clienteEndereco;
	}

	public void setClienteEndereco(String clienteEndereco) {
		this.clienteEndereco = clienteEndereco;
	}

	public String getClienteNumero() {
		return clienteNumero;
	}

	public void setClienteNumero(String clienteNumero) {
		this.clienteNumero = clienteNumero;
	}

	public String getClienteComplemento() {
		return clienteComplemento;
	}

	public void setClienteComplemento(String clienteComplemento) {
		this.clienteComplemento = clienteComplemento;
	}

	public String getClienteBairro() {
		return clienteBairro;
	}

	public void setClienteBairro(String clienteBairro) {
		this.clienteBairro = clienteBairro;
	}

	public String getClienteCep() {
		return clienteCep;
	}

	public void setClienteCep(String clienteCep) {
		this.clienteCep = clienteCep;
	}

	public String getClienteEmail() {
		return clienteEmail;
	}

	public void setClienteEmail(String clienteEmail) {
		this.clienteEmail = clienteEmail;
	}

	public String getClienteTelefone() {
		return clienteTelefone;
	}

	public void setClienteTelefone(String clienteTelefone) {
		this.clienteTelefone = clienteTelefone;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	

	
}
