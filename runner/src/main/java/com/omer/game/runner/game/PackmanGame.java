package com.omer.game.runner.game;

import org.springframework.stereotype.Component;

@Component
public class PackmanGame implements GamingConsole{

    public  void up(){
        System.out.println("PackmanGame up");
    }

    public  void down(){
        System.out.println("PackmanGame down");
    }

    public  void left(){
        System.out.println("PackmanGame left");
    }

    public  void right(){
        System.out.println("PackmanGame right");
    }

}
