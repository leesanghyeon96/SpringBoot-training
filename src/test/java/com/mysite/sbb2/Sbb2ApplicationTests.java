package com.mysite.sbb2;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb2.users.Users;
import com.mysite.sbb2.users.UsersRepository;

@SpringBootTest
class Sbb2ApplicationTests {
	
	@Autowired
	private UsersRepository usersRepository;
	
	/* Users테이블에 값 1000개 insert */
	@Test
	public void insert1000() {
		Users u = null;
		
		//for 문으로 값 insert
		for(int i = 1; i <= 1000; i++) {
			u = new Users();
			u.setName("이름 - " + i);
			u.setPass("pass" + i);
			u.setEmail("메일주소 - " + i);
			u.setRegdate(LocalDateTime.now());
			u.setCnt(0);
			
			this.usersRepository.save(u);
		}
	}
	
	
	
	/*
	@Test
	public void insert() {
		
		// 임의의 값 5개 insert
		Users u = new Users();
		u.setName("홍길동2");
		u.setPass("12344");
		u.setEmail("abc1@naver.com");
		u.setRegdate(LocalDateTime.now());
		u.setCnt(1);
		this.usersRepository.save(u);
	}
	*/
	
	/*
	@Test
	public void select() {
		List<Users> all = 
				this.usersRepository.findAllByOrderByRegdateDesc();
		
		
		for(int i=0; i<all.size(); i++) {
			Users u = all.get(i);
			System.out.println("=============================");
			System.out.println(u.getIdx());
			System.out.println(u.getName());
			System.out.println(u.getPass());
			System.out.println(u.getEmail());
			System.out.println(u.getRegdate());
			System.out.println(u.getCnt());
			System.out.println("==============================");
		}
		
	}
	*/
	/*
	@Test
	public void update() {
		Optional<Users> u1 = 
				this.jpaRepository.findById(3);
		Users u = u1.get();
		u.setName("이순신");
		u.setEmail("cba@gmail.com");
		this.usersRepository.save(u);
	}
	*/
	/*
	@Test
	public void delete() {
		Optional<Users> u1 = 
				this.jpaRepository.findById(4);
		Users u = u1.get();
		this.usersRepository.delete(u);
	}
	*/
}
