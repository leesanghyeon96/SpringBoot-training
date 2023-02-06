package com.mysite.sbb;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class HelloLombok2 {
	
	//DB와 같아야한다. (DTO)
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regdate;
	private int cnt;
	
	//아래는 위가 잘 만들어졌는지 확인
	public static void main(String[] args) {
		//객체 생성후 테스트
		//1. 객체생성
		HelloLombok2 lombok2 = new HelloLombok2();
		
		//2. set를 통해 필드에 값 주입
		lombok2.setSeq(7);
		lombok2.setTitle("두더지");
		lombok2.setWriter("두더지1");
		lombok2.setContent("두더지는 땅을 판다.");
		lombok2.setRegdate(null);
		lombok2.setCnt(0);
		
		//3. get을 사용해 lombok2객체에 저장된 메모리 필드의 값을 출력
		System.out.println(lombok2.getSeq());
		System.out.println(lombok2.getTitle());
		System.out.println(lombok2.getWriter());
		System.out.println(lombok2.getContent());
		System.out.println(lombok2.getRegdate());
		System.out.println(lombok2.getCnt());
		//출력
		/*
		 	7
			두더지
			두더지1
			두더지는 땅을 판다.
			null
			0
		*/
		
		//4. toString() 메소드 호출 : 객체 자체를 print
		System.out.println(lombok2);
		//출력 : HelloLombok2(seq=1, title=두더지, writer=두더지1,
		//content=두더지는 땅을 판다., regdate=null, cnt=0)
	}
}
