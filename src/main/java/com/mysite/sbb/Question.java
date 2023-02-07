package com.mysite.sbb;

import java.time.LocalDateTime;	//자신의 시스템의 로컬의 시간설정
import java.util.List;

import jakarta.persistence.CascadeType;	
import jakarta.persistence.Column;
//persistence : JPA에서 사용된 어노테이션
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity		//자바 클래스를 DataBase의 테이블과 매핑된 클래스 : 테이블명 : qeustion
public class Question {	//클래스이름 : 테이블이름
	// 필드의 이름 : 테이블 컬럼의 이름
	@Id	//primary key
	@GeneratedValue (strategy = GenerationType.IDENTITY)	//시퀀시 할당
	//(strategy = GenerationType.IDENTITY) 컬럼의 값 자동증가
	private Integer id; //Primary Key(Question), 시퀀스 (1, 1)
	
	@Column(length =200)		//200자까지 
	private String subject;
	@Column(columnDefinition = "TEXT")	//TEXT : 최대2GB까지 저장가능
	private String content;
	
	private LocalDateTime createDate;
	/*
	@Column(length = 300)	//컬럼추가
	private String addr;
	*/
	
	//Question 테이블에서 Answer 테이블을 참조하는 컬럼을 생성 @onetoMany
	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
		//cascade = CascadeType.REMOVE : 부모테이블의 레코드가 삭제되면 참조테이블도 삭제 되도록
	private List<Answer> answerList;
		// List<Answer> : 타입 , answerList : 변수
		// 여러개의 답변을 List에 담는다.
		// question.getAnswerList(); <= 값 가져오기
		// Answer의 question 컬럼과 반대
	
	
	
	
	
}
