package br.com.cotiinformatica.dtos;

public class PedidoResponseDto {

	private Integer id;
	private String cliente;
	private String data;
	private Double valor;
	private String descricao;

	public PedidoResponseDto() {
		// TODO Auto-generated constructor stub
	}

	public PedidoResponseDto(Integer id, String cliente, String data, Double valor, String descricao) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.data = data;
		this.valor = valor;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "PedidoResponseDto [id=" + id + ", cliente=" + cliente + ", data=" + data + ", valor=" + valor
				+ ", descricao=" + descricao + "]";
	}

}
