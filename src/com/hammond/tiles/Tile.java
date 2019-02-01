package com.hammond.tiles;

import com.hammond.tiles.basements.GreenBasementTile;
import com.hammond.tiles.basements.RedBasementTile;
import com.hammond.tiles.basements.WhiteBasementTile;
import com.hammond.tiles.hollowtrees.red.*;
import com.hammond.tiles.largerocks.green.*;
import com.hammond.tiles.largerocks.red.*;
import com.hammond.tiles.largerocks.white.*;
import com.hammond.tiles.misc.CaveTile;
import com.hammond.tiles.misc.GraveTile;
import com.hammond.tiles.misc.GravelTile;
import com.hammond.tiles.rafts.GreenRaftTile;
import com.hammond.tiles.rafts.RedRaftTile;
import com.hammond.tiles.rafts.WhiteRaftTile;
import com.hammond.tiles.rocks.GreenRockTile;
import com.hammond.tiles.rocks.RedRockTile;
import com.hammond.tiles.rocks.WhiteRockTile;
import com.hammond.tiles.stairs.GreenStairsTile;
import com.hammond.tiles.stairs.RedStairsTile;
import com.hammond.tiles.stairs.WhiteStairsTile;
import com.hammond.tiles.statues.GreenStatueTile;
import com.hammond.tiles.statues.RedStatueTile;
import com.hammond.tiles.statues.WhiteStatueTile;
import com.hammond.tiles.trees.GreenTreeTile;
import com.hammond.tiles.trees.RedTreeTile;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {

    //Tile ID's
    public static Tile[] tiles = new Tile[256];
    //Default Tile
    public static Tile sandTile = new SandTile(0);
    //Rock variants
    public static Tile redRockTile = new RedRockTile(1);
    public static Tile greenRockTile = new GreenRockTile(2);
    public static Tile whiteRockTile = new WhiteRockTile(3);
    //Tree variants
    public static Tile redTree = new RedTreeTile(4);
    public static Tile greenTree = new GreenTreeTile(5);
    //Statue variants
    public static Tile redStatue = new RedStatueTile(6);
    public static Tile greenStatue = new GreenStatueTile(7);
    public static Tile whiteStatue = new WhiteStatueTile(8);
    //Stair variants
    public static Tile redStairs = new RedStairsTile(9);
    public static Tile greenStairs = new GreenStairsTile(10);
    public static Tile whiteStairs = new WhiteStairsTile(11);
    //Basement variants
    public static Tile redBasement = new RedBasementTile(12);
    public static Tile greenBasement = new GreenBasementTile(13);
    public static Tile whiteBasement = new WhiteBasementTile(14);
    //Raft variants
    public static Tile redRaft = new RedRaftTile(15);
    public static Tile greenRaft = new GreenRaftTile(16);
    public static Tile whiteRaft = new WhiteRaftTile(17);
    //Misc tiles
    public static Tile grave = new GraveTile(18);
    public static Tile cave = new CaveTile(19);
    public static Tile gravel = new GravelTile(20);
    //Large red rock tiles
    public static Tile redTopLeftRock = new RedTopLeftRockTile(21);
    public static Tile redTopRock = new RedTopRockTile(22);
    public static Tile redTopRightRock = new RedTopRightRockTile(23);
    public static Tile redBottomLeftRock = new RedBottomLeftRockTile(24);
    public static Tile redBottomRock = new RedBottomRockTile(25);
    public static Tile redBottomRightRock = new RedBottomRightRockTile(26);
    //Large green rock tiles
    public static Tile greenTopLeftRock = new GreenTopLeftRockTile(27);
    public static Tile greenTopRock = new GreenTopRockTile(28);
    public static Tile greenTopRightRock = new GreenTopRightRockTile(29);
    public static Tile greenBottomLeftRock = new GreenBottomLeftRockTile(30);
    public static Tile greenBottomRock = new GreenBottomRockTile(31);
    public static Tile greenBottomRightRock = new GreenBottomRightRockTile(32);
    //Large white rock tiles
    public static Tile whiteTopLeftRock = new WhiteTopLeftRockTile(33);
    public static Tile whiteTopRock = new WhiteTopRockTile(34);
    public static Tile whiteTopRightRock = new WhiteTopRightRockTile(35);
    public static Tile whiteBottomLeftRock = new WhiteBottomLeftRockTile(36);
    public static Tile whiteBottomRock = new WhiteBottomRockTile(37);
    public static Tile whiteBottomRightRock = new WhiteBottomRightRockTile(38);
    //Red hollow tree tiles
    public static Tile redHollowTreeTopLeft = new RedHollowTreeTopLeftTile(39);
    public static Tile redHollowTreeTop = new RedHollowTreeTopTile(40);
    public static Tile redHollowTreeTopRight = new RedHollowTreeTopRightTile(41);
    public static Tile redHollowTreeBottomLeft = new RedHollowTreeBottomLeftTile(42);
    public static Tile redHollowTreebottomRight = new RedHollowTreeBottomRightTile(43);
    //Green hollow tree tiles

    //White hollow tree tiles


    //Water variants
    //Island variants
    //Raft variants
    //Dungeon entrance variants




    //CLASS
    public static final int TILE_WIDTH = 64,
                            TILE_HEIGHT = 64;

    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id) {
        this.texture = texture;
        this.id = id;

        tiles[id] = this;
    }

    public void tick() {

    }

    public void render(Graphics g, int x, int y) {
        g.drawImage(texture, x, y, TILE_WIDTH, TILE_HEIGHT, null);
    }

    public boolean isSolid() {
        return false;
    }

    public int getId() {
        return id;
    }

}
