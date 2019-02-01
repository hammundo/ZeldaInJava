package com.hammond.graphics;

import java.awt.image.BufferedImage;

public class SpriteSheet {

    private BufferedImage sheet;

    public SpriteSheet(BufferedImage sheet) {
        this.sheet = sheet;
    }

    //Returns a new buffered image cropped from the sprite sheet based on the parameters parsed.
    public BufferedImage crop(int x, int y, int width, int height ) {
        return sheet.getSubimage(x, y, width, height);
    }

}
