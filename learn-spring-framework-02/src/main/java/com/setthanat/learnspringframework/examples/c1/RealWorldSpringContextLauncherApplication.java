package com.setthanat.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {

	/*
	 * Coupling is how much work is involved in changing something. Tight coupling:
	 * Car and engine Loose coupling: Car and wheels
	 */
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class)) {
		
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			System.out.println(
					context.getBean(BusinessCalculationService.class).findMax());
		}
		;

	}

}