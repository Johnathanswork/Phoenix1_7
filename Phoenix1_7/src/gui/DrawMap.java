/*
 * After the MapLoader class has opened the map file and 'deciphered' it,
 * then shifts it based on the arrow keys pressed to to show the movement.
 */

package gui;

import java.awt.Graphics2D;

import sprites.SpriteDrawer;
import map.MapLoader;

public class DrawMap {

	private MapLoader maploader = new MapLoader();
	int maplengthX;
	int maplengthY;
	int maplengthZ;
	int dx = 0;
	int dy = 0;
	int xx = 0;

	private SpriteDrawer spritedrawer = new SpriteDrawer();
	private boolean initialized = false;

	public void move(int ddx, int ddy) {
		dx += ddx;
		dy += ddy;
	}

	public void drawmap(Graphics2D g2d) {
		xx++;
		maploader.rawmapreader();
		if (initialized == false) {
			maplengthX = maploader.getmaplengthX();
			maplengthY = maploader.getmaplengthY();
			maplengthZ = maploader.getmaplengthZ();
			initialized = true;
		}

		System.out.println("dx,dy" + dx + "," + dy);

		for (int z = 0; z < maplengthZ; z++) {
			for (int y = 0; y < maplengthY; y++) {
				for (int x = 0; x < maplengthX; x++) {
					if (maploader.getmapvalue(x, y, z) == 0) {
					}// nothing

					if (maploader.getmapvalue(x, y, z) == 1)// tree
					{
						spritedrawer
								.draw(g2d, (x) * 22 - 5 + dx,
										(y) * 22 - 3 + dy,
										"Sprites/tree1.png");
					}

					if (maploader.getmapvalue(x, y, z) == 2)// grass
					{
						spritedrawer
								.draw(g2d, (x + 1) * 22 + dx,
										(y + 1) * 22 + dy,
										"Sprites/Grass.png");
					}

					if (maploader.getmapvalue(x, y, z) == 3)// box
					{
						spritedrawer
								.draw(g2d, ((x + 1) * 22) - 6 + dx,
										((y + 1) * 22) - 6 + dy,
										"Sprites/box.png");
					}

					if (maploader.getmapvalue(x, y, z) == 4)// NewGraveStone
					{
						spritedrawer
								.draw(g2d, ((x + 1) * 22) - 10 + dx,
										((y + 1) * 22) - 10 + dy,
										"Sprites/NewGraveStone.png");
					}

					if (maploader.getmapvalue(x, y, z) == 5)// NewGraveStone
					{
						spritedrawer
								.draw(g2d, ((x + 1) * 22) - 11 + dx,
										((y + 1) * 22) - 11 + dy,
										"Sprites/OldGraveStone.png");
					}

					if (maploader.getmapvalue(x, y, z) == 6)// chest
					{
						spritedrawer
								.draw(g2d, ((x + 1) * 22) - 9 + dx,
										((y + 1) * 22) - 9 + dy,
										"Sprites/chest.png");
					}

					if (maploader.getmapvalue(x, y, z) == 7)// 7
					{
						spritedrawer
								.draw(g2d, ((x + 1) * 22) + dx, ((y + 1) * 22)
										+ dy,
										"Sprites/BushSmall.png");
					}

					if (maploader.getmapvalue(x, y, z) == 8)// 8
					{
						spritedrawer
								.draw(g2d, ((x + 1) * 22) + dx, ((y + 1) * 22)
										+ dy,
										"Sprites/BushGreen.png");
					}

					if (maploader.getmapvalue(x, y, z) == 9)// 9
					{
						spritedrawer
								.draw(g2d, ((x + 1) * 22) + dx, ((y + 1) * 22)
										+ dy,
										"BushDieing.png");
					}

					if (maploader.getmapvalue(x, y, z) == 10)// 10
					{
						spritedrawer
								.draw(g2d, ((x + 1) * 22) + dx, ((y + 1) * 22)
										+ dy,
										"Sprites/BushDead.png");
					}

					if (maploader.getmapvalue(x, y, z) == 11)// 11
					{
						spritedrawer
								.draw(g2d, ((x + 1) * 22) + dx, ((y + 1) * 22)
										+ dy,
										"Sprites/BushDeadSnow.png");
					}

					if (maploader.getmapvalue(x, y, z) == 12)// 11
					{
						spritedrawer
								.draw(g2d, ((x + 1) * 22) + dx, ((y + 1) * 22)
										+ dy,
										"Sprites/water.png");
					}

					if (maploader.getmapvalue(x, y, z) == 13)// 11
					{
						spritedrawer
								.draw(g2d, ((x + 1) * 22) + dx, ((y + 1) * 22)
										+ dy,
										"Sprites/GrassTransitionRight.png");
					}

					if (maploader.getmapvalue(x, y, z) == 14)// 11
					{
						spritedrawer
								.draw(g2d, ((x + 1) * 22) + dx, ((y + 1) * 22)
										+ dy,
										"Sprites/WandBlue.png");
					}

					if (maploader.getmapvalue(x, y, z) == 15)// 11
					{
						spritedrawer
								.draw(g2d, ((x + 1) * 22 - 10) + dx,
										((y + 1) * 22 - 3) + dy,
										"Sprites/OrbElectric.png");
					}

					// System.out.print(maploader.getmapvalue(x, y, z));

				}
				// System.out.println("");
			}
		}
	}
}
