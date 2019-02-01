package com.hammond.tiles.largerocks.red;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class RedBottomLeftRockTile extends Tile {

    public RedBottomLeftRockTile(int id) {
        super(Assets.red_bottom_left_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
