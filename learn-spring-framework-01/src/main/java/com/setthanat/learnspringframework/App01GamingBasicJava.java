package com.setthanat.learnspringframework;

import com.setthanat.learnspringframework.game.GameRunner;
import com.setthanat.learnspringframework.game.MarioGame;
import com.setthanat.learnspringframework.game.PacmanGame;
import com.setthanat.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	
	/*
	 * Coupling is how much work is involved in changing something.
	 * Tight coupling: Car and engine
	 * Loose coupling: Car and wheels
	 */
	public static void main(String[] args) {
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		
		var game = new PacmanGame(); // 1: Object Creation
		var gameRunner = new GameRunner(game);
			// 2: Object Creation + Wiring of Dependencies
			// Game is a Dependency of GameRunner
		gameRunner.run();

	}

}
