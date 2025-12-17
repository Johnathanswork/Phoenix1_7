
/*
 * Used by the MapLoader class. Opens the map.txt file, reads and hands the data off to MapLoader class.
 */


package map;

import java.io.*;

public class MapLoader {

	static String rawmap;
	int[] map1D;
	public static int[][][] map3D;
	int maplengthX;
	int maplengthY;
	int maplengthZ;

	private void convertToArray(String rawmap)

	{
		char[] mapchararray = rawmap.toCharArray();

		map1D = new int[rawmap.length() / 4];
		int mapplacer = 0;
		int mapplace = 0;
		String s;

		for (int i = 0; i < (rawmap.length()); i++) {
			mapplacer++;
			if (mapplacer == 4) {
				mapplace = i / 4;

				s = ((String.valueOf(mapchararray[i - 3]))
						+ (String.valueOf(mapchararray[i - 2]))
						+ (String.valueOf(mapchararray[i - 1])) + (String
						.valueOf(mapchararray[i])));

				map1D[mapplace] = Integer.parseInt(s);

				mapplacer = 0;
			}

		}
		maplengthX = map1D[map1D.length - 5];
		maplengthY = map1D[map1D.length - 3];
		maplengthZ = map1D[map1D.length - 1];
	}

	public void rawmapreader() {

		FileReader fr = null;
		try {
			fr = new FileReader(
					"C:\\Users\\saman\\eclipse-workspace\\Phoenix1_7\\src\\map\\map");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);

		String s = "";
		String ss = "";

		try {
			while ((s = br.readLine()) != null) {
				ss = ss + s;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		convertToArray(ss);

		map3D = new int[maplengthX][maplengthY][maplengthZ];
		int counter = 0;
		for (int z = 0; z < maplengthZ; z++) {
			for (int y = 0; y < maplengthY; y++) {
				for (int x = 0; x < maplengthX; x++) {
					map3D[x][y][z] = map1D[counter];
					counter++;
					// System.out.print(map3D[x][y][z]);
				}
				// System.out.println("");
			}
		}
	}

	public int getmap1Dvalue(int counter) {
		return map1D[counter];
	}

	public int getmaplengthX() {
		return maplengthX;
	}

	public int getmaplengthY() {
		return maplengthY;
	}

	public int getmaplengthZ() {
		return maplengthZ;
	}

	public int getmapvalue(int x, int y, int z) {
		int i = map3D[x][y][z];
		return i;
	}

}
