package com.java.mail.app;
import javax.mail.PasswordAuthentication;


public class UserInformations extends javax.mail.Authenticator {

	public PasswordAuthentication getPasswordAuthentication(){
		String username = "ry@recepyesil.com";  // your email adress
		String password = "*********"; // your e mail password
		
		return new PasswordAuthentication(username, password);
	}
}
