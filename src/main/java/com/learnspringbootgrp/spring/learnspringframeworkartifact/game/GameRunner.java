package com.learnspringbootgrp.spring.learnspringframeworkartifact.game;

public class GameRunner {
//    private Mariogame game;
private SuperContraGame game;
    public GameRunner(SuperContraGame game) {
        this.game=game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
