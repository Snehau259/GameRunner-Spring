package com.learnspringbootgrp.spring.learnspringframeworkartifact.game;

import org.springframework.stereotype.Component;

@Component
public class Mariogame implements GamingConsole {

    public void up()
    {
        System.out.println("up");
    }

    public void down()
    {
        System.out.println("down");
    }

    public void right()
    {
        System.out.println("right");
    }

    public void left()
    {
        System.out.println("left");
    }
}
