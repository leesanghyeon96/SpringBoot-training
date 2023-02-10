package com.mysite.sbb2.users;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UserController {
	
	private final UsersService usersService;
	
	@GetMapping("/users/list")
	@PostMapping("/users/list")
	public String list(Model model) {
		
		// 비즈니스 로직에서 컨트롤러가 아닌 서비스가 접근하게 변경
		List<Users> lu = this.usersService.getList();
				//this.usersRepository.findAll();
		
		model.addAttribute("UsersList", lu);
		
		return "users_list";
	}
	
	// insert 페이지로 가는 메소드
	@GetMapping("users/insert")
	public String insert(Model model) {
		
		return "users_insert";
	}
	
	
	// insert페이지에서 값 넣기
	@PostMapping("/create")
	public String createUser(Model model, @RequestParam String name,
			@RequestParam String pass ,@RequestParam String email) {
		
		//저장하는 메소드 호출
		this.usersService.create(name, email, pass);
			//create(값 저장) 메소드를 사용하기 위해서 Service에서 값을 저장하는 메소드
				//를 생성해야한다.
		
		
		return String.format("redirect:/users/list");
	}
			
			
			
			
			
}
