package bo;

import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author Anais
 */
public class Personnage extends Rectangle {

    public Integer pointVie;

    public Integer getPointVie() {
        return pointVie;
    }

    public void setPointVie(Integer pointVie) {
        this.pointVie = pointVie;
    }

    public Integer vitesse;

    public Integer getVitesse() {
        return vitesse;
    }

    public void setVitesse(Integer vitesse) {
        this.vitesse = vitesse;
    }

    public Integer sensDeplacementX;

    public Integer getSensDeplacementX() {
        return sensDeplacementX;
    }

    public void setSensDeplacementX(Integer sensDeplacementX) {
        this.sensDeplacementX = sensDeplacementX;
    }

    public Integer sensDeplacementY;

    public Integer getSensDeplacementY() {
        return sensDeplacementY;
    }

    public void setSensDeplacementY(Integer sensDeplacementY) {
        this.sensDeplacementY = sensDeplacementY;
    }

    public Integer positionX;

    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Integer PositionY;

    public Integer getPositionY() {
        return PositionY;
    }

    public void setPositionY(Integer PositionY) {
        this.PositionY = PositionY;
    }

    public Color couleur;

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public Personnage(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.sensDeplacementX = 1;
        this.sensDeplacementY = 1;
        this.vitesse = 1;
        this.couleur = Color.RED;
    }

}
