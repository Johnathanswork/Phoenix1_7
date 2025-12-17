/*
 * This is meant to eventually be the core class to bring everything together. Right now, there isn't much to it.
 * The main class is currently GuiFrame.java in the gui package.
 * 
 * When executed, a frame loads, draws a map based on an array populated by a .txt file.
 * It then loads a character on screen. The character can be moved my pressing the arrow keys.
 * 
 * The sprites aren't super professional as I made them just to have something to work with, but also something original.
 */


package gamelogic;

import map.*;

public class GameLogic extends Thread {

	MapLoader maploader = new MapLoader();

	public GameLogic(String str) {
		super(str);
	}

	@Override
	public void run() {
		System.out.println("Gamelogic is running.");
		maploader.rawmapreader();

	}

}
