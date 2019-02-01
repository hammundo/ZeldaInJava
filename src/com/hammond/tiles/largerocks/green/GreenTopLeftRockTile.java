package com.hammond.tiles.largerocks.green;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class GreenTopLeftRockTile extends Tile {

    public GreenTopLeftRockTile(int id) {
        super(Assets.green_top_left_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
