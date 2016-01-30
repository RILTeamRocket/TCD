/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import java.awt.Graphics2D;
import java.util.ArrayList;
import manager.UIManager;

/**
 *
 * @author Anais
 */
public class CPlateau {

    private static ArrayList<Batiment> listeBatiments = new ArrayList<>();

    private static ArrayList<Personnage> listePersonnages = new ArrayList<>();
    private static ArrayList<Projectile> listeProjectiles = new ArrayList<>();

    public Integer tpsJeux;

    public Integer experience;

    public static Integer argent;
    
    private static int nbEnemis = 0;
    public static int getNbEnemis() {
        return nbEnemis;
    }
    public static void setNbEnemis(int nbAdd) {
        CPlateau.nbEnemis += nbAdd;
    }
    
    private static int nbOuvrier = 0;
    public static int getNbOuvrier() {
        return nbOuvrier;
    }
    public static void setNbOuvrier(int nbAdd) {
        CPlateau.nbOuvrier += nbAdd;
    }

    public void dessiner() {

    }

    public void rafraichir() {
    }

    public static void creerPersonnage(Graphics2D g, Personnage p) {
        g.setColor(p.couleur);
        g.fillRect(p.x, p.y, p.width, p.height);
        
        /*if (p.vitesse == 0) {
            p.couleur = Color.BLUE;
            g.setColor(p.couleur);
        }*/
    }

    public static void AddPersonnage(Personnage p) {
        listePersonnages.add(p);
        if(p instanceof Ennemi)
        {
            nbEnemis++;
            UIManager.getFenetre().NbEnnemis.setText(Integer.toString(nbEnemis));
        }
        if(p instanceof Ouvrier)
        {
            nbOuvrier++;
            UIManager.getFenetre().NbOuvrier.setText(Integer.toString(nbOuvrier));
        }
    }

    public static void creerBatiment(Graphics2D g, Batiment b) {
        g.setColor(b.color);
        if (b.img != null) {
            g.drawImage(b.img, b.x, b.y, 75, 75, null);
        } else {
            g.fillRect(b.x, b.y, b.width, b.height);
        }

    }

    public static void AddBatiment(Batiment b) {
        listeBatiments.add(b);
    }

    public static ArrayList<Personnage> getClonePersonnage() {
        return (ArrayList<Personnage>) listePersonnages.clone();
    }

    public static ArrayList<Batiment> getCloneBatiment() {
        return (ArrayList<Batiment>) listeBatiments.clone();
    }

    
    public static void creerProjectile(Graphics2D g,Projectile pro)
    {
        g.setColor(pro.couleur);        
        g.fillRect(pro.x, pro.y, pro.width, pro.height);        
    }
    
    public static void AddProjectile(Projectile pro) {
        listeProjectiles.add(pro);
    }
    
    public static ArrayList<Projectile> getCloneProjectile() {
        return (ArrayList<Projectile>) listeProjectiles.clone();
    }
}
