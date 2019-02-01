package com.hammond.tiles.trees;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class RedTreeTile extends Tile {

    public RedTreeTile(int id) {
        super(Assets.red_tree, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
