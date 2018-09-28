package dubboClient.dubbo.controller;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping({"/redis"})
public class RedisController {
	
	@Resource 
	private RedisTemplate<String, Object> redisTemplate;
	
	
	@RequestMapping(value = "/setUser",method=RequestMethod.GET)
    public String getUser() {
		redisTemplate.opsForValue().set("admin", "水滴范德萨范德萨", 1000, TimeUnit.SECONDS);
        return redisTemplate.opsForValue().get("admin").toString();
    }


}
