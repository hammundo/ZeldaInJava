package com.hammond.tiles.statues;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class WhiteStatueTile extends Tile {

    public WhiteStatueTile(int id) {
        super(Assets.white_statue, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
    
}
