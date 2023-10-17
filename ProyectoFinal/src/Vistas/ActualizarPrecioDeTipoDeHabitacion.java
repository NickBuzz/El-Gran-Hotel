package Vistas;

import AccesoADatos.TipodeHabitacionData;
import Entidades.TipodeHabitacion;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/* @author ruben
 */
public class ActualizarPrecioDeTipoDeHabitacion extends javax.swing.JPanel {

    private TipodeHabitacionData thd;
    TipodeHabitacion th;
    List<TipodeHabitacion> listaTipodeHabitacion;

    private DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int fila, int columna) {

            return false;

        }
    };
    
    public ActualizarPrecioDeTipoDeHabitacion(TipodeHabitacionData thd) {
        initComponents();
        cargarCabecera();
        this.thd=thd;
        this.listaTipodeHabitacion = thd.listarTipodeHabitaciones();
        cargarDatos(listaTipodeHabitacion);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTiposDeHabitacion = new javax.swing.JTable();
        jbActualizarPrecio = new javax.swing.JButton();
        jlBuscarTipoDeHabitacion = new javax.swing.JLabel();
        jtBuscarHabitacionPorID = new javax.swing.JTextField();
        jlIngreseNuevoPrecio = new javax.swing.JLabel();
        jtPrecioNuevo = new javax.swing.JTextField();
        jl$ = new javax.swing.JLabel();

        jlTitulo.setText("SELECCIONE EL TIPO DE HABITACION AL CUAL LE QUIERA CAMBIAR EL PRECIO");

        jtTiposDeHabitacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTiposDeHabitacion);

        jbActualizarPrecio.setText("Actualizar precio");
        jbActualizarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarPrecioActionPerformed(evt);
            }
        });

        jlBuscarTipoDeHabitacion.setText("BUSCAR EL TIPO DE HABITACION POR ID:");

        jtBuscarHabitacionPorID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarHabitacionPorIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtBuscarHabitacionPorIDKeyTyped(evt);
            }
        });

        jlIngreseNuevoPrecio.setText("INGRESE EL NUEVO PRECIO:");

        jtPrecioNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioNuevoActionPerformed(evt);
            }
        });
        jtPrecioNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioNuevoKeyTyped(evt);
            }
        });

        jl$.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jlIngreseNuevoPrecio)
                        .addGap(18, 18, 18)
                        .addComponent(jl$)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPrecioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbActualizarPrecio))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jlBuscarTipoDeHabitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtBuscarHabitacionPorID))
                    .addComponent(jlTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jlTitulo)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBuscarTipoDeHabitacion)
                    .addComponent(jtBuscarHabitacionPorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIngreseNuevoPrecio)
                    .addComponent(jtPrecioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbActualizarPrecio)
                    .addComponent(jl$))
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtPrecioNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioNuevoActionPerformed

    private void jbActualizarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarPrecioActionPerformed
        
        int filaS = jtTiposDeHabitacion.getSelectedRow();
        int digitos=jtPrecioNuevo.getText().length(); 
        th=new TipodeHabitacion();

        if (filaS == -1) {

            JOptionPane.showMessageDialog(null, "Seleccione un bloque para cambiar el precio");

        } else if (jtPrecioNuevo.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Ingrese un precio");

        } else if (digitos>10){
            
            JOptionPane.showMessageDialog(null, "El precio no debe superar los 10 digitos");
         
        } else {
            
            double precio=Double.parseDouble(jtPrecioNuevo.getText());
            
            th.setIdTipoHabitacion((Integer)jtTiposDeHabitacion.getValueAt(filaS, 0));
            th.setCapacidad((Integer)jtTiposDeHabitacion.getValueAt(filaS, 1));
            th.setIntcantCamas((Integer)jtTiposDeHabitacion.getValueAt(filaS, 2));
            th.setTipoCamas((String)jtTiposDeHabitacion.getValueAt(filaS, 3));
            th.setCodigo((String)jtTiposDeHabitacion.getValueAt(filaS, 4));
            th.setPrecioNoche(precio);
            thd.cambiarPrecio(th);
            modelo.setValueAt("$ "+precio, filaS, 5);
            jtPrecioNuevo.setText("");

        }
        
    }//GEN-LAST:event_jbActualizarPrecioActionPerformed

    private void jtPrecioNuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioNuevoKeyTyped
        
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {

            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros enteros o decimales");

        }
        
    }//GEN-LAST:event_jtPrecioNuevoKeyTyped

    private void jtBuscarHabitacionPorIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarHabitacionPorIDKeyTyped
        
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {

            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros enteros");

        }
        
    }//GEN-LAST:event_jtBuscarHabitacionPorIDKeyTyped

    private void jtBuscarHabitacionPorIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarHabitacionPorIDKeyReleased
        
        int validar;

        try {

            modelo.setRowCount(0);
            validar = Integer.parseInt(jtBuscarHabitacionPorID.getText());

        } catch (NumberFormatException e) {

            for (TipodeHabitacion lista : listaTipodeHabitacion) {

                modelo.addRow(new Object[]{lista.getIdTipoHabitacion(), lista.getCapacidad(), lista.getIntcantCamas(), lista.getTipoCamas(), lista.getCodigo(),"$ "+lista.getPrecioNoche()});

            }

            return;

        }

        for (TipodeHabitacion lista : listaTipodeHabitacion) {

            if (lista.getIdTipoHabitacion() == validar) {

                modelo.addRow(new Object[]{lista.getIdTipoHabitacion(), lista.getCapacidad(), lista.getIntcantCamas(), lista.getTipoCamas(), lista.getCodigo(),"$ "+lista.getPrecioNoche()});

            }

        }
        
    }//GEN-LAST:event_jtBuscarHabitacionPorIDKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizarPrecio;
    private javax.swing.JLabel jl$;
    private javax.swing.JLabel jlBuscarTipoDeHabitacion;
    private javax.swing.JLabel jlIngreseNuevoPrecio;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtBuscarHabitacionPorID;
    private javax.swing.JTextField jtPrecioNuevo;
    private javax.swing.JTable jtTiposDeHabitacion;
    // End of variables declaration//GEN-END:variables

    private void cargarCabecera() {

        modelo.addColumn("ID");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Cantidad de camas");
        modelo.addColumn("Tipo de camas");
        modelo.addColumn("Tipo de habitacion");
        modelo.addColumn("Precio");
        jtTiposDeHabitacion.setModel(modelo);

    }

    private void cargarDatos(List<TipodeHabitacion> listaDeTipodeHabitacion){
        
        for (TipodeHabitacion lista : listaDeTipodeHabitacion) {
            
            modelo.addRow(new Object[] {lista.getIdTipoHabitacion(),lista.getCapacidad(),lista.getIntcantCamas(),lista.getTipoCamas(),lista.getCodigo(),"$ "+lista.getPrecioNoche()});
            
        }
        
    }
    
}
