package DI_Interface;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("zuochao")
public class Student1 implements Person{
	
	@Value("zuochao")
	private String name;
	
	@Override
	public void say() {
		System.out.println("i am "+name);
	}
}
