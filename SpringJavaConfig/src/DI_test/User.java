package DI_test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class User {
	
	@Value("zuoyang")
	private String name ;
	private String title ;
	private Integer age;
	private Cat cat;
	User(Integer age){
		this.age = age;
	}
	public void Sayhello(String name,String name2) {
		System.out.println(name+" and "+name2 +"  hello!");
	}
}
