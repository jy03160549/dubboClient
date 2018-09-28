package dubboClient.rabbitmq.Sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(String s) {
		System.out.println("Sender : " + s);
		this.rabbitTemplate.convertAndSend("fanoutExchange","", s);
	}

}