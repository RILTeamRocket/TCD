package bo;

import java.util.logging.Level;
import java.util.logging.Logger;
import manager.PersonnageManager;

/**
 * 
 * @author Anais
 */
public class Ouvrier extends Personnage {

    private int qteRecolte;
    private int qteTransportable;
    private int tempsRecolte;
    private int tempsDepose;
    private boolean dansBase;
    private int baseX; 
    private int baseMaxX;
    private int baseY;
    private int baseMaxY;
    private int mineX; 
    private int mineMaxX;
    private int mineY;
    private int mineMaxY;
    private double distance;
        
    public boolean isDansBase() {
        return dansBase;
    }

    public void setDansBase(boolean dansBase) {
        this.dansBase = dansBase;
    }

    public int getTempsDepose() {
        return tempsDepose;
    }
            
    /**
     * 
     * @param x
     * @param y
     * @param width
     * @param height 
     */
    public Ouvrier(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.qteTransportable = 10;
        this.tempsRecolte = 1;
        this.tempsDepose = 10;
        this.dansBase = true;
        
        for (Batiment base : CPlateau.getCloneBatiment()) {
            if (base instanceof Base) {
                this.baseX = ((Base) base).x;
                this.baseMaxX = ((Base) base).x + ((Base) base).width;
                this.baseY = ((Base) base).y;
                this.baseMaxY = ((Base) base).y + ((Base) base).height;
            }
        }
        TrouverMine();
        
    }

    /**
     * 
     * Calcule la distance entre deux points
     * @param xA : centre x de A
     * @param yA : centre y de A
     * @param xB : centre x de B
     * @param yB : centre y de B
     * @return distance (double)
     */
    private double Distance(int xA, int yA, int xB, int yB) {
        return(Math.sqrt( Math.pow( (xB - xA),2)  + Math.pow( (yB - yA) ,2) ));
    }
    
    /**
     * 
     * Trouve la mine la plus proche de l'ouvrier
     */
    private void TrouverMine(){
        double distanceMax = 100000;
        double distance = 0;
        boolean trouve = false;
        
        int ouvrierCentreX, ouvrierCentreY, mineCentreX, mineCentreY;
        
        ouvrierCentreX = (this.x + this.width) / 2;
        ouvrierCentreY = (this.y + this.height) / 2;
        
        for (Batiment mine : CPlateau.getCloneBatiment()) {
            if ( mine instanceof Mine && !((Mine) mine).estPleine()) {
                mineCentreX = (((Mine) mine).x + ((Mine) mine).width) / 2;
                mineCentreY = (((Mine) mine).y + ((Mine) mine).height) / 2;
                
                distance = Distance(ouvrierCentreX, ouvrierCentreY, mineCentreX, mineCentreY);
                        
//                if ( Math.sqrt( Math.pow( (mineCentreX - ouvrierCentreX),2)  + Math.pow( (mineCentreY - ouvrierCentreY) ,2) ) < distanceMax ) {
                if (distance < distanceMax) {
                    distanceMax = distance;
                    this.mineX = ((Mine) mine).x;
                    this.mineY = ((Mine) mine).y;
                    trouve = true;
                }
            }
        }        
        
        // Tester si non trouvé
        // Que doit-on faire
        if (!trouve) { System.out.println("Mine non trouvée."); }
    }
    
    /**
     * 
     * L'ouvrier récolte les ressources
     * dans une mine
     */
    public void recolter() {
        this.qteRecolte += this.tempsRecolte;
        
        // Gestion de la quantité dans la mine
        for (Batiment mine : CPlateau.getCloneBatiment()) {
            if (mine instanceof Mine)  {
                ((Mine) mine).setResources(this.tempsRecolte);
                if (((Mine) mine).getResources() == 0){
                    ((Mine) mine).setEstVide();
                }
            }
        }
        
        // Doit-on retourner à la base
        if (this.qteRecolte >= this.qteTransportable) {
            PersonnageManager.seDeplacer();
        }
    }

    /**
     * 
     * L'ouvrier dépose sa récolte
     * dans la base
     */
    public void deposer() {
        CPlateau.argent += this.qteRecolte;
        this.qteRecolte = 0;
    }

}

