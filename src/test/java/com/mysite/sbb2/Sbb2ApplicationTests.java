package com.mysite.sbb2;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sbb3ApplicationTests {
	
	@Autowired
	private UsersRepository usersRepository;
	
	
	@Test
	public void insert() {
		
		// 임의의 값 5개 insert
		Users u = new Users();
		u.setName("홍길동");
		u.setPass("1234");
		u.setEmail("abc@naver.com");
		u.setRegdate(LocalDateTime.now());
		u.setCnt(1);
		this.usersRepository.save(u);
	}
	
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
