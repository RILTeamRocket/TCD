package bo;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import ressources.ressource;

/**
 *
 * @author Anais
 */
public class Tourelle extends Batiment {

  public Integer pointAttq;

  public Integer pointDef;

  public Integer distAttaque;

    public Tourelle(int x, int y) {
        super(x, y, 50, 50);
        this.color = Color.CYAN;
        try {
            this.img = ImageIO.read(ressource.class.getResource("Tourelle.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cibler() {
        int x = 0; int y = 0;      
        
        x = this.x + (this.width/2);        
        y = this.y + (this.height/2);
        
        CPlateau.AddProjectile(new Projectile(x,y));
    }
}
