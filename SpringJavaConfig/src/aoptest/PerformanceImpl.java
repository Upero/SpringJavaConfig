package aoptest;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance{
	@Override
	public void perform() {
		System.out.println("performance beginning");
	}
	
}
