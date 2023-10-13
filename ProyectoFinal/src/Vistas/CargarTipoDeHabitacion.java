/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.TipodeHabitacionData;
import static Vistas.Menu.showJPanel;

/**
 *
 * @author ruben
 */
public class CargarTipoDeHabitacion extends javax.swing.JPanel {

    private TipodeHabitacionData thd;
    
    public CargarTipoDeHabitacion() {
        initComponents();
        thd = new TipodeHabitacionData();
        jtNuevoTipoDeHabitacion.setSelected(true);
        showJPanel(jpContenido, new NuevoTipoDeHabitacion(thd));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpContenido = new javax.swing.JPanel();
        jtNuevoTipoDeHabitacion = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jtEliminarTipoDeHabitacion = new javax.swing.JToggleButton();
        jtEliminarTipoDeHabitacion1 = new javax.swing.JToggleButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jpContenidoLayout = new javax.swing.GroupLayout(jpContenido);
        jpContenido.setLayout(jpContenidoLayout);
        jpContenidoLayout.setHorizontalGroup(
            jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );
        jpContenidoLayout.setVerticalGroup(
            jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        buttonGroup1.add(jtNuevoTipoDeHabitacion);
        jtNuevoTipoDeHabitacion.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jtNuevoTipoDeHabitacion.setText("NUEVO TIPO DE HABITACION");
        jtNuevoTipoDeHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNuevoTipoDeHabitacionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIPO DE HABITACIONES");

        buttonGroup1.add(jtEliminarTipoDeHabitacion);
        jtEliminarTipoDeHabitacion.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jtEliminarTipoDeHabitacion.setText("ELIMINAR TIPO DE HABITACION");
        jtEliminarTipoDeHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEliminarTipoDeHabitacionActionPerformed(evt);
            }
        });

        buttonGroup1.add(jtEliminarTipoDeHabitacion1);
        jtEliminarTipoDeHabitacion1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jtEliminarTipoDeHabitacion1.setText("ACTUALIZAR PRECIO");
        jtEliminarTipoDeHabitacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEliminarTipoDeHabitacion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtNuevoTipoDeHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jtEliminarTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtEliminarTipoDeHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNuevoTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEliminarTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEliminarTipoDeHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jpContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtNuevoTipoDeHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNuevoTipoDeHabitacionActionPerformed
        
        showJPanel(jpContenido, new NuevoTipoDeHabitacion(thd));
        
    }//GEN-LAST:event_jtNuevoTipoDeHabitacionActionPerformed

    private void jtEliminarTipoDeHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEliminarTipoDeHabitacionActionPerformed
        
        showJPanel(jpContenido, new EliminarTipoDeHabitacion(thd));
        
    }//GEN-LAST:event_jtEliminarTipoDeHabitacionActionPerformed

    private void jtEliminarTipoDeHabitacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEliminarTipoDeHabitacion1ActionPerformed
        
        showJPanel(jpContenido, new ActualizarPrecioDeTipoDeHabitacion(thd));
        
    }//GEN-LAST:event_jtEliminarTipoDeHabitacion1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel jpContenido;
    private javax.swing.JToggleButton jtEliminarTipoDeHabitacion;
    private javax.swing.JToggleButton jtEliminarTipoDeHabitacion1;
    private javax.swing.JToggleButton jtNuevoTipoDeHabitacion;
    // End of variables declaration//GEN-END:variables
}
