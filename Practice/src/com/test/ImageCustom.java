package com.test;

import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageCustom {
	public BufferedImage makeBackgroundTransparent(String imagePath, String strLocatorImage) throws Exception {

		 
		int imageIndex = 0;

		try {
			File file = new File("path/to/your/image.jpg");
			BufferedImage image = ImageIO.read(file);

			BufferedImage transparentImage = new BufferedImage(image.getWidth(), image.getHeight(),BufferedImage.TYPE_INT_ARGB);

			// Define the background color
			Color backgroundColor = null;

			// Find the most common color in the image (background color)
			backgroundColor = findMostCommonColor(image);
			System.out.println("backgroundColor :" + backgroundColor);
			

			if (backgroundColor != null) {
				for (int y = 0; y < image.getHeight(); y++) {
					for (int x = 0; x < image.getWidth(); x++) {
						Color pixelColor = new Color(image.getRGB(x, y));

					//	System.out.println("pixelColor :" + pixelColor);
						
						// Check if the pixel color matches the background color
						if (pixelColor.equals(backgroundColor)) {
							transparentImage.setRGB(x, y, 0x00FFFFFF);
						} 
						else {
							// Preserve the pixel from the original image
							transparentImage.setRGB(x, y, image.getRGB(x, y));
						}
					}
				}

				String result = strLocatorImage.replace(".png", "");
				ImageIO.write(transparentImage, "PNG", new File("" + result + "Transparent.png"));

				System.out.println("Background made transparent successfully.");
			} else {
				System.out.println("Background color not found.");
			}

			return transparentImage;
		} catch (IOException e) {
			e.printStackTrace();
			return null; // Handle errors gracefully
		}
	}

	private static Color findMostCommonColor(BufferedImage image) {
		// Count the occurrences of each color in the image
		int maxCount = 0;
		Color mostCommonColor = null;
		int width = image.getWidth();
		int height = image.getHeight();

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				Color color = new Color(image.getRGB(x, y));

				int count = countOccurrences(image, color);

				if (count > maxCount) {
					maxCount = count;
					mostCommonColor = color;
				}
			}
		}

		return mostCommonColor;
	}

	private static int countOccurrences(BufferedImage image, Color targetColor) {
		int count = 0;
		int width = image.getWidth();
		int height = image.getHeight();

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				Color color = new Color(image.getRGB(x, y));

				if (color.equals(targetColor)) {
					count++;
				}
			}
		}

		return count;
	}
}
