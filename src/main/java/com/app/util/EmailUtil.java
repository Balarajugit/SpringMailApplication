package com.app.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.Message;

@Component
public class EmailUtil {
	@Autowired
	private JavaMailSender mailSender;
	public boolean send(String[] bcc,String[] cc,String to,String subj,String text,MultipartFile file) {
		
		
		
		boolean flag=false;
		try {
		MimeMessage message1=mailSender.createMimeMessage();
		MimeMessageHelper h=new MimeMessageHelper(message1,file!=null?true:false);
		h.setTo(to);
		h.setFrom("balarajuraju434@gmail.com");
		h.setCc(cc);
		h.setBcc(bcc);
		h.setSubject(subj);
		h.setText(text);
		if(file!=null) {
			h.addAttachment(file.getOriginalFilename(),file);
		}
		mailSender.send(message1);
		flag=true;
	}catch(Exception e)
	{
		flag=false;
		e.printStackTrace();
	}
		return flag;
	}

}
