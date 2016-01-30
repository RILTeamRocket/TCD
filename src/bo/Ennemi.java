package bo;

/**
 *
 * @author Anais
 */
public class Ennemi extends Personnage {

    private int pointAtt;
    private int pointDef;
    private int distAttaque;
    private boolean estVivant;
    private int cibleX; 
    private int cibleMaxX;
    private int cibleY;
    private int cibleMaxY;
    
    public void setPointAtt(int pointAtt) {
        this.pointAtt = pointAtt;
    }

    public void setPointDef(int pointDef) {
        this.pointDef = pointDef;
    }

    public void setDistAttaque(int distAttaque) {
        this.distAttaque = distAttaque;
    }

    public void setEstVivant(boolean estVivant) {
        this.estVivant = estVivant;
    }

    public int getPointAtt() {
        return pointAtt;
    }

    public int getPointDef() {
        return pointDef;
    }

    public int getDistAttaque() {
        return distAttaque;
    }

    public boolean isEstVivant() {
        return estVivant;
    }

    public Ennemi(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.estVivant = true;
        this.cibleX = -1;
        this.cibleMaxX = -1;
        this.cibleY = -1;
        this.cibleMaxY = -1;
        
        for (Batiment base : CPlateau.getCloneBatiment()) {
            if (base instanceof Base) {
                this.cibleX = ((Base) base).x;
                this.cibleMaxX = ((Base) base).x + ((Base) base).width;
                this.cibleY = ((Base) base).y;
                this.cibleMaxY = ((Base) base).y + ((Base) base).height;
            }
        }
    }

    public void attaquer() {
        
    }

}