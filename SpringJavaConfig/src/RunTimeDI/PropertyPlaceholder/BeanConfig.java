package RunTimeDI.PropertyPlaceholder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/RunTimeDI/PropertyPlaceholder/Bean.properties")
public class BeanConfig {
	
	@Autowired
	Environment env;
	
	@Bean
	public BeanClass bean() {
		return new BeanClass(env.getProperty("name"),env.getProperty("content"),env.getProperty("age", Integer.class));
	}
	
	@Bean
	public Bean2 bean2() {
		return new Bean2();
	}
	
}
