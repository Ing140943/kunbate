package com.setthanat.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.setthanat.learnspringframework.game.GameRunner;
import com.setthanat.learnspringframework.game.GamingConsole;
import com.setthanat.learnspringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) { // same parameter will wiring from the game bean
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	
}
