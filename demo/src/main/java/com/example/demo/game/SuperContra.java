package com.example.demo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContra implements GamingConsole{
    public void up() {
        System.out.println("Contra goes up");
    }
    public void down() {
        System.out.println("Contra goes down");
    }
    public void left() {
        System.out.println("Contra goes left");
    }
    public void right() {
        System.out.println("Contra goes right");
    }
}
