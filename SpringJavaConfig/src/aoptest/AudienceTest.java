package aoptest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import aoptest.Performance;

@SpringJUnitConfig(locations="aop.xml")
public class AudienceTest {
	@Autowired
	PerformanceImpl per ;
	
	@Test
	public void testAudience() {
		per.perform();
	}
}
