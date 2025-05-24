package br.com.cotiinformatica.services;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cotiinformatica.dtos.PedidoRequestDto;
import br.com.cotiinformatica.dtos.PedidoResponseDto;
import br.com.cotiinformatica.entities.Pedido;
import br.com.cotiinformatica.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired PedidoRepository pedidoRepository;
	
	public PedidoResponseDto criarPedido(PedidoRequestDto request) throws Exception {
		
		var pedido = new Pedido();
		
		pedido.setCliente(request.getCliente());
		pedido.setDataPedido(new SimpleDateFormat("dd/MM/yyyy").parse(request.getData()));
		pedido.setValorTotal(BigDecimal.valueOf(request.getValor()));
		pedido.setDescricao(request.getDescricao());
		
		pedidoRepository.save(pedido);
		
		var response = new PedidoResponseDto();
		
		response.setId(pedido.getId());
		response.setCliente(pedido.getCliente());
		response.setData(new SimpleDateFormat("dd/MM/yyyy").format(pedido.getDataPedido()));
		response.setValor(pedido.getValorTotal().doubleValue());
		response.setDescricao(pedido.getDescricao());
		
		return response;
	}
}
