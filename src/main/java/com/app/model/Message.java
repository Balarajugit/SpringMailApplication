package com.app.model;

import java.util.Arrays;


import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
public class Message {


	private String[] CarbonCopy;

	private String[] BlindCopy;

	private String email;

	private String subject;

	private String message;

	private MultipartFile Attachment;



	public Message() {
		super();
	}



	public Message(String[] carbonCopy, String[] blindCopy, String email, String subject, String message,
			MultipartFile attachment) {
		super();
		CarbonCopy = carbonCopy;
		BlindCopy = blindCopy;
		this.email = email;
		this.subject = subject;
		this.message = message;
		Attachment = attachment;
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
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
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
				+ ", email=" + email + ", subject=" + subject + ", message=" + message + ", Attachment=" + Attachment
				+ "]";
	}



	



}
