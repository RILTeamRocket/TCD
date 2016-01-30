/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import bo.CPlateau;
import bo.Projectile;

/**
 *
 * @author Anais
 */
public class ProjectileManager {
        
    public static void attaquer(){
        for (Projectile pro : CPlateau.getCloneProjectile()) {
            pro.x += pro.vitesseDeplacementX;
            pro.y += pro.vitesseDeplacementY;
        }      
    }
}
