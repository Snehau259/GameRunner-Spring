package com.learnspringbootgrp.spring.learnspringframeworkartifact;

import com.learnspringbootgrp.spring.learnspringframeworkartifact.game.GameRunner;
import com.learnspringbootgrp.spring.learnspringframeworkartifact.game.Mariogame;
import com.learnspringbootgrp.spring.learnspringframeworkartifact.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkArtifactApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringFrameworkArtifactApplication.class, args);
//		Mariogame game =new Mariogame();
		SuperContraGame game =new SuperContraGame();
		GameRunner runner=new GameRunner(game);
		runner.run();
	}

}
