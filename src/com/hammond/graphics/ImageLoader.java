package com.hammond.graphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageLoader {

    //Takes a parsed filepath (string) and returns a buffered image of the loaded texture.
    public static BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(ImageLoader.class.getResource(path));
        } catch(IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

}
