package dubboClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@ComponentScan("com.dubbo,dubboClient.*")
@SpringBootApplication
@EnableDubboConfiguration
@EnableCaching
@EnableScheduling
@Configuration
public class ClientApplication {

	 public static void main(String[] args) {

		 SpringApplication.run(ClientApplication.class, args);

	    }
}
