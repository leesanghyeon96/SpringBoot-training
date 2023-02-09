package com.mysite.sbb2;

import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class HelloLombokN4_Re {

	private final String aa;
	private final String bb;
	private String cc;
	
	public static void main(String[] args) {
		
		HelloLombokN4_Re lombok = new HelloLombokN4_Re("A","B");
		
		System.out.println(lombok);

	}

}