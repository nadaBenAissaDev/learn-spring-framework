package com.spring.nada.learnspringframework;

import com.spring.nada.learnspringframework.game.GameRunner;
import com.spring.nada.learnspringframework.game.MarioGame;

public class AppGamingBasic {

	public static void main(String[] args) {
			
				MarioGame game = new MarioGame();
				GameRunner gameRunner = new GameRunner(game);
				gameRunner.run();
	}

}
