package dubboClient.dubbo.controller;

//import java.math.BigDecimal;
//
//import javax.annotation.Resource;
//
//import org.apache.rocketmq.spring.starter.core.RocketMQTemplate;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import dubboClient.mq.config.OrderPaidEvent;

//@RestController
//@RequestMapping({"/mq"})
//public class MessageController {
//	
//	@Resource
//    private RocketMQTemplate rocketMQTemplate;
//	
//	@RequestMapping(value = "/sendString",method=RequestMethod.GET)
//    public void sendMqString() {
//		// send string
//		rocketMQTemplate.convertAndSend("string-topic", "Hello, World!");
//        
//    }
//	
//	@RequestMapping(value = "/sendSpringMessage",method=RequestMethod.GET)
//    public void sendMqSpringMessage() {
//		// send user-defined object
//		// send string with spring Message
//        rocketMQTemplate.send("string-topic", MessageBuilder.withPayload("Hello, World! I'm from spring message").build());
//
//    }
//	
//	@RequestMapping(value = "/sendOrder",method=RequestMethod.GET)
//    public void sendMqOrder() {
//		// send user-defined object
//		OrderPaidEvent orderPaidEvent =new OrderPaidEvent();
//		orderPaidEvent.setOrderId("T_001");
//		orderPaidEvent.setPaidMoney(new BigDecimal("88.00"));
//		rocketMQTemplate.convertAndSend("order-paid-topic", orderPaidEvent);
//
//    }
//	
//	@RequestMapping(value = "/sendTag",method=RequestMethod.GET)
//    public void Tag() {
//		// send user-defined object
//		rocketMQTemplate.convertAndSend("message-ext-topic:tag0", "I'm from tag0"); //not be consume
//        rocketMQTemplate.convertAndSend("message-ext-topic:tag1", "I'm from tag1");
//
//    }
//
//}
