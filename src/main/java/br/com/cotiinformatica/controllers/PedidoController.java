package br.com.cotiinformatica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.PedidoRequestDto;
import br.com.cotiinformatica.dtos.PedidoResponseDto;
import br.com.cotiinformatica.services.PedidoService;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

	@Autowired PedidoService pedidoService;
	
	@PostMapping
	public PedidoResponseDto post(@RequestBody PedidoRequestDto request) throws Exception {
		return pedidoService.criarPedido(request);		
	}
}
