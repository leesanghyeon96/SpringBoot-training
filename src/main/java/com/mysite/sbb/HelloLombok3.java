package com.mysite.sbb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor	//기본 생성자 :
@ToString
@AllArgsConstructor		//객체 생성시 모든 필드의 값을 입력받아 필드의 초기값을 할당
	//AllArgsConstructor를 사용시 기본생성자는 반드시 있어야한다.
public class HelloLombok3 {

	private String hello;
	private int lombok;
	
	/*
	public HelloLombok3(){} 	<== 기본생성자(@NoArgsConstructor)
	public HelloLombok3(String hello, int lombok){	<== @AllArgsConstructor
		필드의 모든 값을 인풋
		*this.hello = hello;*
		*this.lombok = lombok;*
	}
	*/
	
	public static void main(String[] args) {
		
		//@AllArgsConstructor 테스트
		HelloLombok3 lombok3 = new HelloLombok3("안녕", 55);
		
		//필드의 내용을 출력
		System.out.println(lombok3.getHello());
		System.out.println(lombok3.getLombok());
		//안녕
		//50
		
		//toString() 메소드 호출
		System.out.println(lombok3);
		//HelloLombok3(hello=안녕, lombok=55)
	}

}
