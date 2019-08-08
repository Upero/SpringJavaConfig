package RunTimeDI.PropertyPlaceholder;

import org.springframework.beans.factory.annotation.Value;

import lombok.ToString;

@ToString
public class Bean2 {
	@Value("${name}")			//从配置文件中找
	private String name;

	@Value("content")			//直接注入字面量
	private String content;
}
