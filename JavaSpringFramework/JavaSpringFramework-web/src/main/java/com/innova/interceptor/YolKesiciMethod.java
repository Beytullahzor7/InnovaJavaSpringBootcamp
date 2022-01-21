package com.innova.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@YolKesiciInterface
@Interceptor
public class YolKesiciMethod {
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		
		System.out.println("previous state" + context.getMethod().getName());
		
		boolean isLogin = true;
		Object isContinue = null;
		if (isLogin) {
			System.out.println("Database için username ve password alanlarını giriniz");
			return null;
		} else {
			try {
				isContinue = context.proceed();
				System.out.println("Giriş Yapılıyor...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isContinue;
	}
	
}
