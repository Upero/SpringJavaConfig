package soundsystem;

import org.springframework.stereotype.Component;

@Component
//@Component("")      //为bean设置名字，相当于xml方式中的id
//还有一种注解方式：使用java依赖注入规范中所提到的@Named注解，作用相当于Component
public class SgtPeppers implements CompactDisc{

	private String title = "SgtPeppers";
	
	private String artist = "The Beatles";
	
	@Override
	public void play() {
		
		System.out.println("Playing "+ title +" by "+artist);
		
	}

}
