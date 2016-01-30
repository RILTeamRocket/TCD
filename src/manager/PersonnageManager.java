/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import bo.Base;
import bo.Batiment;
import bo.Personnage;
import bo.CPlateau;
import bo.Ennemi;
import bo.Ouvrier;
import bo.Mine;

/**
 *
 * @author Cyril
 */
public class PersonnageManager {

    public static void seDeplacer() {
        for (Personnage perso : CPlateau.getClonePersonnage()) {
            for (Batiment batiment : CPlateau.getCloneBatiment()) {
                if (batiment instanceof Base) {
                    if (perso instanceof Ouvrier) {
                        if (!((Ouvrier) perso).isDansBase()) {
                            perso.vitesse = 1;
                            deplaceSensPersonnage(perso, batiment);
                        }
                        if (perso.x <= batiment.x + batiment.width) {//  && perso.y <= batiment.y+batiment.height && perso.y >= batiment.y) {
                            perso.vitesse = 0;
                            ((Ouvrier) perso).setDansBase(true);
                        }
                    }
                    if (perso instanceof Ennemi) {
                        perso.vitesse = 1;
                        deplaceSensPersonnage(perso, batiment);
                        if (perso.x + perso.width >= batiment.x) {
                            perso.vitesse = 0;
                        }
                    }
                }
                if (batiment instanceof Mine) {
                    //Aller vers la mine
                    if (perso instanceof Ouvrier) {
                        if (((Ouvrier) perso).isDansBase()) {
                            perso.vitesse = 1;
                            deplaceSensPersonnage(perso, batiment);
                        }
                        if (perso.x + perso.width >= batiment.x) { // && perso.y <= batiment.y+batiment.height && perso.y >= batiment.y) {
                            perso.vitesse = 0;
                            ((Ouvrier) perso).setDansBase(false);
                        }
                    }
                }
                perso.x += perso.sensDeplacementX * perso.vitesse;
                perso.y += perso.sensDeplacementY * perso.vitesse;
            }
        }
    }

    public static void creerOuvrier() {
        for (Batiment batiment : CPlateau.getCloneBatiment()) {
            if (batiment instanceof Base) {
                CPlateau.AddPersonnage(new Ouvrier(batiment.x + batiment.width, batiment.y + (batiment.height / 2), 20, 20));
            }
        }
    }

    public static void creerEnnemi() {
        for (Batiment batiment : CPlateau.getCloneBatiment()) {
            if (batiment instanceof Base) {
                CPlateau.AddPersonnage(new Ennemi(0, batiment.y + (batiment.height / 2), 20, 20));
            }
        }
    }

    public static void init() {
        PersonnageManager.creerEnnemi();

        PersonnageManager.creerOuvrier();
    }

    private static void deplaceSensPersonnage(Personnage p, Batiment b) {
        if (p.x >= b.x) {
            p.sensDeplacementX = -1;
        }
        if (p.x <= b.x + b.width) {
            p.sensDeplacementX = 1;
        }
        if (p.y >= b.y + (b.height / 2) - (p.height / 2)) {
            p.sensDeplacementY = -1;
        }
        if (p.y <= b.y + (b.height / 2) - (p.height / 2)) {
            p.sensDeplacementY = 1;
        }
    }
}
