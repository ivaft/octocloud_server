package com.zlyntlab.octocloud.games;

public class GameNotFoundException extends RuntimeException {

    public GameNotFoundException(){
        super("Could not find the game");
    }
}
