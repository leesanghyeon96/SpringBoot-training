package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller		//Spring Boot Framework에 helloController 빈등록
public class HelloController {
	
	// 스프링은 localhost:9898/프로젝트이름..
	// 스프링부트는 localhost:9898/hello (프로젝트이름x)
	@GetMapping("/hello")	//클라이언트가 요청(localhost:9898/hello) 하면 아래의 메소드가 작동
							// ("/hello")에서 /를 빼도 된다.
	@ResponseBody
	public String hello() {		//리턴 : String
		
		return "Hello World - My Web Site";
	}

}
