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

        javax.swing.GroupLayout jpContenidoLayout = new javax.swing.GroupLayout(jpContenido);
        jpContenido.setLayout(jpContenidoLayout);
        jpContenidoLayout.setHorizontalGroup(
            jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        jpContenidoLayout.setVerticalGroup(
            jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jtNuevoTipoDeHabitacion.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jtNuevoTipoDeHabitacion.setText("NUEVO TIPO DE HABITACION");
        jtNuevoTipoDeHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNuevoTipoDeHabitacionActionPerformed(evt);
            }
        });

        jtEliminarTipoDeHabitacion.setText("ELIMINAR TIPO DE HABITACION");
        jtEliminarTipoDeHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEliminarTipoDeHabitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNuevoTipoDeHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jtEliminarTipoDeHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jtNuevoTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtEliminarTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(478, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtNuevoTipoDeHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNuevoTipoDeHabitacionActionPerformed
        
        showJPanel(jpContenido, new NuevoTipoDeHabitacion(thd));
        
    }//GEN-LAST:event_jtNuevoTipoDeHabitacionActionPerformed

    private void jtEliminarTipoDeHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEliminarTipoDeHabitacionActionPerformed
        
        showJPanel(jpContenido, new EliminarTipoDeHabitacion(thd));
        
    }//GEN-LAST:event_jtEliminarTipoDeHabitacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpContenido;
    private javax.swing.JToggleButton jtEliminarTipoDeHabitacion;
    private javax.swing.JToggleButton jtNuevoTipoDeHabitacion;
    // End of variables declaration//GEN-END:variables
}
