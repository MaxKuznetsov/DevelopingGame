import java.awt.*;

import javax.swing.*;

public class Main extends JPanel {
	static final int map[][] = { { 1, 2 }, { 2, 1 } };
	TileLava tl = new TileLava("lava");
	TileFootpath tf = new TileFootpath("footpath");
	private int collums = 2;
	private int rows =2;
	public Main() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(100,100);
		
		
		Graphics g = this.getGraphics();
		for (int i = 0; i <= collums; i++) {
			for (int j = 0; j <= rows; j++) {
				if (map[i][j] == 1) {
					
					g.drawImage(tl.getImageName(), i, j, i * 50, j * 50, null);

				}
				if (map[i][j] == 2) {
					
					g.drawImage(tf.getImageName(), i, j, i * 50, j * 50, null);
				}
				
			}
		}
		frame.add(this);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Main main = new Main();
	}

}
