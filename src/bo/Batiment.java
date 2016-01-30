package bo;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;

/**
 *
 * @author Anais
 */
public class Batiment extends Rectangle {

  public Integer resistance;
  public Color color;
  public Image img = null;
  
  public Batiment(int x, int y, int width, int height){
      super(x, y, width, height);
  }

}

