import java.awt.Image;

import javax.swing.ImageIcon;

public class TileFootpath extends Tile {
	boolean cheker;
	int speed;
	String imageName;

	TileFootpath(String im) {

		cheker = true;
		speed = 10;
		imageName = im;
	}

	public boolean getCheker() {

		return cheker;

	}

	public int getSpeed() {

		return speed;

	}

	public Image getImageName() {
		ImageIcon b = new ImageIcon(getClass().getResource("img/" + imageName + ".png"));
		Image tile = b.getImage();

		return tile;

	}
}
