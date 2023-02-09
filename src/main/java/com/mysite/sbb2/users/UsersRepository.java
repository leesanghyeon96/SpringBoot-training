package com.mysite.sbb2.users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {

	List<Users> findAllByOrderByRegdateDesc();
	
	
}
