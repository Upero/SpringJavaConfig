package DI_Interface;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
@SpringJUnitConfig(classes=PersonConfig.class)
public class PersonInterfaceTest {

	//@Resource(name="zuochao")
	
	@Autowired
	@Qualifier("zuochao")
	Person student1;
	@Resource(name="zuoyang")
	Person student2;
	
//	@Autowired
//	Person student3;
	
	@Test
	public void testPerson() {
		student1.say();
		student2.say();
	//	student3.say();				//无法确定哪一个所以运行出错
	}
	
}
