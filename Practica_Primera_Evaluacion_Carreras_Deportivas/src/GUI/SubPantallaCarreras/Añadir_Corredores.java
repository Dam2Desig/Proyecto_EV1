
package GUI.SubPantallaCarreras;

import DTO.*;
import GUI.SubPantallaCarreras.Tablemodels.Tablemodels_Resultados;
import GUI.SubPantallaCorredores.Tablemodels.Tablemodels;
import Logica.Lista_Corredores;
import javax.swing.JOptionPane;

public class Añadir_Corredores extends javax.swing.JDialog {

    /* Creamos un binculo a la lista de corredores */
    private Lista_Corredores lista_Corredores = new Lista_Corredores();
    /* Optenemos la carrera a gestionar */
    private Carrera carrera;
    /* Objeto para gestionar el añadir o el quitar */
    private Corredor c;
    
    /* Creates new form Añador_Corredores */
    public Añadir_Corredores(java.awt.Frame parent, boolean modal, Carrera carrera) {
        super(parent, modal);
        this.carrera = carrera;
        initComponents();
        Actualizar_Tabla_Corredores();
        Actualizar_Tabla_Participantes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonAñadir = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDorsal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCorredores_Apuntados = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nombre del corredor:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Dorsal:");

        jButtonAñadir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAñadir.setText("Añadir");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

        jButtonBorrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jTextFieldNombre.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldDorsal)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAñadir)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAñadir)
                    .addComponent(jButtonBorrar))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Lista corredores:");

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableCorredores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCorredoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCorredores);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Corredores Apuntados:");

        jTableCorredores_Apuntados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableCorredores_Apuntados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCorredores_ApuntadosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableCorredores_Apuntados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableCorredoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCorredoresMouseClicked
        /* Cojemos la fila donde icimos click */
        int seleccion = jTableCorredores.rowAtPoint(evt.getPoint());
        jTextFieldNombre.setText(String.valueOf(jTableCorredores.getValueAt(seleccion, 0)));
        String DNI = String.valueOf(jTableCorredores.getValueAt(seleccion, 1));
        /* Guardamos el resultado de la busqueda en el atributo */
        c = lista_Corredores.Buscar_Resultados(DNI);
    }//GEN-LAST:event_jTableCorredoresMouseClicked

    private void jTableCorredores_ApuntadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCorredores_ApuntadosMouseClicked
        /* Cojemos la fila donde icimos click */
        int seleccion = jTableCorredores_Apuntados.rowAtPoint(evt.getPoint());
        /* Guardamos el resultado de la busqueda en el atributo */
        jTextFieldNombre.setText(String.valueOf(jTableCorredores_Apuntados.getValueAt(seleccion, 0)));
        String DNI = String.valueOf(jTableCorredores_Apuntados.getValueAt(seleccion, 1));
        jTextFieldDorsal.setText(String.valueOf(jTableCorredores_Apuntados.getValueAt(seleccion, 2)));
        /* Guardamos el resultado de la busqueda en el atributo */
        c = lista_Corredores.Buscar_Resultados(DNI);
    }//GEN-LAST:event_jTableCorredores_ApuntadosMouseClicked

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        if(c != null){
            int dorsal = Integer.parseInt(jTextFieldDorsal.getText());
            carrera.Añadir_Participante(new DTO.Lista_Corredores(c, dorsal));
            Actualizar_Tabla_Participantes();
            Actualizar_Campos();
        } else{
            JOptionPane.showMessageDialog(this, "Seleciona un corredor", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAñadirActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        if(c != null){
            carrera.Borrar_Participante(c.getDNI());
            Actualizar_Tabla_Participantes();
            Actualizar_Campos();
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    public void Actualizar_Tabla_Corredores(){
        jTableCorredores.setModel(new Tablemodels(lista_Corredores.getLista_Participantes()));
    }
    
    public void Actualizar_Tabla_Participantes(){
        jTableCorredores_Apuntados.setModel(new Tablemodels_Resultados(carrera.getLista_Corredores()));
    }
    
    public void Actualizar_Campos(){
        jTextFieldNombre.setText("");
        jTextFieldDorsal.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableCorredores;
    private javax.swing.JTable jTableCorredores_Apuntados;
    private javax.swing.JTextField jTextFieldDorsal;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
