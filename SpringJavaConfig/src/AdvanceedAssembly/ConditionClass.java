package AdvanceedAssembly;

import lombok.ToString;

@ToString
public class ConditionClass {
	
	private String name ;
	
	private String content;

	public ConditionClass(String name,String content) {
		this.name = name ;
		this.content = content;
	}
	
}
