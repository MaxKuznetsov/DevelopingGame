import java.awt.Image;

import javax.swing.ImageIcon;

public class TileDoor {

	boolean cheker;
	int speed;
	String imageName;

	TileDoor(String im) {

		cheker = false;
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
