package com.spring.nada.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.nada.learnspringframework.game.GameRunner;
import com.spring.nada.learnspringframework.game.GamingConsole;

public class AppGamingSpringBeans {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			
			}

}
}
