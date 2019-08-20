package com.sh.taotao.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
//	@Autowired
//	private ContentService contentService;
	
	@RequestMapping("/index")
	public String showIndex() {

		return "index";
	}

//	@RequestMapping("/index")
//	public String showIndex(Model model) {
//		String adJson = contentService.getContentList();
//		model.addAttribute("ad1", adJson);
//		
//		return "index";
//	}
	
//	@RequestMapping(value="/httpclient/post", method=RequestMethod.POST, 
//			produces=MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
//	@ResponseBody
//	public String testPost(String username, String password) {
//		String result = "username:" + username + "\tpassword:" + password;
//		System.out.println(result);
//		return "username:" + username + ",password:" + password;
//	}
}
