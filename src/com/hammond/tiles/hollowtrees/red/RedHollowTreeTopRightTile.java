package com.hammond.tiles.hollowtrees.red;

import com.hammond.graphics.Assets;
import com.hammond.tiles.Tile;

public class RedHollowTreeTopRightTile extends Tile {

    public RedHollowTreeTopRightTile(int id) {
        super(Assets.red_hollow_tree_top_right, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
