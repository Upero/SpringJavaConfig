package aoptest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//@Aspect
public class Audience {

//	@Before("execution(** aoptest.Performance.perform())")
	public void silenceCellPhones() {
		System.out.println("Silecing cell phones");
	}
//	@After("execution(** aoptest.Performance.perform())")
	public void applause() {
		System.out.println("CLAP CLAP CLAP...");
	}
}

