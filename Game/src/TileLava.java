import java.awt.Image;

import javax.swing.ImageIcon;

public class TileLava extends Tile {
	boolean cheker;
	int speed;
	String imageName;

	TileLava(String im) {

		cheker = false;
		speed = 0;
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
