package com.hammond.tiles.largerocks.red;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class RedBottomRockTile extends Tile {

    public RedBottomRockTile(int id) {
        super(Assets.red_bottom_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
