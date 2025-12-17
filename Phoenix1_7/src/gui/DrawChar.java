/*
 * Initially places the character on the map, and rotates character based on direction the player is moving
 */


package gui;

import java.awt.Graphics2D;
import java.io.InputStream;

import sprites.SpriteDrawer;

public class DrawChar {

	
	String charimage;
	SpriteDrawer spritedrawer = new SpriteDrawer();
	private boolean init = false;

	public void drawchar(Graphics2D g2d, int dx, int dy) {

		spritedrawer.draw(g2d, (400 - 11), (200 - 11), anglelogic(dx, dy));
	}

	private String anglelogic(int dx, int dy) {
		if (init == false) {
			charimage = "/home/john/workspace/Phoenix1.5/Sprites/Char1Up.png";
			init = true;
		}

		if (dy > 0) {
			charimage = "C:\\Users\\saman\\eclipse-workspace\\Phoenix1_7\\Sprites\\Char1Up.png";
		}
		if (dx < 0) {
			charimage = "C:\\Users\\saman\\eclipse-workspace\\Phoenix1_7\\Sprites\\Char1Right.png";
		}
		if (dx > 0) {
			charimage = "C:\\Users\\saman\\eclipse-workspace\\Phoenix1_7\\Sprites\\Char1Left.png";
		}
		if (dy < 0) {
			charimage = "C:\\Users\\saman\\eclipse-workspace\\Phoenix1_7\\Sprites\\Char1Down.png";
		}
		return charimage;
	}

}
