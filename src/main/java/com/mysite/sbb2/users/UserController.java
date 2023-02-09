package com.mysite.sbb2.users;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UserController {
	
	private final UsersRepository usersRepository;
	
	@GetMapping("/users_list")
	public String list(Model model) {
		
		List<Users> lu = this.usersRepository.findAll();
		
		model.addAttribute("UsersList", lu);
		
		return "users_list";
	}
	
	
	
}
