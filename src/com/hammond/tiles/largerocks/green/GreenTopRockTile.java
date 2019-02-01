package com.hammond.tiles.largerocks.green;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class GreenTopRockTile extends Tile {

    public GreenTopRockTile(int id) {
        super(Assets.green_top_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
