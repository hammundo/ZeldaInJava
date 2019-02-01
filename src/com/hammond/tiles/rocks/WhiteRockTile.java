package com.hammond.tiles.rocks;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class WhiteRockTile extends Tile {

    public WhiteRockTile(int id) {
        super(Assets.white_rock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }

}
