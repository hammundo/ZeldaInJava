package com.hammond.tiles.largerocks.white;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class WhiteTopLeftRockTile extends Tile {

    public WhiteTopLeftRockTile(int id) {
        super(Assets.white_top_left_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
