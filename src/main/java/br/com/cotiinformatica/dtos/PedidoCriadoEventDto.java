package br.com.cotiinformatica.dtos;

import java.util.Date;
import java.util.UUID;

import br.com.cotiinformatica.entities.Pedido;

public class PedidoCriadoEventDto {

	private UUID id;
	private Date dataGeracao;
	private Pedido pedido;
	
	public PedidoCriadoEventDto() {
		super();
	}
	
	public PedidoCriadoEventDto(UUID id, Date dataGeracao, Pedido pedido) {
		super();
		this.id = id;
		this.dataGeracao = dataGeracao;
		this.pedido = pedido;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Date getDataGeracao() {
		return dataGeracao;
	}
	public void setDataGeracao(Date dataGeracao) {
		this.dataGeracao = dataGeracao;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
