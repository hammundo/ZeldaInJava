package com.hammond.tiles.largerocks.red;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class RedTopRockTile extends Tile {

    public RedTopRockTile(int id) {
        super(Assets.red_top_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
