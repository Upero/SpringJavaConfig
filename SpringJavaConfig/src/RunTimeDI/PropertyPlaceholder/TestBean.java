package RunTimeDI.PropertyPlaceholder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(BeanConfig.class)
public class TestBean {
	
	@Autowired
	BeanClass bean;
	
	@Autowired
	Bean2 bean2 ;
	
	
	//使用Enviroment注入外部参数
	@Test
	public void TestBean() {
		System.out.println(bean);
	}
	
	
	//使用注解方式注入外部参数
	@Test
	public void TestBean2() {
		System.out.println(bean2);
	}
	
}
