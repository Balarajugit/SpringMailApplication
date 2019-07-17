package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.Message;
import com.app.util.EmailUtil;
import com.app.validator.MailValidator;

@Controller
public class AppController {
	@Autowired
	private EmailUtil util;
	@Autowired
	private MailValidator validator;
	
	@RequestMapping("/mail")
	public String show(Model map) {
		map.addAttribute("message", new Message());
	
		return "Mail";
	}
	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public String send(Model map,@ModelAttribute Message message,Errors errors) {
		
		validator.validate(message, errors);
		if(errors.hasErrors()) {
			return "Mail";
		}
		else {
	util.send(message.getBlindCopy(), message.getCarbonCopy(), message.getEmail(), message.getSubject(), message.getMessage(), message.getAttachment());
		System.out.println("message send sucess fully");
		map.addAttribute("message", new Message());
		map.addAttribute("me", "message sent sucessfully");
		}
		
		return "Mail";
	}
	

}
