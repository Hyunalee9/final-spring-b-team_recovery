package com.B.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	//@Resource(name = "testService")
	//private TestServiceImpl testService;

	@RequestMapping(value = "/index2.do")
	public ModelAndView main() {

		ModelAndView mv = new ModelAndView("index");

		//List<Map<String, Object>> list = testService.boardList();

		//mv.addObject("list", list);

		return mv;
	}

	//@GetMapping("/login.do")
	//public String login() {
	//	return "login";
	//}

//	@PostMapping("/login.do")
//	public String login(CommandMap commandMap) {

//		System.out.println(commandMap.getMap());
//		return "redirect:/index.do";
//	}
	

}
