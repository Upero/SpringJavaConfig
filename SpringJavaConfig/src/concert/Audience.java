package concert;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(** concert.Performance.perform(String))")
	public void performance() {}
	
	@Before("performance()")
	public void silenceCellPhones() {
		System.out.println("Audience's phone is shutdown!");
	}
	
	@After("execution(** concert.Performance.perform(String))"+"&& args(str1)")			//与下面参数名要保持一致
	public void sayboogbay(String str1) {
		System.out.println("bay "+str1);
	}
	
}
 