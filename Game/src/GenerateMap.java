import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.metal.MetalBorders.PaletteBorder;



public class GenerateMap extends JPanel {

	WhichEntity hero = new WhichEntity("hero", 0, 250, 3);
	WhichEntity paladin = new WhichEntity("paladin", 150, 250, 3);
	WhichWeapon bow = new WhichWeapon("staff","bolt2", -50, 0, 20, 1);
	WhichWeapon magic = new WhichWeapon("staff","bolt04", 100, 100, 10, 2);
	WeaponOfPlayer wop = new WeaponOfPlayer(hero, bow);
	public static final int[][] map = new int[][] {
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2 },
			{ 2, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2 },
			{ 2, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2, 1, 1, 2,
					2, 2, 2, 2 },
			{ 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2,
					2, 2, 2, 2 },
			{ 2, 2, 2, 1, 2, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 1, 1, 2, 1, 2, 2,
					2, 2, 2, 2 },
			{ 3, 1, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2,
					1, 1, 3, 2 },
			{ 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1,
					1, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1,
					1, 2, 2, 2 },
			{ 2, 2, 1, 1, 2, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1,
					1, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 2, 2, 1, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 1, 1,
					1, 2, 2, 2 },
			{ 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2, 2, 2, 1, 2, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1,
					1, 2, 2, 2 },
			{ 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1,
					1, 2, 2, 2 },
			{ 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1,
					1, 2, 2, 2 },
			{ 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1,
					1, 2, 2, 2 },
			{ 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 2, 2, 1, 1, 1, 1,
					1, 2, 2, 2 },
			{ 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 1, 1, 2, 1, 2, 2, 2, 1, 2, 2, 2, 2, 1, 2,
					2, 2, 2, 2 },
			{ 2, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2,
					1, 2, 2, 2 },
			{ 2, 2, 1, 1, 1, 2, 1, 1, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 1, 1, 2,
					1, 1, 1, 2 },
			{ 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2, 1, 1, 1, 1,
					1, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1,
					1, 1, 2, 2 }, };

	public Image trava;
	public Image voda;
	public Image door;
	public Image fountain;
	public Image teleport;
	public Image target;
	public Image patron;
	public Image spell;

	int i;
	int j;

	/** The width in grid cells of our map */
	public static final int rows = 20;
	/** The height in grid cells of our map */
	public static final int collums = 38;
	/** The rendered size of the tile (in pixels) */
	public static final int TILE_SIZE = 50;

	public GenerateMap() {
		addKeyListener(new MoveHero());
		MoveMonster mm = new MoveMonster();
		Thread t1 = new Thread(mm);
		t1.start();
	}

	public void paintComponent(Graphics g) {

		drawMap(g);

		g.drawImage(hero.getImage(), hero.getMonsterX(), hero.getMonsterY(), 49, 49, null);
		g.drawImage(paladin.getImage(), paladin.getMonsterX(), paladin.getMonsterY(), 49, 49, null);
		g.drawImage(bow.getWeaponImage(), hero.getMonsterX()+25, hero.getMonsterY()+25, 29, 29, null);
		g.drawImage(bow.getCatridgeImage(), bow.getWeaponX(), bow.getWeaponY(), 49, 49, null);
		g.drawImage(magic.getWeaponImage(), magic.getWeaponX(), magic.getWeaponY(), 29, 29, null);

		

	}

	public void drawMap(Graphics g) {

		requestFocus();

		DrawMap dm = new DrawMap(rows, collums, TILE_SIZE, map, g, this);
	}

	public boolean detecktForbiddenTile(int xMyHero, int yMyHero) {
		int rowTest;
		int collumsTest;

		collumsTest = Math.round(xMyHero / TILE_SIZE);
		rowTest = Math.round(yMyHero / TILE_SIZE);

		switch (map[rowTest][collumsTest]) {

		case 1: // земля
			return false;
		case 2:// лава
			return true;
		case 3:// дверь(выход)
			return false;
		}

		return false;
	}

	class WeaponOfPlayer implements Runnable {
		WhichEntity entity;
		WhichWeapon weapon;

		public WeaponOfPlayer(WhichEntity e, WhichWeapon p) {
			entity = e;
			weapon = p;
		}

		@Override
		public void run() {
			weapon.setWeaponX(entity.getMonsterX());
			weapon.setWeaponY(entity.getMonsterY());
			while (weapon.getWeaponX() < 10000) {
				weapon.setWeaponX(weapon.getWeaponX() + weapon.getSpeed());
				repaint();
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
				}
			}
		}

		public void setWeapon(WhichWeapon w) {
			weapon = w;
		}

		public WhichWeapon getWeapon() {
			return weapon;
		}
	}

	class MoveHero implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			int yOld, xOld;
			switch (e.getKeyCode()) {

			case KeyEvent.VK_UP:
				yOld = hero.getMonsterY();
				hero.setMonsterY(hero.getMonsterY() - 10);
				if (detecktForbiddenTile(hero.getMonsterX(), hero.getMonsterY())
						|| (detecktForbiddenTile(hero.getMonsterX() + 49, hero.getMonsterY()))) {
					hero.setMonsterY(yOld);
				}
				repaint();
				break;

			case KeyEvent.VK_DOWN:
				yOld = hero.getMonsterY();
				hero.setMonsterY(hero.getMonsterY() + 10);
				if (detecktForbiddenTile(hero.getMonsterX(), hero.getMonsterY() + 49)
						|| (detecktForbiddenTile(hero.getMonsterX() + 49, hero.getMonsterY() + 49))) {
					hero.setMonsterY(yOld);
				}
				repaint();
				break;

			case KeyEvent.VK_RIGHT:
				xOld = hero.getMonsterX();
				hero.setMonsterX(hero.getMonsterX() + 10);
				if (detecktForbiddenTile(hero.getMonsterX() + 49, hero.getMonsterY())
						|| (detecktForbiddenTile(hero.getMonsterX() + 49, hero.getMonsterY() + 49))) {
					hero.setMonsterX(xOld);

				}
				if (hero.getMonsterX() == magic.getWeaponX() && hero.getMonsterY() == magic.getWeaponY()) {
					bow.setWeaponX(10000);
					hero.addToWeaponList(bow);
					hero.addToWeaponList(magic);
					JFrame weaponChooser = new JFrame("Выбор оружия");
					JButton confirmButton = new JButton("Confirm");
					final JComboBox variants = new JComboBox();

					for (int i = 0; i < hero.getWeaponList().size(); i++) {
						variants.addItem(hero.getStringImageForIndex(i));

					}
					confirmButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							ArrayList<WhichWeapon> weapons = hero.getWeaponList();

							wop.setWeapon(weapons.get(variants.getSelectedIndex()));
						}
					});
					weaponChooser.setSize(300, 300);
					weaponChooser.setLayout(new GridLayout(2, 1));
					weaponChooser.add(variants);
					weaponChooser.add(confirmButton);
					weaponChooser.setAlwaysOnTop(true);
					weaponChooser.setLocationRelativeTo(null);
					weaponChooser.setVisible(true);
				}
				repaint();
				break;

			case KeyEvent.VK_LEFT:
				xOld = hero.getMonsterX();
				hero.setMonsterX(hero.getMonsterX() - 10);
				if (detecktForbiddenTile(hero.getMonsterX(), hero.getMonsterY())
						|| (detecktForbiddenTile(hero.getMonsterX(), hero.getMonsterY() + 49))) {
					hero.setMonsterX(xOld);
				}
				repaint();
				break;

			case KeyEvent.VK_D:

				Thread t2 = new Thread(wop);
				t2.start();
				repaint();
				break;

			}
		}

		@Override
		public void keyReleased(KeyEvent e) {

		}

		@Override
		public void keyTyped(KeyEvent e) {

		}

	}

	class MoveMonster implements Runnable {

		@Override
		public void run() {
			while (true) {
				if (paladin.getLife() != 0) {
					while (paladin.getMonsterY() > 50) {
						paladin.setMonsterY(paladin.getMonsterY() - 1);
						repaint();
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
						}
					}
					while (paladin.getMonsterX() > 50) {
						paladin.setMonsterX(paladin.getMonsterX() - 1);
						repaint();
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
						}
					}
					while (paladin.getMonsterX() < 150) {
						paladin.setMonsterX(paladin.getMonsterX() + 1);
						repaint();
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
						}
					}
					while (paladin.getMonsterY() < 250) {
						paladin.setMonsterY(paladin.getMonsterY() + 1);
						repaint();
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
						}
					}
				} else {
					paladin.setMonsterX(10000);
				}
			}
		}

	}

	class ConfirmButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

		}

	}

}
