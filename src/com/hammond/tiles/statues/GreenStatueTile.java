package com.hammond.tiles.statues;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class GreenStatueTile extends Tile {

    public GreenStatueTile(int id) {
        super(Assets.green_statue, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
    
}
