package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.beans.DataBean;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.DataBean3;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map) {
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		System.out.println("data1: "+data1);
		System.out.println("data2: "+data2);
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2(@RequestParam Map<String, String> map,
						@RequestParam List<String> data3) {
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		
		System.out.println("data1: "+data1);
		System.out.println("data2: "+data2);
		for(String str : data3) {
			System.out.println("data3: "+str);
		}
		
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(@ModelAttribute DataBean bean) {
		//bean객체에 요청된 값을 자동주입(Autowired) 해라
		
		System.out.println("data1: "+bean.getData1());
		System.out.println("data2: "+bean.getData2());
		System.out.println("data3: "+bean.getData3());
		
		return "result";
	}
	
	
	@GetMapping("/test4")
	public String test4(DataBean2 bean2, DataBean3 bean3) {
		System.out.println("=====DataBean2=====");
		
		System.out.println("data1: "+bean2.getData1());
		System.out.println("data2: "+bean2.getData2());
		for(int item : bean2.getData3()) {
			System.out.println("data3: "+item);
		}
		
		System.out.println("=====DataBean3=====");
		System.out.println("data1: "+bean3.getData1());
		System.out.println("data2: "+bean3.getData2());
		
		return "result";
	}
	
	
}
