package com.hammond.tiles.largerocks.red;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class RedTopLeftRockTile extends Tile {

    public RedTopLeftRockTile(int id) {
        super(Assets.red_top_left_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
