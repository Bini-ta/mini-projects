package com.example.loginform.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exampleloginform.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("/login")
	ModelAndView mav=newModelAndView("login");
	mav.addObject("User",new User());
	return mav;
}
@PostMapping("/login")
public String login@ModelAttribute("user")User user){
	User oauthUser=userService.login(user.getUsername(),user.getPassword());
	System.out.print(oauthUser);
	if(object.nonNull(oauthUser)}
private ModelAndView newModelAndView(String string) {
	// TODO Auto-generated method stub
	return null;

return"redirect:/";
}
else@
return"redirect:/login";
}	

}
