package com.example.demo.game;

import org.springframework.stereotype.Component;

@Component
public class SuperMario implements GamingConsole{
    public void up() {
        System.out.println("Mario goes up");
    }
    public void down() {
        System.out.println("Mario goes down");
    }
    public void left() {
        System.out.println("Mario goes left");
    }
    public void right() {
        System.out.println("Mario goes right");
    }
}
