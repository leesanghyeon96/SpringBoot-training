package com.mysite.sbb2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HelloLombokN4_All {

	private String aa;
	private String bb;
	private String cc;
	
	public static void main(String[] args) {
		
		HelloLombokN4_All lombok = new HelloLombokN4_All("A","B","C");
		
		System.out.println(lombok.getAa());
		System.out.println(lombok.getBb());
		System.out.println(lombok.getCc());
		
		System.out.println(lombok);

	}

}