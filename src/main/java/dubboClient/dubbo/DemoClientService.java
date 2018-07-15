package dubboClient.dubbo;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.entity.User;
import com.dubbo.service.DemoService;

@Component
public class DemoClientService {
	
	@Reference(version = "1.0.0")
	private DemoService demoService;
	
	
	public void printName(String name) {
		User u =new User();
		u.setName(name);
		User user=demoService.sayHello(u);
        System.out.println(user.getName()+" "+user.getPassword());
    }

}
