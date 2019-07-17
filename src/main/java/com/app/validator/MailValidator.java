package com.app.validator;

import java.util.regex.Pattern;

import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Message;

@Component
public class MailValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Message.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Message m=(Message)target;
		if(!Pattern.matches("[0-9A-Za-z]+[@gmail.com]+", m.getEmail())) {
			errors.rejectValue("email", null, "Enter the valid Email Account");
		}
		if(!Pattern.matches("[0-9A-Za-z-\\s]+", m.getSubject())) {
			errors.rejectValue("subject", null, "Please Enter The Subject And Dont Enter Any Special Symbols");
		}
		if(!Pattern.matches("[0-9A-Za-z-\\s]+", m.getMessage())) {
			errors.rejectValue("message", null, "Please Enter The Message And Dont Enter Any Special Symbols");
		}
		
	}

}
