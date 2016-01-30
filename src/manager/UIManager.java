/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import view.Plateau;

/**
 *
 * @author Cyril
 */
public class UIManager {
    private static Plateau fenetre;
    
    public static Plateau getFenetre(){
        if(fenetre == null){
            fenetre = new Plateau();
        }
        return fenetre;
    }
}
