package RunTimeDI.PropertyPlaceholder;

import lombok.ToString;

@ToString
public class BeanClass {
	private String name ;
	private String content;
	private Integer age;
	public BeanClass(String name ,String content,Integer age) {
		this.name = name ;
		this.content = content;
		this.age = age ;
	}
}
