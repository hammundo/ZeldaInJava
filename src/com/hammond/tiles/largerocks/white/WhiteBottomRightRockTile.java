package com.hammond.tiles.largerocks.white;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class WhiteBottomRightRockTile extends Tile {

    public WhiteBottomRightRockTile(int id) {
        super(Assets.white_bottom_right_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
