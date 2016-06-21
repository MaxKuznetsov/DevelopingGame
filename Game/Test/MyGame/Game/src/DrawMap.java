import java.awt.*;

import javax.swing.*;


public class DrawMap extends JPanel {
	
	TileLava tl = new TileLava("sand");
	TileFootpath tf = new TileFootpath("lava");
	TileDoor td = new TileDoor("closedDoor");
	
	
	
	public DrawMap(int row, int collum,int tile_size,int map[][],Graphics g,JPanel panel) {
		
	    for (int i = 0; i < row; i++) {
			for (int j = 0; j < collum; j++) {
				if (map[i][j] == 1) {
					
					g.drawImage(tl.getImageName(), j*tile_size, i*tile_size,  tile_size, tile_size, null);

				}
				if (map[i][j] == 2) {
					
					g.drawImage(tf.getImageName(), j*tile_size, i*tile_size,  tile_size, tile_size, null);
				}
                if (map[i][j] == 3) {
					
					g.drawImage(td.getImageName(), j*tile_size, i*tile_size,  tile_size, tile_size, null);
				}
				
			}
		}
	 panel.updateUI();
		
	}

	

}

