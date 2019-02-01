package com.hammond.tiles.rocks;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class RedRockTile extends Tile {

    public RedRockTile(int id) {
        super(Assets.red_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }

}
