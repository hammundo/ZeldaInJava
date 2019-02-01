package com.hammond.tiles.largerocks.red;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class RedBottomRightRockTile extends Tile {

    public RedBottomRightRockTile(int id) {
        super(Assets.red_bottom_right_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
