package dubboClient.dubbo;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.entity.UserEntity;
import com.dubbo.service.DemoService;

@Component
public class DemoClientService {
	
	@Reference(version = "1.0.0")
	private DemoService demoService;
	
	
	public void printName(String name) {
		UserEntity u =new UserEntity();
		u.setUsername(name);
		UserEntity user=demoService.sayHello(u);
        System.out.println(user.getUsername()+" "+user.getPassword());
    }
	
	public UserEntity getUser() {
		UserEntity user=demoService.getUser();
        System.out.println(user.getUsername()+" "+user.getPassword());
        return user;
    }

}
