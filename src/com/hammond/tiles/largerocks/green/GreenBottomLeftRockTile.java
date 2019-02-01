package com.hammond.tiles.largerocks.green;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class GreenBottomLeftRockTile extends Tile {

    public GreenBottomLeftRockTile(int id) {
        super(Assets.green_bottom_left_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
