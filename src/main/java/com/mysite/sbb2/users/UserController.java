package com.mysite.sbb2.users;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import templates.UsersForm;

@RequiredArgsConstructor
@Controller
public class UserController {
	
	private final UsersService usersService;
	
	@GetMapping("/users/list")
	@PostMapping("/users/list")
	public String list(Model model, @RequestParam(value="page", defaultValue="0") int page) {
		
		// 비즈니스 로직에서 컨트롤러가 아닌 서비스가 접근하게 변경
	//	List<Users> lu = this.usersService.getList();
				//this.usersRepository.findAll();
		
		//비즈니스 로직 처리
		Page<Users> paging =
				this.usersService.getList(page);
		
		//model.addAttribute("UsersList", lu);
		
		model.addAttribute("paging", paging);
		
		return "users_list";
	}
	
	
	// insert 페이지로 가는 메소드
	@GetMapping("/users/insert")
	public String insert(UsersForm usersForm) {
		
		return "users_insert";
	}
	
	// insert 페이지로 가는 메소드
	@PostMapping("/create")
	public String insert(
			@Valid UsersForm usersForm, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "users_insert";
		}
		
		this.usersService.create(usersForm.getName(), usersForm.getPass(), usersForm.getEmail());
		
		return "redirect:/users/list";
	}
	
	
	
	
	
	
	
	// insert페이지에서 값 넣기
	/*@PostMapping("/create")
	public String createUser(Model model, @RequestParam String name,
			@RequestParam String pass ,@RequestParam String email) {
		
		//저장하는 메소드 호출
		this.usersService.create(name, email, pass);
			//create(값 저장) 메소드를 사용하기 위해서 Service에서 값을 저장하는 메소드
				//를 생성해야한다.
		
		
		return String.format("redirect:/users/list");
	}*/
			
			
			
			
			
}
