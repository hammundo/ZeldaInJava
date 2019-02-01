package com.hammond.tiles.largerocks.green;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class GreenBottomRightRockTile extends Tile {

    public GreenBottomRightRockTile(int id) {
        super(Assets.green_bottom_right_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
