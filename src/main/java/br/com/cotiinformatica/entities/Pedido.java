package br.com.cotiinformatica.entities;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "cliente", length = 150, nullable = false)
	private String cliente;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_pedido", nullable = false)
	private Date dataPedido;

	@Column(name = "valor_total", precision = 10, scale = 2, nullable = false)
	private BigDecimal valorTotal;

	@Column(name = "descricao", length = 250, nullable = false)
	private String descricao;

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(Integer id, String cliente, Date dataPedido, BigDecimal valorTotal, String descricao) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.dataPedido = dataPedido;
		this.valorTotal = valorTotal;
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

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", cliente=" + cliente + ", dataPedido=" + dataPedido + ", valorTotal=" + valorTotal
				+ ", descricao=" + descricao + "]";
	}

}
