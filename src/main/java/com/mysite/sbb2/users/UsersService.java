package com.mysite.sbb2.users;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsersService {

	//JPA 메소드 사용하기 위해 생성자를 통한 객체 자동주입
	private final UsersRepository usersRepository;
	
	/*	//users 테이블의 정보를 가져오는 메소드
	List<Users> getList(){
		
		return this.usersRepository.findAll();
	}*/
	
	//getList메소드 호출시 출력할 page번호를 매개변수로 받음
	public Page<Users> getList(int page){
		
		// 최신글 순서로 정리하기
		List<Sort.Order> sorts = new ArrayList();
		sorts.add(Sort.Order.desc("regdate"));
		
		//pageable 객체에 값을 2개 담아 매개변수로 던짐
		Pageable pageable = PageRequest.of(page, 10, Sort.by(sorts));
		
		
		return this.usersRepository.findAll(pageable);
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