package com.hammond.tiles.misc;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class GraveTile extends Tile {

    public GraveTile(int id) {
        super(Assets.white_grave, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }

}
