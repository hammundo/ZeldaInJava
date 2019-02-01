package com.hammond.graphics;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 16;
    private static final int height = 16;

    //Mobs
    public static BufferedImage player, octorok;

    //Tiles
    public static BufferedImage

        red_basement, red_rock, red_tree, red_stairs, red_statue, red_raft,
        red_top_left_rock, red_top_rock, red_top_right_rock,
        red_bottom_left_rock, red_bottom_rock, red_bottom_right_rock,
        red_hollow_tree_top_left, red_hollow_tree_top, red_hollow_tree_top_right,
        red_hollow_tree_bottom_left, red_hollow_tree_bottom_right,

        green_basement, green_rock, green_tree, green_stairs, green_statue, green_raft,
        green_top_left_rock, green_top_rock, green_top_right_rock,
        green_bottom_left_rock, green_bottom_rock, green_bottom_right_rock,
        green_hollow_tree_top_left, green_hollow_tree_top, green_hollow_tree_top_right,
        green_hollow_tree_bottom_left, green_hollow_tree_bottom_right,

        white_basement, white_rock, white_grave, white_stairs, white_statue, white_raft,
        white_top_left_rock, white_top_rock, white_top_right_rock,
        white_bottom_left_rock, white_bottom_rock, white_bottom_right_rock,
        white_hollow_tree_top_left, white_hollow_tree_top, white_hollow_tree_top_right,
        white_hollow_tree_bottom_left, white_hollow_tree_bottom_right,

        sand, gravel, cave;


    public static void init() {

        //Load textures
        SpriteSheet link = new SpriteSheet(ImageLoader.loadImage("/textures/entities/zelda-sprites-link.png"));
        SpriteSheet enemies = new SpriteSheet(ImageLoader.loadImage("/textures/entities/zelda-sprites-enemies.png"));
        SpriteSheet terrain = new SpriteSheet(ImageLoader.loadImage("/textures/zelda-map-overworld-tiles.png"));

        //Mobs
        player = link.crop(0, 0, width, height);
        octorok = enemies.crop(0, 0, width, height);

        //Terrain

        sand = terrain.crop(35, 1, width, height);
        gravel = terrain.crop(239, 1, width, height);

        //Red pallet
        red_basement = terrain.crop(1,1, width, height);
        red_rock = terrain.crop(18, 1, width, height);
        red_tree = terrain.crop(18, 18, width, height);
        red_stairs = terrain.crop(1, 18, width, height);
        red_statue = terrain.crop(35, 18, width, height);
        red_raft = terrain.crop(86 , 120, width, height);
        red_top_left_rock = terrain.crop(1, 35, width, height);
        red_top_rock = terrain.crop(18, 35, width, height);
        red_top_right_rock = terrain.crop(35, 35, width, height);
        red_bottom_left_rock = terrain.crop(1, 52, width, height);
        red_bottom_rock = terrain.crop(18, 52, width, height);
        red_bottom_right_rock = terrain.crop(35, 52, width, height);
        red_hollow_tree_top_left = terrain.crop(52, 1, width, height);
        red_hollow_tree_top = terrain.crop(69, 1, width, height);
        red_hollow_tree_top_right = terrain.crop(86, 1, width, height);
        red_hollow_tree_bottom_left = terrain.crop(52, 18, width, height);
        red_hollow_tree_bottom_right = terrain.crop(86, 18, width, height);

        //Green pallet
        green_basement = terrain.crop(103, 1, width ,height);
        green_rock = terrain.crop(120, 1, width, height);
        green_tree = terrain.crop(120, 18, width, height);
        green_stairs = terrain.crop(103, 18, width, height);
        green_statue = terrain.crop(137, 18, width, height);
        green_raft = terrain.crop(188,120, width, height);
        green_top_left_rock = terrain.crop(103, 35, width, height);
        green_top_rock = terrain.crop(120, 35, width, height);
        green_top_right_rock = terrain.crop(137, 25, width, height);
        green_bottom_left_rock = terrain.crop(103, 52, width, height);
        green_bottom_rock = terrain.crop(120, 52, width, height);
        green_bottom_right_rock = terrain.crop(137, 52, width, height);
        green_hollow_tree_top_left = terrain.crop(154, 1, width, height);
        green_hollow_tree_top = terrain.crop(171, 1, width, height);
        green_hollow_tree_top_right = terrain.crop(188, 1, width, height);
        green_hollow_tree_bottom_left = terrain.crop(154, 18, width, height);
        green_hollow_tree_bottom_right = terrain.crop(188, 18, width, height);

        //White pallet
        white_basement = terrain.crop(205, 1, width, height);
        white_rock = terrain.crop(222, 1, width, height);
        white_grave = terrain.crop(222, 18, width, height);
        white_stairs = terrain.crop(205,18, width, height);
        white_statue = terrain.crop(239, 18, width ,height);
        white_raft = terrain.crop(290,120, width, height);
        white_top_left_rock = terrain.crop(205, 35, width, height);
        white_top_rock = terrain.crop(222, 35, width, height);
        white_top_right_rock = terrain.crop(239, 35, width, height);
        white_bottom_left_rock = terrain.crop(205, 52, width, height);
        white_bottom_rock = terrain.crop(222, 52, width, height );
        white_bottom_right_rock = terrain.crop(239,52, width, height);

        //Misc
        cave = terrain.crop(69, 18, width, height);


    }

}
