package com.hammond.tiles.largerocks.white;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class WhiteBottomLeftRockTile extends Tile {

    public WhiteBottomLeftRockTile(int id) {
        super(Assets.white_bottom_left_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
