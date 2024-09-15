package com.jdc.demo;

public class LoggerImpl implements Logger, Messenger {

	@Override
	public void log(String message) {
		System.out.println(message);
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
	}
	
	public void sendMail(String message) {
		Logger.super.sendMail(message);
	}

}
