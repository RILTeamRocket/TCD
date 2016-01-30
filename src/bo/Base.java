package bo;

import java.awt.Color;
import java.io.IOException;
import javax.imageio.ImageIO;
import ressources.ressource;

/**
 *
 * @author Anais
 */
public class Base extends Batiment {

    public Integer qteResources;

    public Base(int x, int y, int width, int height) {
        super(x, y, 100, 100);
        this.color = Color.white;
        try {
            this.img = ImageIO.read(ressource.class.getResource("chateau.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setResources(int qte) {
        this.qteResources += qte;
    }

    public void setResistance(int resist) {
        this.resistance += resist;
    }

}