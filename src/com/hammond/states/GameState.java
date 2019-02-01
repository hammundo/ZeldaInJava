package com.hammond.states;

import com.hammond.entities.mobs.Player;
import com.hammond.tiles.Tile;
import com.hammond.worlds.World;
import com.hammond.zelda.Game;

import java.awt.Graphics;

public class GameState extends State {

    private Player player;
    private World testWorld;

    public GameState(Game game) {
        super(game);
        player = new Player(game,440, 320);
        testWorld = new World("resources/worlds/c3.txt");
    }

    @Override
    public void tick() {
        testWorld.tick();
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        testWorld.render(g);

        //Must re rendered last to retain visibility (top most drawing).
        player.render(g);
    }

}
