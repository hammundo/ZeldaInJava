package com.hammond.tiles.statues;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class RedStatueTile extends Tile {

    public RedStatueTile(int id) {
        super(Assets.red_statue, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }

}
