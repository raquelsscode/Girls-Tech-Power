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
@Table(name="cliente_hospedagem") 
public class ClienteHospedagem {
	@Column(name="cliente_hospedagem_id")
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer clienteHospedagemId;	
	@Column(name="data_reserva")
	private Date dataReserva;
	@Column(name="data_entrada")
	private Date dataEntrada;
	@Column(name="data_saida")
	private Date dataSaida;
	@Column(name="quantidade_adultos", nullable = false)
	private Integer quantidadeAdultos;
	@Column(name="quantidade_criancas", nullable = false)
	private Integer quantidadeCriancas;
	@Column(name="valor_diaria", nullable = false)
	private Float valorDiaria;
	@Column(name="valor_total", nullable = false)
	private Float valorTotal;
		
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "hospedagem_id")	
	private Hospedagem hospedagem;

	public Integer getClienteHospedagemId() {
		return clienteHospedagemId;
	}

	public void setClienteHospedagemId(Integer clienteHospedagemId) {
		this.clienteHospedagemId = clienteHospedagemId;
	}

	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Integer getQuantidadeAdultos() {
		return quantidadeAdultos;
	}

	public void setQuantidadeAdultos(Integer quantidadeAdultos) {
		this.quantidadeAdultos = quantidadeAdultos;
	}

	public Integer getQuantidadeCriancas() {
		return quantidadeCriancas;
	}

	public void setQuantidadeCriancas(Integer quantidadeCriancas) {
		this.quantidadeCriancas = quantidadeCriancas;
	}

	public Float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Hospedagem getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}
	
	
}
	
	
	
	
	
	
	
	