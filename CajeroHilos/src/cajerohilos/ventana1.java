/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerohilos;

import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/**
 *
 * @author oscar
 */


public class ventana1 extends javax.swing.JFrame {
    
    ImageIcon Persona = new ImageIcon("Persona.png");
    Image Persona1 = Persona.getImage();
    Image Persona2= Persona1.getScaledInstance(90, 90, SCALE_SMOOTH);
    ImageIcon Persona3 = new ImageIcon(Persona2);
    ImageIcon cajero = new ImageIcon("Cajero.jpg");
    Image cajero1 = cajero.getImage();
    Image cajero2 = cajero1.getScaledInstance(200, 200, SCALE_SMOOTH);
    ImageIcon cajero3 = new ImageIcon(cajero2);

   private class HiloTiempo extends Thread
    {
        @Override
        public void run()
        {
            int cont= 0;
            while (true)
            {
                lblTiempo.setText("Tiempo: "+cont);
                
                try
                {
                    Thread.sleep(5000);
                    
                }
                catch (InterruptedException ex)
                {
                    Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                cont++;
            }
        }
    }
    
    HiloTiempo miHilo;
    Thread miThread;
    
            

    public ventana1() {
        initComponents();
        this.setLocationRelativeTo(null);
        Personaje.setIcon(Persona3);
        lblcajero.setIcon(cajero3);
        miHilo = new HiloTiempo();
        miThread = new Thread(miThread);
        
        miThread.start();
        miHilo.start();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcajero = new javax.swing.JLabel();
        Personaje = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        lblTiempo.setText("Tiempo: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Personaje, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                        .addComponent(lblcajero, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(lblTiempo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lblcajero, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(lblTiempo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Personaje, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        int x=Personaje.getX();
        int y=Personaje.getY();
        if(evt.getKeyChar()=='a')
        {
        x=x-2;
        Personaje.setLocation(x,y);
        }
    
        if(evt.getKeyChar()=='d')
        {
        x=x+10;
        Personaje.setLocation(x, y);
        }
    }//GEN-LAST:event_formKeyPressed

    /*private void formKeyPressed(java.awt.event.KeyEvent evt)
    {
        int x=Personaje.getX();
        int y=Personaje.getY();
        if(evt.getKeyChar()=='a')
        {
        x=x-2;
        Personaje.setLocation(x,y);
        }
    
        if(evt.getKeyChar()=='d')
        {
        x=x+10;
        Personaje.setLocation(x, y);
        }
    }*/
    
    
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
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Personaje;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblcajero;
    // End of variables declaration//GEN-END:variables
}