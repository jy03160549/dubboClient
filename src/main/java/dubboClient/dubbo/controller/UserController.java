package dubboClient.dubbo.controller;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dubbo.entity.UserEntity;

import dubboClient.dubbo.DemoClientService;

@RestController
@RequestMapping({"/user"})
public class UserController {

	@Autowired
	private DemoClientService demoClientService;
	
	@RequestMapping(value = "/getUser",method=RequestMethod.GET)
	@ResponseBody
    public String getUser() {
		demoClientService.printName("123");
        return "Hello";
    }
	
	@RequestMapping(value = "/getUserByID",method=RequestMethod.GET)
	@ResponseBody
    public String getUserByID() {
		UserEntity user=demoClientService.getUser();
        return "Hello"+user.getUsername() +"  "+user.getPassword();
    }

}
