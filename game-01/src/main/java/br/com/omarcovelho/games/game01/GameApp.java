package br.com.omarcovelho.games.game01;

import br.com.omarcovelho.games.engine.GameEngine;

public class GameApp {
    public static void main(String[] args) {
        GameEngine engine = new GameEngine();
        engine.start();
        System.out.println("Game-01 is running!");
    }
}
