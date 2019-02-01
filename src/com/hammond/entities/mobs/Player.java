package com.hammond.entities.mobs;

import com.hammond.graphics.Assets;
import com.hammond.zelda.Game;

import java.awt.Graphics;

public class Player extends Mob {

    private Game game;

    public Player(Game game, float x, float y) {
        super(x, y, Mob.DEFAULT_MOB_WIDTH, Mob.DEFAULT_MOB_HEIGHT);
        this.game = game;
    }

    @Override
    public void tick() {
        getInput();
        move();
    }

    private void getInput() {
        xMove = 0;
        yMove = 0;

        if(game.getKeyManager().up) {
            yMove = -speed;
        } else if(game.getKeyManager().down) {
            yMove = speed;
        } else if(game.getKeyManager().left) {
            xMove = -speed;
        } else if(game.getKeyManager().right) {
            xMove = speed;
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player, (int)x, (int)y, width, height, null);
    }


}
