package AdvanceedAssembly;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import AdvanceedAssembly.BeanConfig.BeanConfig;

@SpringJUnitConfig(BeanConfig.class)
public class TestCondition {

	@Autowired(required=false)
	private ConditionClass conditionClass ;
	
	@Test
	public void TestConditionClass() {
		System.out.println(conditionClass);
	} 
	

}
