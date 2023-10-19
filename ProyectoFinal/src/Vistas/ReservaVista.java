package Vistas;

import AccesoADatos.ReservaData;
import Entidades.Reserva;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReservaVista extends javax.swing.JPanel {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {

            return false;
        }
    };
    private final ReservaData RD;
    private List<Reserva> reservaList = new ArrayList<>();

    public ReservaVista() {
        this.RD = new ReservaData();
        reservaList = RD.obtenerReservas();
        initComponents();
        armarCabecera();
        updateTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtReservas = new javax.swing.JTable();
        jtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbActualizarTabla = new javax.swing.JButton();
        jbNuevaReserva = new javax.swing.JButton();
        jbactualizar = new javax.swing.JButton();
        jbborrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setText("jLabel1");

        setPreferredSize(new java.awt.Dimension(990, 600));

        jtReservas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtReservas);

        jtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBuscarActionPerformed(evt);
            }
        });
        jtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido al Sistema de Reservas");

        jbActualizarTabla.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jbActualizarTabla.setText("Actualizar Tabla");
        jbActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarTablaActionPerformed(evt);
            }
        });

        jbNuevaReserva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbNuevaReserva.setText("Nuevo ");
        jbNuevaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaReservaActionPerformed(evt);
            }
        });

        jbactualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbactualizar.setText("Editar");
        jbactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbactualizarActionPerformed(evt);
            }
        });

        jbborrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbborrar.setText("Borrar");
        jbborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbborrarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Table.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(503, 503, 503)
                                .addComponent(jbNuevaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbActualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbActualizarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jtBuscar)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarTablaActionPerformed
        borrarFilas();
        updateTabla();
    }//GEN-LAST:event_jbActualizarTablaActionPerformed

    private void jbNuevaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaReservaActionPerformed

        Menu.showJPanel(this, new GuardarReserva());


    }//GEN-LAST:event_jbNuevaReservaActionPerformed

    private void jbactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbactualizarActionPerformed
//boton actualizar
        int seleccion = jtReservas.getSelectedRow();
        if (seleccion != -1) {
            Object valor = jtReservas.getValueAt(seleccion, 0);
            int idReserva = (int) valor;
            Reserva reservaSeleccionada = RD.buscarReservaPorId(idReserva);

            Menu.showJPanel(this, new ModificarReserva(reservaSeleccionada));
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la reserva a Modificar");
        }


    }//GEN-LAST:event_jbactualizarActionPerformed

    private void jbborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbborrarActionPerformed

        //boton borrar
        int seleccion = jtReservas.getSelectedRow();
        if (seleccion != -1) {
            Object valor = jtReservas.getValueAt(seleccion, 0);
            int idReserva = (int) valor;
            Reserva parametro = RD.buscarReservaPorId(idReserva);
            RD.eliminarReserva(parametro.getIdReserva());
            updateTabla();

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la reserva a borrar ");
        }

    }//GEN-LAST:event_jbborrarActionPerformed

    private void jtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBuscarActionPerformed

    }//GEN-LAST:event_jtBuscarActionPerformed

    private void jtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarKeyReleased
//busqueda de reserva a medida que escribe 
        borrarFilas();
        String textoBusqueda = jtBuscar.getText().trim().toLowerCase();
        reservaList = RD.obtenerReservas();

        reservaList.forEach((reserva) -> {
            String nombreHuesped = reserva.getHuesped().getNombre().toLowerCase();
            int idReserva = reserva.getIdReserva();

            // Comprobar si el texto de búsqueda coincide con el nombre del huésped o el ID de la reserva
            if (nombreHuesped.contains(textoBusqueda) || String.valueOf(idReserva).contains(textoBusqueda)) {
                modelo.addRow(new Object[]{
                    reserva.getIdReserva(),
                    reserva.getFechaEntrada(),
                    reserva.getFechaSalida(),
                    reserva.getCantidadPerso(),
                    reserva.getMonto(),
                    reserva.isEstado() ? "Activa" : "Inactiva",
                    reserva.getHuesped().getIdHuesped(),
                    reserva.getHabitacion().getIdHabitacion()

                });
            }
        });
//permite a los usuarios buscar reservas en funcion de su id y nombre

    }//GEN-LAST:event_jtBuscarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbActualizarTabla;
    private javax.swing.JButton jbNuevaReserva;
    private javax.swing.JButton jbactualizar;
    private javax.swing.JButton jbborrar;
    private javax.swing.JTextField jtBuscar;
    private javax.swing.JTable jtReservas;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("IdReserva");
        modelo.addColumn("Fecha Entrada");
        modelo.addColumn("Fecha Salida");
        modelo.addColumn("Cantidad De Personas");
        modelo.addColumn("Monto");
        modelo.addColumn("IdHusped");
        modelo.addColumn("Id Habitacion");
        jtReservas.setModel(modelo);
//armado de tabla 
    }

    private void borrarFilas() {
        int filas = jtReservas.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void updateTabla() {
        borrarFilas();
        reservaList = RD.obtenerReservas();
        reservaList.forEach((reserva) -> {
            modelo.addRow(new Object[]{
                reserva.getIdReserva(),
                reserva.getFechaEntrada(),
                reserva.getFechaSalida(),
                reserva.getCantidadPerso(),
                reserva.getMonto(),
                reserva.isEstado() ? "Activa" : "Inactiva",
                
               // reserva.getHuesped().getIdHuesped(),
                reserva.getHabitacion().getIdHabitacion()
            //refresca la tabla de reservas en la interfaz con los datos mas recientes
            });
        });
    }

}
