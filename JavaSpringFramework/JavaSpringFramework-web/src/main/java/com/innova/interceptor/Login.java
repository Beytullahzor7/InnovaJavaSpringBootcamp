package com.innova.interceptor;

@YolKesiciInterface
public class Login {
	
	public String isLogin(String data) {
		return "database" + data;
	}
	
}
