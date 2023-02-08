package com.spring.nada.learnspringframework;

import com.spring.nada.learnspringframework.game.GameRunner;
import com.spring.nada.learnspringframework.game.MarioGame;
import com.spring.nada.learnspringframework.game.PacManGame;
import com.spring.nada.learnspringframework.game.SuperContraGame;

public class AppGamingBasic {

	public static void main(String[] args) {
			
				//MarioGame game = new MarioGame();
				//PacManGame game = new PacManGame();
				SuperContraGame game = new SuperContraGame();
				
				GameRunner gameRunner = new GameRunner(game); //game is dependency of gameRunner
				gameRunner.run();
	}

}
