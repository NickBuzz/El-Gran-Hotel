package Vistas;

import AccesoADatos.TipodeHabitacionData;
import Entidades.TipodeHabitacion;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/* @author ruben
 */
public class EliminarTipoDeHabitacion extends javax.swing.JPanel {

    private TipodeHabitacionData thd;
    TipodeHabitacion th;
    List<TipodeHabitacion> listaTipodeHabitacion;

    private DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int fila, int columna) {

            return false;

        }
    };

    public EliminarTipoDeHabitacion(TipodeHabitacionData thd) {
        initComponents();
        cargarCabecera();
        this.thd = thd;
        this.listaTipodeHabitacion = thd.listarTipodeHabitaciones();
        cargarDatos(listaTipodeHabitacion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jlBuscarPorID = new javax.swing.JLabel();
        jtBuscarPorID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaTipoDeHabitacion = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 500));

        jlTitulo.setText("SELECCIONE EL TIPO DE HABITACION QUE QUIERA ELIMINAR");

        jlBuscarPorID.setText("BUSCAR POR ID");

        jtBuscarPorID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarPorIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtBuscarPorIDKeyTyped(evt);
            }
        });

        jtTablaTipoDeHabitacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTablaTipoDeHabitacion);

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlBuscarPorID)
                                .addGap(18, 18, 18)
                                .addComponent(jtBuscarPorID))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jlTitulo)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jlTitulo)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBuscarPorID)
                    .addComponent(jtBuscarPorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtBuscarPorIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarPorIDKeyTyped

        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {

            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros enteros");

        }

    }//GEN-LAST:event_jtBuscarPorIDKeyTyped

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
        int filaS = jtTablaTipoDeHabitacion.getSelectedRow();

        if (filaS == -1) {

            JOptionPane.showMessageDialog(null, "Seleccione un bloque para eliminar");

        } else {

            int id = (Integer) jtTablaTipoDeHabitacion.getValueAt(filaS, 0);
            thd.eliminarTipodeHabitacion(id);
            modelo.removeRow(filaS);

        }

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtBuscarPorIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarPorIDKeyReleased

        int validar;

        try {

            modelo.setRowCount(0);
            validar = Integer.parseInt(jtBuscarPorID.getText());

        } catch (NumberFormatException e) {

            for (TipodeHabitacion lista : listaTipodeHabitacion) {

                modelo.addRow(new Object[]{lista.getIdTipoHabitacion(), lista.getCapacidad(), lista.getIntcantCamas(), lista.getTipoCamas(), lista.getCodigo()});

            }

            return;

        }

        for (TipodeHabitacion lista : listaTipodeHabitacion) {

            if (lista.getIdTipoHabitacion() == validar) {

                modelo.addRow(new Object[]{lista.getIdTipoHabitacion(), lista.getCapacidad(), lista.getIntcantCamas(), lista.getTipoCamas(), lista.getCodigo()});

            }

        }
    }//GEN-LAST:event_jtBuscarPorIDKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JLabel jlBuscarPorID;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtBuscarPorID;
    private javax.swing.JTable jtTablaTipoDeHabitacion;
    // End of variables declaration//GEN-END:variables

    private void cargarCabecera() {

        modelo.addColumn("ID");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Cantidad de camas");
        modelo.addColumn("Tipo de camas");
        modelo.addColumn("Tipo de habitacion");
        jtTablaTipoDeHabitacion.setModel(modelo);

    }

    private void cargarDatos(List<TipodeHabitacion> listaDeTipodeHabitacion){
        
        for (TipodeHabitacion lista : listaDeTipodeHabitacion) {
            
            modelo.addRow(new Object[] {lista.getIdTipoHabitacion(),lista.getCapacidad(),lista.getIntcantCamas(),lista.getTipoCamas(),lista.getCodigo()});
            
        }
        
    }
    
}
