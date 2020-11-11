package com.tutorial.main;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class BufferedImageLoader {

		BufferedImage image;
		
		public BufferedImage loadImage(String path) {
			try {
				image = ImageIO.read(getClass().getResourceAsStream("res/sprite_sheet.png"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return image;
		}
}
