package org.example.java4sem3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java MainApp <beanName>");
			return;
		}

		String beanName = args[0];

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Programmer programmer = (Programmer) context.getBean(beanName);

		programmer.doCoding();
	}
}
