package com.hammond.tiles.largerocks.green;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class GreenTopRightRockTile extends Tile {

    public GreenTopRightRockTile(int id) {
        super(Assets.green_top_right_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
