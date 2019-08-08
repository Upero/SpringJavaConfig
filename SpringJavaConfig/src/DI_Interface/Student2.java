package DI_Interface;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("zuoyang")
public class Student2 implements Person{

	@Value("zuoyang")
	private String name;
	
	@Override
	public void say() {
		System.out.println("i am "+name);
	}

}
