package com.mysite.sbb2.users;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {

	List<Users> findAllByOrderByRegdateDesc();
	
	// 페이징 처리위한 메소드 선언
	Page<Users> findAll(Pageable pageable);
	
	
}
