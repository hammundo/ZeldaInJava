package com.hammond.zelda;

public class Launcher {

    public static void main(String[] args) {

        //Entry point
        Game game = new Game("Zelda Clone (Hammond)", 1024, 640);
        game.start();

    }

}
