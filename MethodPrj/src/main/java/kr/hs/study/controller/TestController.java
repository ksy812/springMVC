package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1() {
		System.out.println("test1");
		return "result";
	}
	
	@RequestMapping(value = "/test2", method = RequestMethod.POST)
	public String test2() {
		System.out.println("test2");
		return "result";
	}
	
	@RequestMapping(value = "/test3", method = {RequestMethod.POST,
			RequestMethod.GET})
	public String test3() {
		System.out.println("test3");
		return "result";
	}
	
	@GetMapping(value="/test4")
	public String test4() {
		System.out.println("test4");
		return "result";
	}
}
