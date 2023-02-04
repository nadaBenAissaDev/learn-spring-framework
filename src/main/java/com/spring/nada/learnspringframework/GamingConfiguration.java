package com.spring.nada.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.nada.learnspringframework.game.GamingConsole;
import com.spring.nada.learnspringframework.game.SuperContraGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game () {
		SuperContraGame game = new SuperContraGame();
		return game;
	}
}
