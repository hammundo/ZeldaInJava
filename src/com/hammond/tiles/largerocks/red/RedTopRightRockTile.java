package com.hammond.tiles.largerocks.red;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class RedTopRightRockTile extends Tile {

    public RedTopRightRockTile(int id) {
        super(Assets.red_top_right_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
