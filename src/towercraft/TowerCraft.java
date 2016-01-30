package towercraft;

import bo.CPlateau;
import manager.BatimentManager;
import manager.PersonnageManager;
import manager.UIManager;
import threads.GameThread;

/**
 *
 * @author Anais
 */
public class TowerCraft {

    public static void main(String[] args) {
        BatimentManager.init();
        
        PersonnageManager.init();
        
        UIManager.getFenetre().setVisible(true);
        
        GameThread.LaunchRepaintThread(); //Lancement des threads
    }
    
}
