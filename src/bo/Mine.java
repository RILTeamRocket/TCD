package bo;

/**
 *
 * @author Anais
 */
public class Mine extends Batiment {

    private Integer qteResources;
    private boolean estVide = false;
    private int maxOuvrier;
    private int nbOuvrier;

    public int getMaxOuvrier() {
        return maxOuvrier;
    }

    public void setNbOuvrier(int nbOuvrier) {
        this.nbOuvrier = nbOuvrier;
    }

    public int getNbOuvrier() {
        return nbOuvrier;
    }
    
    public Mine(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.maxOuvrier = 5;
        this.nbOuvrier = 0;
    }
    
    public boolean estPleine () {
        return (this.maxOuvrier <= this.nbOuvrier);
    }
  
    public void setResources(int qte) {
        this.qteResources -= qte;
        if (this.qteResources <= 0) {
            this.estVide = true;
        }
    }
  
    public int getResources() {
        return qteResources;
    }
  
    public void setEstVide() {
        this.estVide = true;
    }
  
    public boolean getEstVide() { 
        return this.estVide;
    }

}
