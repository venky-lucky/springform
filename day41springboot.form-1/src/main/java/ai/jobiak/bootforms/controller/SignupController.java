package ai.jobiak.bootforms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ai.jobiak.bootforms.model.Account;
import ai.jobiak.bootforms.repo.UserRepository;


@Controller
public class SignupController {
	@Autowired
	UserRepository repo;
	
public SignupController() {
	
}
public SignupController(UserRepository repo) {
	this.repo = repo;
}
@RequestMapping(path="/test",method=RequestMethod.GET)
public String redirect() {
	return "signup";
}
@RequestMapping(path="/signup", method=RequestMethod.POST)
public String doSignup(@ModelAttribute("acc")Account acc) {
	repo.save(acc);
	return "sucess";
}
}
