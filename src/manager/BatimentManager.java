/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import bo.Base;
import bo.CPlateau;
import bo.Mine;
import bo.Tourelle;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stephane
 */
public class BatimentManager {
    private static int tiersFenetre = (UIManager.getFenetre().Jeu.getWidth())/3;
    
    public static void init(){        
        
        //calcul de la position
        int minX = tiersFenetre +100;
        int maxX = tiersFenetre*2 -100;
        //-100 pour compter la taille de la base
        int minY = 0;
        int maxY = UIManager.getFenetre().Jeu.getHeight() -100;
        
        Random rand = new Random();
        int randomX = minX + rand.nextInt((maxX - minX) + 1);
        
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(BatimentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         //-100 pour compter la taille de la base
        int randomY = minY + rand.nextInt((maxY - minY) + 1); 
        //ajout de la base
        CPlateau.AddBatiment(new Base(randomX, randomY, 100, 100));
        
        //Ajout d'une mine
        int xmine = UIManager.getFenetre().Jeu.getWidth()-50;
        int ymine = UIManager.getFenetre().Jeu.getHeight()/2-50/2;
        CPlateau.AddBatiment(new Mine(xmine, ymine, 50, 50));
    }
    
    public static void creerTourelle()
    {
        //calcul de la position        
        int minX = 0;
        int maxX = tiersFenetre -50;
        //-75 pour compter la taille de la base
        int minY = 50;
        int maxY = UIManager.getFenetre().Jeu.getHeight() -50;
        
        Random rand = new Random();
        int randomX = minX + rand.nextInt((maxX - minX) + 1);
        
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(BatimentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         //-100 pour compter la taille de la base
        int randomY = minY + rand.nextInt((maxY - minY) + 1); 
        
        CPlateau.AddBatiment(new Tourelle(randomX,randomY));
    }
}
