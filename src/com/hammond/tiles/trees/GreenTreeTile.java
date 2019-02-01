package com.hammond.tiles.trees;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class GreenTreeTile extends Tile {

    public GreenTreeTile(int id) {
        super(Assets.green_tree, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
