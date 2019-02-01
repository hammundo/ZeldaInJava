package com.hammond.tiles.largerocks.white;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class WhiteBottomRockTile extends Tile {

    public WhiteBottomRockTile(int id) {
        super(Assets.white_bottom_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
