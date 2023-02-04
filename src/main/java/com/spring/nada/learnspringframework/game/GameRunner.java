package com.spring.nada.learnspringframework.game;

public class GameRunner {
	//GameRunner class will run games
	private GamingConsole game;
	
	//Game runner is tightly coupled with MarioGame
	//Now we will use GamingConsole to be a generic game
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	public void run () {
		System.out.print("Running this Game : " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
