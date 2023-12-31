/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.TipodeHabitacionData;
import Entidades.TipodeHabitacion;
import java.util.List;
import javax.swing.JOptionPane;

/* @author ruben
 */
public class NuevoTipoDeHabitacion extends javax.swing.JPanel {

    private TipodeHabitacionData thd;
    TipodeHabitacion th;
    List<TipodeHabitacion> listaTipodeHabitacion;

    public NuevoTipoDeHabitacion(TipodeHabitacionData thd) {
        initComponents();
        this.thd = thd;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jlCapacidad = new javax.swing.JLabel();
        jlCantidadDeCamas = new javax.swing.JLabel();
        jtbLimpiarCampos = new javax.swing.JToggleButton();
        jtbCrear = new javax.swing.JToggleButton();
        jlTipoDeHabitacion = new javax.swing.JLabel();
        jlTipoDeCamas = new javax.swing.JLabel();
        jlPrecio = new javax.swing.JLabel();
        jtCapacidad = new javax.swing.JTextField();
        jtCantidadDeCamas = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jcTipoDeCamas = new javax.swing.JComboBox<>();
        jcTipoDeHabitacion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(500, 500));

        jlCapacidad.setText("CAPACIDAD");

        jlCantidadDeCamas.setText("CANTIDAD DE CAMAS");

        buttonGroup1.add(jtbLimpiarCampos);
        jtbLimpiarCampos.setText("Limpiar campos");
        jtbLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbLimpiarCamposActionPerformed(evt);
            }
        });

        buttonGroup1.add(jtbCrear);
        jtbCrear.setText("Crear");
        jtbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbCrearActionPerformed(evt);
            }
        });

        jlTipoDeHabitacion.setText("TIPO DE HABITACION");

        jlTipoDeCamas.setText("TIPO DE CAMAS");

        jlPrecio.setText("PRECIO");

        jtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCapacidadKeyTyped(evt);
            }
        });

        jtCantidadDeCamas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCantidadDeCamasKeyTyped(evt);
            }
        });

        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });

        jcTipoDeCamas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UN TIPO DE CAMA", "Simples", "Queen", "King Size" }));
        jcTipoDeCamas.setMinimumSize(new java.awt.Dimension(65, 149));

        jcTipoDeHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE EL TIPO DE HABITACION", "Simple", "Doble", "Triple", "Suite Lujo" }));
        jcTipoDeHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoDeHabitacionActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMULARIO DE NUEVO TIPO DE HABITACION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCantidadDeCamas)
                                    .addComponent(jlCapacidad)
                                    .addComponent(jlTipoDeCamas)
                                    .addComponent(jlTipoDeHabitacion))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcTipoDeCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtCantidadDeCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtbLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtbCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlPrecio)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCapacidad)
                    .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCantidadDeCamas)
                    .addComponent(jtCantidadDeCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipoDeCamas)
                    .addComponent(jcTipoDeCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTipoDeHabitacion))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecio)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtbLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtbCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbCrearActionPerformed
        
        listaTipodeHabitacion = thd.listarTipodeHabitaciones();
        th = new TipodeHabitacion();

        th.setCodigo(jcTipoDeHabitacion.getSelectedItem().toString());
        th.setTipoCamas((String) jcTipoDeCamas.getSelectedItem());

        try {

            th.setCapacidad(Integer.parseInt(jtCapacidad.getText()));
            th.setIntcantCamas(Integer.parseInt(jtCantidadDeCamas.getText()));
            th.setPrecioNoche(Double.parseDouble(jtPrecio.getText()));

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Por favor verifique no dejar campos vacios");
            return;

        }

        if (th.getCodigo() == "SELECCIONE EL TIPO DE HABITACION") {

            JOptionPane.showMessageDialog(null, "Por favor seleccione un tipo de habitacion");
            return;

        }

        if (th.getTipoCamas() == "SELECCIONE UN TIPO DE CAMA") {

            JOptionPane.showMessageDialog(null, "Por favor seleccione un tipo de cama");
            return;

        }

        for (TipodeHabitacion lista : listaTipodeHabitacion) {

            if (lista.getCodigo().equals(th.getCodigo()) && lista.getTipoCamas().equals(th.getTipoCamas()) && lista.getCapacidad() == th.getCapacidad() && lista.getIntcantCamas() == th.getIntcantCamas()) {

                JOptionPane.showMessageDialog(null, "Ya existe un tipo de habitacion con las mismas caracteristicas");
                return;

            }

        }
        
        thd.guardarTipoHabitacion(th);
        
    }//GEN-LAST:event_jtbCrearActionPerformed

    private void jtbLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbLimpiarCamposActionPerformed
        
        String elementoSeleccionado="SELECCIONE EL TIPO DE HABITACION";
        String elementoSeleccionado2="SELECCIONE UN TIPO DE CAMA";
        jtCapacidad.setText("");
        jtPrecio.setText("");
        jtCantidadDeCamas.setText("");
        jcTipoDeHabitacion.setSelectedItem(elementoSeleccionado);
        jcTipoDeCamas.setSelectedItem(elementoSeleccionado2);
        
    }//GEN-LAST:event_jtbLimpiarCamposActionPerformed

    private void jcTipoDeHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoDeHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTipoDeHabitacionActionPerformed

    private void jtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCapacidadKeyTyped
        
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros enteros");
            
        }
        
    }//GEN-LAST:event_jtCapacidadKeyTyped

    private void jtCantidadDeCamasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCantidadDeCamasKeyTyped
        
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros enteros");
            
        }
        
    }//GEN-LAST:event_jtCantidadDeCamasKeyTyped

    private void jtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyTyped
        
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros enteros");
            
        }
        
    }//GEN-LAST:event_jtPrecioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> jcTipoDeCamas;
    private javax.swing.JComboBox<String> jcTipoDeHabitacion;
    private javax.swing.JLabel jlCantidadDeCamas;
    private javax.swing.JLabel jlCapacidad;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlTipoDeCamas;
    private javax.swing.JLabel jlTipoDeHabitacion;
    private javax.swing.JTextField jtCantidadDeCamas;
    private javax.swing.JTextField jtCapacidad;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JToggleButton jtbCrear;
    private javax.swing.JToggleButton jtbLimpiarCampos;
    // End of variables declaration//GEN-END:variables

    

    

}

