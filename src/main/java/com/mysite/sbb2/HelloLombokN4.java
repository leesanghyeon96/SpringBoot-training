package com.mysite.sbb2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class HelloLombokN4 {

	private String aa;
	private String bb;
	private String cc;
	
	
	public static void main(String[] args) {
		
		HelloLombokN4 lombok = new HelloLombokN4();
		
		lombok.setAa("A");
		lombok.setBb("B");
		lombok.setCc("C");
		
		System.out.println(lombok.getAa());
		System.out.println(lombok.getBb());
		System.out.println(lombok.getCc());
		
		System.out.println(lombok);
		
	}

}