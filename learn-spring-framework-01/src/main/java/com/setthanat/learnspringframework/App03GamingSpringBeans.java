package com.setthanat.learnspringframework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.setthanat.learnspringframework.game.GameRunner;
import com.setthanat.learnspringframework.game.GamingConsole;


public class App03GamingSpringBeans {

	/*
	 * Coupling is how much work is involved in changing something. Tight coupling:
	 * Car and engine Loose coupling: Car and wheels
	 */
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		};

	}

}
