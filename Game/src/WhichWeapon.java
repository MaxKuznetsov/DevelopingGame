import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class WhichWeapon {
	
	private String catridgeImage;
	private String weaponImage;
	private int xWeapon;
	private int yWeapon;
	private int speed;
	private int damage;
	

	public WhichWeapon(String wi, String ci, int x, int y, int s, int d) {
		weaponImage = wi;
		catridgeImage=ci;
		xWeapon = x;
		yWeapon = y;
		speed=s;
		damage=d;
		
	}

	public Image getCatridgeImage() {
		ImageIcon a = new ImageIcon(getClass().getResource("img/" + catridgeImage + ".png"));
		Image whichImage = a.getImage();
		return whichImage;

	}
   public Image getWeaponImage() {
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
