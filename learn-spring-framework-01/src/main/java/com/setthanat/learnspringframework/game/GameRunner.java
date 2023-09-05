package com.setthanat.learnspringframework.game;

public class GameRunner {
	GamingConsole game;
	
	public GameRunner(GamingConsole game) {
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
