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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setText("Bienvenido al Sistema de Reservas del El Gran Hotel ");

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
        jbactualizar.setText("Actualizar");
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Hostel.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Table.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jbNuevaReserva)
                        .addGap(49, 49, 49)
                        .addComponent(jbactualizar)
                        .addGap(54, 54, 54)
                        .addComponent(jbborrar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(jbActualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbActualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jtBuscar)
                                .addGap(52, 52, 52)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbactualizar)
                            .addComponent(jbNuevaReserva)
                            .addComponent(jbborrar))
                        .addGap(56, 56, 56))))
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
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
