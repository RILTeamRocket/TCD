package bo;

import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author stephane
 */
public class Projectile extends Rectangle{

    public Integer vitesseDeplacementX;
    public Integer vitesseDeplacementY;
    
    public Color couleur;
    
    public Projectile (int x, int y) {
        super(x, y, 5, 25);
        this.vitesseDeplacementX = 4;
        this.vitesseDeplacementY = 3;
        this.couleur = Color.ORANGE;
    } 
}