package com.hammond.tiles.rocks;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class GreenRockTile extends Tile {

    public GreenRockTile(int id) {
        super(Assets.green_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }

}
