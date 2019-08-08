package DI_Interface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
public class PersonConfig {
	
	@Bean(name="zuochao")				//使用Bean的name属性指定Bean的Id
	public Person asdfafd() {			//默认方法名就是Bean的Id
		return new Student1();
	}
	@Bean
	public Person zuoyang() {
		return new Student2();
	}
	
}
