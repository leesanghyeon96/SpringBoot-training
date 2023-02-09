package com.mysite.sbb2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@GetMapping("hello")
	@ResponseBody
	public String hello() {
		
		return "hello를 컨트롤러, 매핑, 리스폰스를 통해 출력";
	}
}