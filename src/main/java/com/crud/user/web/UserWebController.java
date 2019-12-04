package com.crud.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserWebController {

	public UserWebController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/web")
    public String list(){
        return "users";
    }
}
