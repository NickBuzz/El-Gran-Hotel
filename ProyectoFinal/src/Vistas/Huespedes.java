package Vistas;

import Entidades.huesped;
import AccesoADatos.HuespedData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Huespedes extends javax.swing.JPanel {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private final HuespedData HD;
    private List<huesped> huespedList = new ArrayList();

    public Huespedes() {
        this.HD = new HuespedData();
        huespedList = HD.listarHuespedes();
        initComponents();
        checkDni.setSelected(true);
        armarCabecera();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        jtHuespedes.setRowSorter(sorter);
        updateTabla();
    }

    private void armarCabecera() {
        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CORREO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("DOMICILIO");
        modelo.addColumn("ESTADO");
        jtHuespedes.setModel(modelo);
    }

    private void borrarFilas() {
        int filas = jtHuespedes.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void updateTabla() {
        borrarFilas();
        huespedList = HD.listarHuespedes();
        huespedList.forEach((Huesped) -> {
            modelo.addRow(new Object[]{
                Huesped.getDni(),
                Huesped.getNombre(),
                Huesped.getCorreo(),
                Huesped.getCelular(),
                Huesped.getDomicilio(),
                Huesped.isEstado() ? "Activo" : "Inactivo"
            });
        });
    }

    private void llenarModelo(huesped huesped) {
        modelo.addRow(new Object[]{
            huesped.getDni(),
            huesped.getNombre(),
            huesped.getCorreo(),
            huesped.getCelular(),
            huesped.getDomicilio(),
            huesped.isEstado() ? "Activo" : "Inactivo"
        });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TextBuscar = new javax.swing.JTextField();
        BActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHuespedes = new javax.swing.JTable();
        BBorrar = new javax.swing.JButton();
        BEditar = new javax.swing.JButton();
        BNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        checkDni = new javax.swing.JRadioButton();
        checkNombre = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();

        TextBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextBuscarKeyTyped(evt);
            }
        });

        BActualizar.setText("ACTUALIZAR");
        BActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarActionPerformed(evt);
            }
        });

        jtHuespedes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtHuespedes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtHuespedes);

        BBorrar.setText("BORRAR");
        BBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBorrarActionPerformed(evt);
            }
        });

        BEditar.setText("EDITAR");
        BEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditarActionPerformed(evt);
            }
        });

        BNuevo.setText("NUEVO");
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA DE HUESPEDES");

        buttonGroup1.add(checkDni);
        checkDni.setText("DNI");

        buttonGroup1.add(checkNombre);
        checkNombre.setText("NOMBRE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TextBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(BActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkDni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkNombre)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1))))
                .addGap(50, 50, 50))
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
                    .addComponent(checkDni)
                    .addComponent(checkNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextBuscarKeyReleased
        borrarFilas();
        huespedList.forEach((Huesped) -> {
            if (checkDni.isSelected()) {
                String dni = String.valueOf(Huesped.getDni());
                if (dni.startsWith(TextBuscar.getText())) {
                    llenarModelo(Huesped);
                }
            }
            if (checkNombre.isSelected()) {
                String nombre = Huesped.getNombre();
                if (nombre.toLowerCase().startsWith(TextBuscar.getText().toLowerCase())) {
                    llenarModelo(Huesped);
                }
            }
        });
    }//GEN-LAST:event_TextBuscarKeyReleased

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed

        borrarFilas();
        updateTabla();

    }//GEN-LAST:event_BActualizarActionPerformed

    private void BEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditarActionPerformed
        int seleccion = jtHuespedes.getSelectedRow();
        if (seleccion != -1) {
            Object valor = jtHuespedes.getValueAt(seleccion, 0);
            int dni = (int) valor;
            huesped parametro = HD.buscarHuespedPorDni(dni);
            Menu.showJPanel(this, new HuespedesFormulario(parametro));
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione el huesped a editar.");
        }
    }//GEN-LAST:event_BEditarActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        Menu.showJPanel(this, new HuespedesFormulario());
    }//GEN-LAST:event_BNuevoActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        int seleccion = jtHuespedes.getSelectedRow();
        if (seleccion != -1) {
            Object valor = jtHuespedes.getValueAt(seleccion, 0);
            int dni = (int) valor;
            huesped parametro = HD.buscarHuespedPorDni(dni);
            HD.eliminarHuesped(parametro.getIdHuesped());
            updateTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione el huesped a borrar.");
        }
    }//GEN-LAST:event_BBorrarActionPerformed

    private void TextBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextBuscarKeyTyped
        char c = evt.getKeyChar();
        if (checkDni.isSelected()) {
            if (!Character.isDigit(c) || TextBuscar.getText().length() >= 8) {
                evt.consume();
            }
        }
        if (checkNombre.isSelected()) {
            if (!Character.isLetter(c) && c != ' ') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_TextBuscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BEditar;
    private javax.swing.JButton BNuevo;
    private javax.swing.JTextField TextBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton checkDni;
    private javax.swing.JRadioButton checkNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtHuespedes;
    // End of variables declaration//GEN-END:variables
}
