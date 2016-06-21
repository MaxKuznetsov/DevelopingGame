import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class WhichWeapon {
	
	private String weaponImage;
	private int xWeapon;
	private int yWeapon;
	private int speed;
	private int damage;
	

	public WhichWeapon(String wi, int x, int y, int s, int d) {
		weaponImage = wi;
		xWeapon = x;
		yWeapon = y;
		speed=s;
		damage=d;
		
	}

	public Image getImage() {
		ImageIcon a = new ImageIcon(getClass().getResource("img/" + weaponImage + ".png"));
		Image whichImage = a.getImage();
		return whichImage;

	}

	public void setWeaponX(int x) {
		xWeapon = x;
	}

	public int getWeaponX() {
		return xWeapon;
	}

	public void setWeaponY(int y) {
		yWeapon = y;
	}

	public int getWeaponY() {
		return yWeapon;

	}
	public int getSpeed() {
		return speed;

	}
	public int getDamage() {
		return damage;

	}
	public String getStringImage(){
		return weaponImage;
	}
}
