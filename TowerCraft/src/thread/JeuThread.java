package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anais
 */
public class JeuThread {
    
    public static void LaunchRepaintThread(){
        
        new Thread( () -> {
            while(true) {
                Repaint();
            }
        }).start();
        
        new Thread( () -> {
            while(true) {
                Manage();
            }
        }).start();
    }
   
    private static void Manage() {  
        //EntiteManager.gestionMvt();
        try {
            Thread.sleep(50);
        }
        catch (InterruptedException ex) { 
            //Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void Repaint() {            
        
        //UIManager.getWindows().panneau1.repaint();
        try {
            Thread.sleep(1);
        }
        catch (InterruptedException ex) { 
            //Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
