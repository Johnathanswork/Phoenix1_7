/*
 * Uses "KeyBoardLogic" class to determine if and what keys were pressed. 
 */
package input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyBoard extends KeyAdapter {

	private boolean change = false;
	KeyBoardLogic keyboardlogic = new KeyBoardLogic();

	public int getdx() {
		return keyboardlogic.getdx();
	}

	public int getdy() {
		return keyboardlogic.getdy();
	}

	public boolean getchange() {
		return change;
	}

	@Override
	public void keyPressed(KeyEvent e) {

		keyboardlogic.makefalse();
		keyboardlogic.keypressed(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {

		keyboardlogic.makefalse();
		keyboardlogic.keyreleased(e);
	}
}
