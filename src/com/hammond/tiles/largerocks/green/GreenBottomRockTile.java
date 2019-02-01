package com.hammond.tiles.largerocks.green;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class GreenBottomRockTile extends Tile {

    public GreenBottomRockTile(int id) {
        super(Assets.green_bottom_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
