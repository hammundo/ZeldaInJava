package com.hammond.tiles.hollowtrees.red;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class RedHollowTreeBottomLeftTile extends Tile {

    public RedHollowTreeBottomLeftTile(int id) {
        super(Assets.red_hollow_tree_bottom_left, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
