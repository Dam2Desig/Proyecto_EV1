
package GUI;

import GUI.SubPantallaCarreras.Carreras_sin_Realizar;
import GUI.SubPantallaCorredores.Corredores;
import GUI.IMG.Imajen_Fondo;
import Logica.*;

public class Pantalla_Principal extends javax.swing.JFrame {
    
    /* Creamos un vinculo a la clase Imajen_Fondo para establecer el fondo de pantalla */
    Imajen_Fondo Fondo = new Imajen_Fondo();
    /* Creamos un vinculo para la persistencia de datos de los corredores */
    Persistencia_Datos_Corredores PDCorredores = new Persistencia_Datos_Corredores();
    /*  Creamos un vinculo para la persistencia de datos de los carreras */
    Persistencia_Datos_Carreras PDCarreras = new Persistencia_Datos_Carreras();
    
    /* Creates new form Pantalla_Principal */    
    public Pantalla_Principal() {
        // Establecemos el fondo
        this.setContentPane(Fondo);
        // Importamos datos de los corredores
        PDCorredores.Cargar_Corredores();
        // Importamos los datos de las carreras
        PDCarreras.Cargar_Carreras();
        // Inicializamos los componentes
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

        jLabel_Nombre_App = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonGestion_Corredores = new javax.swing.JButton();
        jButtonGestion_Carreras_Sin_Realizar = new javax.swing.JButton();
        jButton_Carreras_Realizadas = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel_Nombre_App.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel_Nombre_App.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Nombre_App.setText("Eventos deportivos");

        jPanel1.setOpaque(false);

        jButtonGestion_Corredores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonGestion_Corredores.setText("Gestionar Corredores");
        jButtonGestion_Corredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestion_CorredoresActionPerformed(evt);
            }
        });

        jButtonGestion_Carreras_Sin_Realizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonGestion_Carreras_Sin_Realizar.setText("Gestion Carreras sin Realizar");
        jButtonGestion_Carreras_Sin_Realizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestion_Carreras_Sin_RealizarActionPerformed(evt);
            }
        });

        jButton_Carreras_Realizadas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_Carreras_Realizadas.setText("Gestion Carreras Realizadas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGestion_Corredores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGestion_Carreras_Sin_Realizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Carreras_Realizadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonGestion_Corredores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonGestion_Carreras_Sin_Realizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Carreras_Realizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jButton_Salir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_Salir.setText("Salir");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                        .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_Nombre_App, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Nombre_App, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Este metodo nos abrira la pantalla de Gestion de Corredores */
    
    private void jButtonGestion_CorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestion_CorredoresActionPerformed
        Corredores corredores = new Corredores(this, true);
        corredores.setVisible(true);
    }//GEN-LAST:event_jButtonGestion_CorredoresActionPerformed

    /* Estos metodos sirven para cerrar el programa pero antes guardan los datos en los ficheros correspondientes */
    
    /* Este es un evento de cerrar pestaña con la cruceta superios */
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Guardamos los datos de los corredores y de las carreras
        PDCorredores.Guardar_Corredores();
        PDCarreras.Guardar_Carreras();
        // Cerramos el programa
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    /* Este es el boton de Salir */
    
    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        // Guardamos los datos de los corredores y de las carreras
        PDCorredores.Guardar_Corredores();
        PDCarreras.Guardar_Carreras();
        // Cerramos el programa
        System.exit(0);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    /* Este metodo nos abrira la pantalla de Gestion de Carreras */
    
    private void jButtonGestion_Carreras_Sin_RealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestion_Carreras_Sin_RealizarActionPerformed
        Carreras_sin_Realizar carreras = new Carreras_sin_Realizar(this, true);
        carreras.setVisible(true);
    }//GEN-LAST:event_jButtonGestion_Carreras_Sin_RealizarActionPerformed
    
    /* @param args the command line arguments */
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
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGestion_Carreras_Sin_Realizar;
    private javax.swing.JButton jButtonGestion_Corredores;
    private javax.swing.JButton jButton_Carreras_Realizadas;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel_Nombre_App;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
