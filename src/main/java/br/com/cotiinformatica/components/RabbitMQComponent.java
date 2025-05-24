package br.com.cotiinformatica.components;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.cotiinformatica.dtos.PedidoCriadoEventDto;


@Component
public class RabbitMQComponent {
	
	@Autowired RabbitTemplate rabbitTemplate;
	@Autowired ObjectMapper objectMapper;
	@Autowired Queue queue;

	public void sendMessage(PedidoCriadoEventDto event) throws Exception {
		
		//Serializar os dados em JSON
		var json = objectMapper.writeValueAsString(event);
		
		//Enviar a mensagem para a fila
		rabbitTemplate.convertAndSend(queue.getName(), json);
	}
}
