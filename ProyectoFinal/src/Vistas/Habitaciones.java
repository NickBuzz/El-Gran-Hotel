/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.HabitacionData;
import AccesoADatos.TipodeHabitacionData;
import Entidades.Habitacion;
import Entidades.TipodeHabitacion;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Habitaciones extends javax.swing.JPanel {

    private final HabitacionData habitacionData = new HabitacionData();
    private Habitacion habitacion = null;
   
   private final DefaultTableModel modeloDetalles = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return columna == 2;
        }
    };
    
    
    private final DefaultTableModel  modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return columna == 2;
        }
    };

    public Habitaciones() {
        initComponents();
        cargarCabecera();
        cargarComboTDH();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTnumero = new javax.swing.JTextField();
        jTidhabitacion = new javax.swing.JTextField();
        jTpiso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaHab = new javax.swing.JTable();
        jChactivo = new javax.swing.JCheckBox();
        jCcodigotipohab = new javax.swing.JComboBox<>();
        jBbuscar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaDetallesTipoHab = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(990, 696));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMULARIO DE HABITACIONES");

        jLabel2.setText("IdHabitacion");

        jLabel3.setText("Numero");

        jLabel4.setText("Piso");

        jLabel5.setText("Activo");

        jLabel6.setText("Codigo Tipo de Habitacion");

        jTnumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTnumeroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTnumeroFocusLost(evt);
            }
        });
        jTnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnumeroActionPerformed(evt);
            }
        });

        jTidhabitacion.setEditable(false);
        jTidhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidhabitacionActionPerformed(evt);
            }
        });

        jTablaHab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTablaHab.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaHab.setGridColor(new java.awt.Color(25, 25, 25));
        jScrollPane1.setViewportView(jTablaHab);

        jChactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChactivoActionPerformed(evt);
            }
        });

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jTablaDetallesTipoHab.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTablaDetallesTipoHab);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DETALLE");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TIPO DE HABITACION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCcodigotipohab, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jChactivo)
                            .addComponent(jTnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jChactivo, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCcodigotipohab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTidhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidhabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidhabitacionActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        if (!jTnumero.getText().isEmpty()) {
            int num = Integer.parseInt(jTnumero.getText());
            habitacion = habitacionData.buscarHabitacionPorNumero(num);

            if (habitacion != null) {

                jChactivo.setSelected(habitacion.isEstado());
                jCcodigotipohab.setSelectedItem(habitacion.getIdTDHabitacion());
                jTpiso.setText(habitacion.getPiso() + "");
                jTidhabitacion.setText(habitacion.getIdHabitacion() + "");
                DefaultTableModel modeloTabla = (DefaultTableModel) jTablaHab.getModel();
                modeloTabla.setRowCount(0);

                Object[] fila = {
                    habitacion.getIdHabitacion(),
                    habitacion.getNumero(),
                    habitacion.getPiso(),
                    habitacion.isEstado(),
                    jCcodigotipohab.getSelectedItem()
                };

                modeloTabla.addRow(fila);

                cargarDetallesTipoHabitacion(habitacion.getIdTDHabitacion());
            } else {
                JOptionPane.showMessageDialog(null, "Habitación no encontrada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número de habitación.");
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnumeroActionPerformed
        if (jTnumero.isCursorSet()) {
            jTidhabitacion.setEnabled(false);
            jTnumero.getAction().actionPerformed(evt);
            JOptionPane.showMessageDialog(this, evt);

        }
    }//GEN-LAST:event_jTnumeroActionPerformed

    private void jChactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChactivoActionPerformed
        if (jChactivo.isSelected()) {
            jChactivo.setText("Activo");
        } else {
            jChactivo.setText("Inactivo");
        }
    }//GEN-LAST:event_jChactivoActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        if (camposObligatoriosLlenos()) {
            try {
                int num = Integer.parseInt(jTnumero.getText());
                int piso = Integer.parseInt(jTpiso.getText());
                boolean act = jChactivo.isSelected();
                int idTDH = jCcodigotipohab.getItemAt(jCcodigotipohab.getSelectedIndex()).getIdTipoHabitacion();

                Habitacion existingHabitacion = habitacionData.buscarHabitacionPorNumero(num);

                if (existingHabitacion != null) {
                    int respuesta = JOptionPane.showConfirmDialog(
                            this,
                            "Ya existe una habitación con este número. ¿Desea modificarla?",
                            "Confirmación",
                            JOptionPane.YES_NO_OPTION
                    );

                    if (respuesta == JOptionPane.YES_OPTION) {
                        existingHabitacion.setPiso(piso);
                        existingHabitacion.setEstado(act);
                        existingHabitacion.setIdTipoHabitacion(idTDH);

                        habitacionData.modificarHabitacion(existingHabitacion);
                        DefaultTableModel modeloTablaHab = (DefaultTableModel) jTablaHab.getModel();
                        DefaultTableModel modeloTablaDetalles = (DefaultTableModel) jTablaDetallesTipoHab.getModel();
                        modeloTablaHab.setRowCount(0);
                        modeloTablaDetalles.setRowCount(0);
                        limpiarCampos();
                    }
                } else {
                    habitacion = new Habitacion(num, piso, act, idTDH);
                    habitacionData.guardarHabitacion(habitacion);
                    limpiarCampos();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese valores válidos en los campos numéricos.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos que son obligatorios.");
        }
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jTnumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnumeroFocusGained
        jTidhabitacion.setEnabled(false);
    }//GEN-LAST:event_jTnumeroFocusGained

    private void jTnumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnumeroFocusLost
        jTidhabitacion.setEnabled(true);
    }//GEN-LAST:event_jTnumeroFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JComboBox<TipodeHabitacion> jCcodigotipohab;
    private javax.swing.JCheckBox jChactivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablaDetallesTipoHab;
    private javax.swing.JTable jTablaHab;
    private javax.swing.JTextField jTidhabitacion;
    private javax.swing.JTextField jTnumero;
    private javax.swing.JTextField jTpiso;
    // End of variables declaration//GEN-END:variables

    private boolean camposObligatoriosLlenos() {
        return !jTnumero.getText().isEmpty() && !jTpiso.getText().isEmpty() && jCcodigotipohab.getSelectedIndex() >= 0;
    }

    private void cargarCabecera() {
        modelo.addColumn("ID Habitacion");
        modelo.addColumn("Numero");
        modelo.addColumn("Piso");
        modelo.addColumn("Estado");

        jTablaHab.setModel(modelo);

        modeloDetalles.addColumn("Capacidad");
         modeloDetalles.addColumn("Cantidad de Camas");
          modeloDetalles.addColumn("Tipo de Camas");
           modeloDetalles.addColumn("Precio por Noche");
            modeloDetalles.addColumn("Nombre");
        jTablaDetallesTipoHab.setModel(modeloDetalles);
    }

    private void cargarComboTDH() {
        TipodeHabitacionData tdhData = new TipodeHabitacionData();
        List<TipodeHabitacion> listaTipos = tdhData.listarTipodeHabitaciones();
        DefaultComboBoxModel<TipodeHabitacion> model = new DefaultComboBoxModel<>(listaTipos.toArray(new TipodeHabitacion[0]));
        jCcodigotipohab.setModel(model);
    }

    private void limpiarCampos() {
        jTidhabitacion.setText("");
        jTnumero.setText("");
        jTpiso.setText("");
        jChactivo.setSelected(false);

    }

    private void cargarDetallesTipoHabitacion(TipodeHabitacion tipoHabitacion) {
        modeloDetalles.setRowCount(0);

        if (tipoHabitacion != null) {
            Object[] fila = {
                tipoHabitacion.getCapacidad(),
                tipoHabitacion.getIntcantCamas(),
                tipoHabitacion.getTipoCamas(),
                tipoHabitacion.getPrecioNoche(),
                tipoHabitacion.getCodigo()};

            modeloDetalles.addRow(fila);
            jTablaDetallesTipoHab.setModel(modeloDetalles);
        }
    }

}
