package com.ictec.dpatterns;

public class cricket extends game{
    @Override
    void initialize() {
        System.out.println("initializing game");
    }

    @Override
    void startplay() {
        System.out.println("Starting game");
    }

    @Override
    void endplay() {
        System.out.println("stopping game");
    }

    @Override
    void play() {

    }
}
