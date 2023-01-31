package com.learnspringbootgrp.spring.learnspringframeworkartifact.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {

    public void up()
    {
        System.out.println("SuperContra up");
    }

    public void down()
    {
        System.out.println("SuperContra down");
    }

    public void right()
    {
        System.out.println("SuperContra right");
    }

    public void left()
    {
        System.out.println("SuperContra left");
    }
}
