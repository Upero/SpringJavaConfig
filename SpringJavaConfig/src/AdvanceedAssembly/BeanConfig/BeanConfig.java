package AdvanceedAssembly.BeanConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import AdvanceedAssembly.ConditionCla;
import AdvanceedAssembly.ConditionClass;

@Configuration
public class BeanConfig {
	@Bean
	@Primary		//首选Bean
	@Conditional(ConditionCla.class)
	public ConditionClass conditionClass() {
		return new ConditionClass("六小龄童","文体两开花");
	}

}
