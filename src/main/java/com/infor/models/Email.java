package com.infor.models;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {
	private String host;
	private String socketPort;
	private String socketClass;
	private String auth;
	private String port;
	private String userName;
	private String password;
	private String senderAddress;
	private String toAddress;
	private String subject;
	private String message;
	private Message msg;
	private Properties props;
	
	public Email(){}
	
	public Email(String host,String socketPort,String socketClass,String auth,String port,String username,String password){
		this.host = host;
		this.socketPort = socketPort;
		this.socketClass = socketClass;
		this.auth = auth;
		this.port = port;
		this.userName = username;
		this.password = password;
		setProps();
	}
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getSocketPort() {
		return socketPort;
	}
	public void setSocketPort(String socketPort) {
		this.socketPort = socketPort;
	}
	public String getSocketClass() {
		return socketClass;
	}
	public void setSocketClass(String socketClass) {
		this.socketClass = socketClass;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSenderAddress() {
		return senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}
	public String getToAddress() {
		return toAddress;
	}
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
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

	public Message getMsg() {
		return msg;
	}

	public void setMsg(Message msg) {
		this.msg = msg;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}
	
	private void setProps(){
		props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.socketFactory.port", socketPort);
		props.put("mail.smtp.socketFactory.class", socketClass);
		props.put("mail.smtp.auth", auth);
		props.put("mail.smtp.port", port);
	}
	
	public void send(){
		setProps();
		
		Session session= Session.getDefaultInstance(getProps(),
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(getUserName(),getPassword());
					}
				});
		try {
			msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(getSenderAddress()));
			msg.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(getToAddress()));
			msg.setSubject(getSubject());
			msg.setText(getMessage());

			Transport.send(msg);

			System.out.println("Done sending email");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	
}
