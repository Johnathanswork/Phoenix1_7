/*
 * the listener for key presses. When an arrow key is pressed, it returns an appropriate X or Y axis 
 * modifier to the Drawmap class allowing Drawmap to shift the map accordingly.
 */

package input;

import java.awt.event.KeyEvent;

public class KeyBoardLogic {

	public static int dx;
	public static int dy;
	private boolean updated = true;

	public KeyBoardLogic() {
		dx = 0;
		dy = 0;
	}

	public void makefalse() {
		updated = false;
	}

	public int getdx() {
		return dx;
	}

	public int getdy() {
		return dy;
	}

	public void keypressed(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_SPACE) {
			System.out.println("space");

		}

		if (key == KeyEvent.VK_LEFT) {

			dx = 5;
			System.out.println("left");

		}

		if (key == KeyEvent.VK_RIGHT) {
			if (updated == false) {
				dx = -5;
				updated = true;
			}
			System.out.println("right...");
		}

		if (key == KeyEvent.VK_UP) {
			if (updated == false) {
				dy = 5;

			}
		}

		if (key == KeyEvent.VK_DOWN) {
			dy = -5;

			System.out.println("down");
		}
	}

	public void keyreleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {

			if (updated == false) {
				dx = 0;
				updated = true;
			}
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 0;
			updated = true;
		}

		if (key == KeyEvent.VK_UP) {
			dy = 0;
			updated = true;
		}

		if (key == KeyEvent.VK_DOWN) {
			dy = 0;
			updated = true;
		}
	}

}
