/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Cyril
 */
public class Plateau extends javax.swing.JFrame {

    /**
     * Creates new form Plateau
     */
    public Plateau() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Stats = new java.awt.Panel();
        Experience = new javax.swing.JTextField();
        NbVie = new javax.swing.JTextField();
        Vague = new javax.swing.JTextField();
        Argent = new javax.swing.JTextField();
        NbOuvrier = new javax.swing.JTextField();
        Jeu = new java.awt.Panel();
        Actions = new java.awt.Panel();
        Relancer = new javax.swing.JButton();
        Button_Ouvrier = new javax.swing.JButton();
        Button_Tourelle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Stats.setLayout(new java.awt.GridLayout(2, 0));

        Experience.setText("Experience");
        Stats.add(Experience);

        NbVie.setText("Point de vie");
        Stats.add(NbVie);

        Vague.setText("Vague");
        Stats.add(Vague);

        Argent.setText("Argent");
        Stats.add(Argent);

        NbOuvrier.setText("Nombre d'ouvriers");
        Stats.add(NbOuvrier);

        Jeu.setLayout(new java.awt.GridLayout());

        Actions.setLayout(new java.awt.GridLayout());

        Relancer.setText("Relancer");
        Relancer.setActionCommand("Restart");
        Actions.add(Relancer);

        Button_Ouvrier.setText("Ajouter ouvrier");
        Button_Ouvrier.setActionCommand("AddOuvrier");
        Button_Ouvrier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_OuvrierActionPerformed(evt);
            }
        });
        Actions.add(Button_Ouvrier);

        Button_Tourelle.setText("Ajouter tourelle");
        Button_Tourelle.setActionCommand("AddTourelle");
        Actions.add(Button_Tourelle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jeu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Actions, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addComponent(Stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Jeu, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stats, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Actions, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_OuvrierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_OuvrierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_OuvrierActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Plateau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plateau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plateau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plateau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plateau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel Actions;
    private javax.swing.JTextField Argent;
    private javax.swing.JButton Button_Ouvrier;
    private javax.swing.JButton Button_Tourelle;
    private javax.swing.JTextField Experience;
    public java.awt.Panel Jeu;
    private javax.swing.JTextField NbOuvrier;
    private javax.swing.JTextField NbVie;
    private javax.swing.JButton Relancer;
    private java.awt.Panel Stats;
    private javax.swing.JTextField Vague;
    // End of variables declaration//GEN-END:variables
}
