package com.mysite.sbb;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// lombok을 사용해 get,set어노테이션을 만들면 아래에서 따로 만들지 않아도 된다.
	//Outline에서 확인 가능
@Getter		// 필드에 대한 getter를 자동으로 생성해줌
@Setter		// 필드에 대한 setter를 자동으로 생성해줌
@NoArgsConstructor	// 기본생성자를 자동으로 생성해줌 HelloLombok(){}
@ToString			// 객체자체를 출력시 필드의 내용을 자동으로 출력
public class HelloLombok {

	private String hello;		//필드 : private
	private int lombok;
	
	
	public static void main(String[] args) {
		
		// 메인메소드에서는 위에 생성된 클래스의 내용이 롬북이 잘 적용되었는지 확인
		//1. 객체생성 <== 객체생성해야 객체 내부의 필드와 메소드를 사용할 수 있다.
		HelloLombok lombok = new HelloLombok(); //기본생성자 호출
		
		//2. setter를 통해서 필드에 값 입력
		lombok.setHello("안녕하세요. ");
		lombok.setLombok(40);
		
		//3. getter를 통해서 값 출력
		System.out.println(lombok.getHello());
		System.out.println(lombok.getLombok());
		//안녕하세요.
		//40		출력
		
		//4. toString() 메소드 호출
		System.out.println(lombok);
		//HelloLombok(hello=안녕하세요. , lombok=40) 출력
	}

}
