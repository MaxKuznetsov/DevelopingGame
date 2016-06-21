import java.awt.Image;

public abstract class Tile {
	boolean cheker;
	int speed;
	String imageName;

  public abstract boolean getCheker();
  
  public abstract int getSpeed();
  
  public abstract Image getImageName();
}
