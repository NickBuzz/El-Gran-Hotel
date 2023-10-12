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
import static java.lang.Integer.parseInt;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Habitaciones extends javax.swing.JPanel {
  
  private List<TipodeHabitacion> TDH;  
  private HabitacionData TDHD = new HabitacionData();
  private Habitacion habita= null;  
  

  DefaultTableModel modelo = new DefaultTableModel(){
    public boolean isCellEditable(int fila, int columna) {
            if (columna == 2) {
                return true;
            }
            return false;
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
        jBeliminar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(990, 696));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Formulario de Habitaciones");

        jLabel2.setText("IdHabitacion");

        jLabel3.setText("Numero");

        jLabel4.setText("Piso");

        jLabel5.setText("Activo");

        jLabel6.setText("Codigo Tipo de Habitacion");

        jTnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnumeroActionPerformed(evt);
            }
        });

        jTidhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidhabitacionActionPerformed(evt);
            }
        });

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

        jBeliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBbuscar)
                                .addGap(31, 31, 31)
                                .addComponent(jBguardar)
                                .addGap(28, 28, 28)
                                .addComponent(jBeliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jChactivo)
                                            .addComponent(jTpiso)
                                            .addComponent(jTnumero)
                                            .addComponent(jTidhabitacion)
                                            .addComponent(jCcodigotipohab, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jChactivo))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCcodigotipohab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBbuscar)
                    .addComponent(jBguardar)
                    .addComponent(jBeliminar))
                .addContainerGap(187, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTidhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidhabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidhabitacionActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
           if (!jTnumero.getText().isEmpty()) {
            int num = Integer.parseInt(jTnumero.getText());
                   
            habita = TDHD.buscarHabitacionPorNumero(num);
            
            try {
                if (Integer.parseInt(jTnumero.getText()) == (habita.getNumero())) {
                    jTidhabitacion.setText(Integer.toString(habita.getIdHabitacion()));
                    System.out.println("piso en habitaciones: " + habita.getPiso());
                    jTpiso.setText(Integer.toString(habita.getPiso()));
                    jChactivo.setSelected(habita.isEstado());
                    jBeliminar.setEnabled(true);
                    System.out.println("idtipohabitacion en habitaciones: " + habita.getIdTDHabitacion());
                    jCcodigotipohab.setSelectedIndex(habita.getIdTipoHabitacion());
                    

                }
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero de habitacion.");
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnumeroActionPerformed

    private void jChactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChactivoActionPerformed
        if(jChactivo.isEnabled()){
            habita.setEstado(true);
            jChactivo.setText("ACTIVO");
        }else{
            habita.setEstado(false);
            jChactivo.setText("INACTIVO");
        }
    }//GEN-LAST:event_jChactivoActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        if(jCcodigotipohab.isEnabled() && jChactivo.isEnabled() ){
        int num = parseInt(jTnumero.getText());
         System.out.println(num +  " num " + 2);
        int piso = Integer.parseInt(jTpiso.getText());
        
        boolean act = jChactivo.isSelected();
        int index = jCcodigotipohab.getSelectedIndex();
        int idTDH =jCcodigotipohab.getItemAt(index).getIdTipoHabitacion();
        habita = new Habitacion( num,  piso, act, idTDH);
      
        Habitacion check= TDHD.buscarHabitacionPorNumero(num);
        if(check == null){
        TDHD.guardarHabitacion(habita);
           
        
        }else{
                 habita.setIdHabitacion(check.getIdHabitacion());
                TDHD.modificarHabitacion(habita);
        
        
        }
        
        limpiarCampos();
     
                
        }
    }//GEN-LAST:event_jBguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JComboBox<TipodeHabitacion> jCcodigotipohab;
    private javax.swing.JCheckBox jChactivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaHab;
    private javax.swing.JTextField jTidhabitacion;
    private javax.swing.JTextField jTnumero;
    private javax.swing.JTextField jTpiso;
    // End of variables declaration//GEN-END:variables
    
    
   private void cargarCabecera() {

        modelo.addColumn("id");
        modelo.addColumn("Numero");
        modelo.addColumn("Piso");
         modelo.addColumn("Estado");
          modelo.addColumn("Codigo");
        
        jTablaHab.setModel(modelo);

    }
   
    private void cargarComboTDH(){
    
           TipodeHabitacionData tdh = new TipodeHabitacionData();
        List<TipodeHabitacion> listaTipos = tdh.listarTipodeHabitaciones();
          DefaultComboBoxModel<TipodeHabitacion> model = new DefaultComboBoxModel<>();
        listaTipos.forEach((tipo) -> {
            System.out.println(tipo);
            model.addElement(tipo);
        });
        jCcodigotipohab.setModel(model);
     
    
    }
    
      private void limpiarCampos() {
        jTidhabitacion.setText("");
        jTnumero.setText("");
        jTpiso.setText("");
        jChactivo.setSelected(false);

   
    }


}
