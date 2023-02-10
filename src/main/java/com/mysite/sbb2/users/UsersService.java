package com.mysite.sbb2.users;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsersService {

	//JPA 메소드 사용하기 위해 생성자를 통한 객체 자동주입
	private final UsersRepository usersRepository;
	
	//users 테이블의 정보를 가져오는 메소드
	List<Users> getList(){
		
		return this.usersRepository.findAll();
	}
	
	//값을 저장하는 메소드
	public void create (String name, String email, String pass) {
		
		// 넘어오는 값을 setter로 주입
		Users u = new Users();
		u.setName(name);
		u.setPass(pass);
		u.setEmail(email);
		u.setCnt(0);
		u.setRegdate(LocalDateTime.now());
		
		this.usersRepository.save(u);
		
	}
	
}