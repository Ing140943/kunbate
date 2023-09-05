package com.setthanat.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;
	
	public GameRunner(@Qualifier("SuperContraQualifier") GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Game running is: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
