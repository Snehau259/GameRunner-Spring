package com.learnspringbootgrp.spring.learnspringframeworkartifact;

import com.learnspringbootgrp.spring.learnspringframeworkartifact.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkArtifactApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkArtifactApplication.class, args);
////		Mariogame game =new Mariogame();
//		GamingConsole game=new PacManGame();
////		SuperContraGame game =new SuperContraGame();
//		GameRunner runner=new GameRunner(game);
        GameRunner runner = context.getBean(GameRunner.class);
        runner.run();
    }

}
