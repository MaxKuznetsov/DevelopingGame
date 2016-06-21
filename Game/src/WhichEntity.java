import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;


public class WhichEntity {
	
	private ArrayList<WhichWeapon> weaponList = new ArrayList<WhichWeapon>();
	
	private String monsterImage;
	private int xMonser;
	private int yMonster;
	private int life;

	public WhichEntity(String mi, int x, int y, int l) {
		monsterImage = mi;
		xMonser = x;
		yMonster = y;
		life=l;
	}

	public Image getImage() {
		ImageIcon a = new ImageIcon(getClass().getResource("img/" + monsterImage + ".png"));
		Image whichImage = a.getImage();
		return whichImage;

	}

	public void setMonsterX(int x) {
		xMonser = x;
	}

	public int getMonsterX() {
		return xMonser;
	}

	public void setMonsterY(int y) {
		yMonster = y;
	}

	public int getMonsterY() {
		return yMonster;

	}
	public int getLife() {
		return life;

	}
	public void setLife(int quantity) {
		life=quantity;
	}
	public void addToWeaponList(WhichWeapon bow){
		weaponList.add(bow);
	}
	public void removeFromWeaonList(String weapon) {
		weaponList.remove(weapon);
	}
	public ArrayList<WhichWeapon> getWeaponList(){
		return weaponList;
		
	}
	public String getStringImageForIndex(int index){
		return weaponList.get(index).getStringImage();
		
	}
	
}
