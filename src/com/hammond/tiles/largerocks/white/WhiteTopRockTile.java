package com.hammond.tiles.largerocks.white;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class WhiteTopRockTile extends Tile {

    public WhiteTopRockTile(int id) {
        super(Assets.white_top_right_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
