package br.com.cotiinformatica.dtos;

public class PedidoRequestDto {

	private String cliente;
	private String data;
	private Double valor;
	private String descricao;

	public PedidoRequestDto() {
		// TODO Auto-generated constructor stub
	}

	public PedidoRequestDto(String cliente, String data, Double valor, String descricao) {
		super();
		this.cliente = cliente;
		this.data = data;
		this.valor = valor;
		this.descricao = descricao;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "PedidoRequestDto [cliente=" + cliente + ", data=" + data + ", valor=" + valor + ", descricao="
				+ descricao + "]";
	}

}
