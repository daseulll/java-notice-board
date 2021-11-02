package net.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@PostMapping("/signup")
	public String signup(User user) {
		System.out.println("user::" + user);
		return "index";
	}
}
