package com.example.demo.game;

import org.springframework.stereotype.Component;

@Component
public class PackMan implements GamingConsole{
    public void up() {
        System.out.println("Packman goes up");
    }
    public void down() {
        System.out.println("Packman goes down");
    }
    public void left() {
        System.out.println("Packman goes left");
    }
    public void right() {
        System.out.println("Packman goes right");
    }
}
