package com.hammond.tiles.hollowtrees.red;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class RedHollowTreeBottomRightTile extends Tile {

    public RedHollowTreeBottomRightTile(int id) {
        super(Assets.red_hollow_tree_bottom_right, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
