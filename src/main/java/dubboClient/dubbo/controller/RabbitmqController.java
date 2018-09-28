package dubboClient.dubbo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dubboClient.rabbitmq.Sender.FanoutSender;

@RestController
@RequestMapping({"/rabbitmq"})
public class RabbitmqController {
	
	@Resource
	private FanoutSender fanoutSender;
	
	@RequestMapping(value = "/sendMessage",method=RequestMethod.GET)
    public void sendMessage() {
		fanoutSender.send("asdfvxcvxc");
    }

}
