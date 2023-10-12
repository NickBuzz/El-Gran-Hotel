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
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpContenido = new javax.swing.JPanel();
        jtNuevoTipoDeHabitacion = new javax.swing.JToggleButton();
        jtEliminarTipoDeHabitacion = new javax.swing.JToggleButton();
        jtEliminarTipoDeHabitacion1 = new javax.swing.JToggleButton();

        javax.swing.GroupLayout jpContenidoLayout = new javax.swing.GroupLayout(jpContenido);
        jpContenido.setLayout(jpContenidoLayout);
        jpContenidoLayout.setHorizontalGroup(
            jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jpContenidoLayout.setVerticalGroup(
            jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jtNuevoTipoDeHabitacion.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jtNuevoTipoDeHabitacion.setText("NUEVO TIPO DE HABITACION");
        jtNuevoTipoDeHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNuevoTipoDeHabitacionActionPerformed(evt);
            }
        });

        jtEliminarTipoDeHabitacion.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jtEliminarTipoDeHabitacion.setText("ELIMINAR TIPO DE HABITACION");
        jtEliminarTipoDeHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEliminarTipoDeHabitacionActionPerformed(evt);
            }
        });

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
                .addComponent(jtNuevoTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jtEliminarTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jtEliminarTipoDeHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNuevoTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEliminarTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEliminarTipoDeHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
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
    private javax.swing.JPanel jpContenido;
    private javax.swing.JToggleButton jtEliminarTipoDeHabitacion;
    private javax.swing.JToggleButton jtEliminarTipoDeHabitacion1;
    private javax.swing.JToggleButton jtNuevoTipoDeHabitacion;
    // End of variables declaration//GEN-END:variables
}
