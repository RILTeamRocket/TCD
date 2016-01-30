/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import bo.Batiment;
import bo.CPlateau;
import bo.Projectile;
import bo.Tourelle;
import java.util.logging.Level;
import java.util.logging.Logger;
import manager.PersonnageManager;
import manager.ProjectileManager;
import manager.UIManager;

/**
 *
 * @author Cyril
 */
public class GameThread {

    public static void LaunchRepaintThread() {
        new Thread(new Runnable() { //Thread peraint fenetre
            @Override
            public void run() {
                while (true) {
                    Repaint();
                }
            }
        }).start();

        new Thread(new Runnable() { //Thread mouvement
            @Override
            public void run() {
                while (true) {
                    Manage();
                }
            }
        }).start();
    }

    private static void Manage() {
        //Personnage gestion
        PersonnageManager.seDeplacer();

        //Batiment gestion
        for (Batiment b : CPlateau.getCloneBatiment()) {
            if (b instanceof Tourelle) {
                Tourelle bTour = (Tourelle) b;
                bTour.cibler();
            }
        }

        //Projectiles gestion
        for (Projectile p : CPlateau.getCloneProjectile()) {
            ProjectileManager.attaquer();
        }
        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void Repaint() {
        UIManager.getFenetre().Jeu.repaint();
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
