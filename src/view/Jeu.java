/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bo.Batiment;
import bo.Personnage;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import bo.CPlateau;
import bo.Projectile;

/**
 *
 * @author Cyril
 */
public class Jeu extends JPanel {
    
    public Jeu(){
        super(true);
    }
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.blue);
        g2.fillRect(0, 0, getWidth(), getHeight());
        
        for(Personnage perso : CPlateau.getClonePersonnage()){
            CPlateau.creerPersonnage(g2, perso);
        }
        
        for(Batiment b : CPlateau.getCloneBatiment()){
            CPlateau.creerBatiment(g2, b);
        }
        
        for(Projectile pro : CPlateau.getCloneProjectile()){
            CPlateau.creerProjectile(g2, pro);
        }
        g.dispose();
    }
}
