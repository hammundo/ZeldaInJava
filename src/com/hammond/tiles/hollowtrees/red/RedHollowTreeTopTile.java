package com.hammond.tiles.hollowtrees.red;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class RedHollowTreeTopTile extends Tile {

    public RedHollowTreeTopTile(int id) {
        super(Assets.red_hollow_tree_top_left, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
