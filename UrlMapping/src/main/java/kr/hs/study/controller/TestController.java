package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sub2")
public class TestController {
//	@GetMapping("/test1")
//	public String test1() {
//		
//		return "result";
//	}
	
	@GetMapping("/test3")
	public String test3() {
		return "result";
	}
	
	@GetMapping("/test4")
	public String test4() {
		return "result";
	}
	
	@GetMapping("/test5")
	public String test5() {
		return "result";
	}
	
	@GetMapping("/test6")
	public String test6() {
		return "result";
	}
	
	@GetMapping("/test7")
	public String test7() {
		return "result";
	}
}
