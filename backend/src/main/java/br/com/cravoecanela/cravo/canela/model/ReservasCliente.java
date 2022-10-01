package br.com.cravoecanela.cravo.canela.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservas_cliente") 
public class ReservasCliente {

   	@Id
	@Column(name="cliente_reserva")
	private Integer clienteReserva;
	@Column(name="cliente_id")
	private Integer clienteId;
	@Column(name="cliente_nome")
	private String clienteNome;
	@Column(name="cidade_nome")
	private String cidadeNome;	
	@Column(name="estado_nome")
	private String estadoSigla;	
	@Column(name="hospedagem_nome")
	private String hospedagemNome;
	@Column(name="data_saida")
	private Date dataSaida;
	@Column(name="data_reserva")
	private Date dataReserva; 
	@Column(name="data_entrada")
	private Date dataEntrada; 	
	@Column(name="quantidade_adultos")
	private Integer quantidadeAdultos;
	@Column(name="quantidade_criancas")
	private Integer quantidadeCriancas;
	@Column(name="valor_diaria")
	private Double valorDiaria;
	@Column(name="dias")
    private Integer dias;
	@Column(name="total")
	private Double total;
	public Integer getClienteReserva() {
		return clienteReserva;
	}
	public void setClienteReserva(Integer clienteReserva) {
		this.clienteReserva = clienteReserva;
	}
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
	public String getCidadeNome() {
		return cidadeNome;
	}
	public void setCidadeNome(String cidadeNome) {
		this.cidadeNome = cidadeNome;
	}
	public String getHospedagemNome() {
		return hospedagemNome;
	}
	public void setHospedagemNome(String hospedagemNome) {
		this.hospedagemNome = hospedagemNome;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
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
	public Double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public Integer getDias() {
		return dias;
	}
	public void setDias(Integer dias) {
		this.dias = dias;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getEstadoSigla() {
		return estadoSigla;
	}
	public void setEstadoSigla(String estadoSigla) {
		this.estadoSigla = estadoSigla;
	}	
	
	    
}
