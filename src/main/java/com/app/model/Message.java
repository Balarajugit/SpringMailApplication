package com.app.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
public class Message {

	
	private String[] CarbonCopy;
	
	private String[] BlindCopy;
	
	private String Email;
	
	private String Subject;
	
	private String Message;
	
	private MultipartFile Attachment;
	
	

	public Message() {
		super();
	}



	public String[] getCarbonCopy() {
		return CarbonCopy;
	}



	public void setCarbonCopy(String[] carbonCopy) {
		CarbonCopy = carbonCopy;
	}



	public String[] getBlindCopy() {
		return BlindCopy;
	}



	public void setBlindCopy(String[] blindCopy) {
		BlindCopy = blindCopy;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public String getSubject() {
		return Subject;
	}



	public void setSubject(String subject) {
		Subject = subject;
	}



	public String getMessage() {
		return Message;
	}



	public void setMessage(String message) {
		Message = message;
	}



	public MultipartFile getAttachment() {
		return Attachment;
	}



	public void setAttachment(MultipartFile attachment) {
		Attachment = attachment;
	}



	@Override
	public String toString() {
		return "Message [CarbonCopy=" + Arrays.toString(CarbonCopy) + ", BlindCopy=" + Arrays.toString(BlindCopy)
				+ ", Email=" + Email + ", Subject=" + Subject + ", Message=" + Message + ", Attachment=" + Attachment
				+ "]";
	}



	
	
	
}
