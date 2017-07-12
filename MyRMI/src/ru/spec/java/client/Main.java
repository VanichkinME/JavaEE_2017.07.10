package ru.spec.java.client;

import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import ru.spec.java.ee.DateService;
import ru.spec.java.ee.TestBean;

public class Main {
	public static void main (String[] args) throws NamingException {
		Context ctx = new InitialContext();
		
		TestBean bean = (TestBean) ctx.lookup("test");
		String result = bean.echo("Hello from client");
		
		System.out.println(result);
		
		DateService bean1 = (DateService) ctx.lookup("DateService");
		Date result1 = bean1.getCurrentDate();
		System.out.println(result1);
		
	}

}
