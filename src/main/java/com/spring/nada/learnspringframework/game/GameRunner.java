package com.spring.nada.learnspringframework.game;

public class GameRunner {
	//GameRunner class will run one of the games
	MarioGame game;
	public GameRunner(MarioGame game) {
		this.game = game;
	}
	
	public void run () {
		System.out.print("Running this Game"+ game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
