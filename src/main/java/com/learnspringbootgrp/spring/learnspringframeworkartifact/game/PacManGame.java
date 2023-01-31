package com.learnspringbootgrp.spring.learnspringframeworkartifact.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {

    public void up()
    {
        System.out.println("PacManGame up");
    }

    public void down()
    {
        System.out.println("PacManGame down");
    }

    public void right()
    {
        System.out.println("PacManGame right");
    }

    public void left()
    {
        System.out.println("PacManGame left");
    }
}
