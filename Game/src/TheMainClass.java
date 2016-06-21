import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TheMainClass  {
	JFrame frame;
	int wight;
	int height;

	public TheMainClass() {
		GenerateMap gm = new GenerateMap();
		frame = new JFrame();
		frame.setSize(1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
        frame.add(gm);
        
	}

	public static void main(String[] args) {
		TheMainClass theMainClass = new TheMainClass();
	}

	
}
