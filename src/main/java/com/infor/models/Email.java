package com.infor.models;

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
	
	
}
