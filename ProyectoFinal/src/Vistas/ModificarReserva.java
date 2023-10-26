package Vistas;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import AccesoADatos.TipodeHabitacionData;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import Entidades.TipodeHabitacion;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ModificarReserva extends javax.swing.JPanel {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {

            return false;

        }
    };
    private Reserva reservaActual;
    private ReservaData reservadata;
    private HuespedData huespedData;
    private HabitacionData habitacionData;
    private TipodeHabitacionData tipoDeHabitacionData;

    public ModificarReserva(Reserva reserva) {
        this.reservaActual = reserva;
        initComponents();
        inicializarDatos();
        cargarHabitacionesDisponiblesModificar();
        jtCodigoHabitacion.setEnabled(false);
        JtMontoApagar.setEnabled(false);

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        JtHabitacionesDispo.setRowSorter(sorter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtIdHuesped = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtcantidadperso = new javax.swing.JTextField();
        jdFentrada = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jdfeSalida = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jcTipoHabitacion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtHabitacionesDispo = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        JtMontoApagar = new javax.swing.JTextField();
        jbguardar = new javax.swing.JButton();
        jblimpiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Jchekestado = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jtCodigoHabitacion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Reserve.png"))); // NOI18N
        jLabel1.setText("Modificar Reserva");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Door Hanger.png"))); // NOI18N
        jLabel4.setText("Codigo De Huesped");

        jtIdHuesped.setEditable(false);
        jtIdHuesped.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Calendar.png"))); // NOI18N
        jLabel5.setText("Fecha De Entrada");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Calendar.png"))); // NOI18N
        jLabel6.setText("Fecha De Salida");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Tipo De Habitacion");

        jcTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoHabitacionActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Name.png"))); // NOI18N
        jLabel8.setText("Cantidad De Personas");

        JtHabitacionesDispo.setModel(new javax.swing.table.DefaultTableModel(
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
        JtHabitacionesDispo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtHabitacionesDispoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JtHabitacionesDispo);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cash.png"))); // NOI18N
        jLabel9.setText("Monto A Pagar");

        jbguardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbguardar.setText("Guardar");
        jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarActionPerformed(evt);
            }
        });

        jblimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jblimpiar.setText("Limpiar");
        jblimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimpiarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Estado");

        Jchekestado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Door Hanger.png"))); // NOI18N
        jLabel11.setText("Codigo De Habitacion");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Account.png"))); // NOI18N
        jLabel3.setText("Selecione Un Huesped");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtCodigoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JtMontoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(149, 149, 149)
                                        .addComponent(jbguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(jblimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtIdHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtcantidadperso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jchekestado, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdfeSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jSeparator2)
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
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtIdHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtcantidadperso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Jchekestado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdFentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdfeSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCodigoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtMontoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoHabitacionActionPerformed

        cargarHabitacionesDisponiblesModificar();
        calcularMontoPagar();


    }//GEN-LAST:event_jcTipoHabitacionActionPerformed

    private void JtHabitacionesDispoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtHabitacionesDispoMouseClicked
        int filaSeleccionada = JtHabitacionesDispo.getSelectedRow();

        if (filaSeleccionada != -1) {
            Object valorId = JtHabitacionesDispo.getValueAt(filaSeleccionada, 0);
            jtCodigoHabitacion.setText(String.valueOf(valorId));
            Habitacion selectedHabitacion = habitacionData.buscarHabitacion((int) valorId);

            if (jdFentrada.getDate() != null && jdfeSalida.getDate() != null) {
                LocalDate fechaEntrada = jdFentrada.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fechaSalida = jdfeSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                long numNoches = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);

                double precioPorNoche = selectedHabitacion.getIdTDHabitacion().getPrecioNoche();

                double monto = numNoches * precioPorNoche;
                JtMontoApagar.setText(String.valueOf(monto));
            }

        }
    }//GEN-LAST:event_JtHabitacionesDispoMouseClicked

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarActionPerformed
        //se obtiene los datos nesecarios 
        try {
            LocalDate fechaEntrada = jdFentrada.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaSalida = jdfeSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int cantidadPersonas = Integer.parseInt(jtcantidadperso.getText());
            int codigoHabitacion = Integer.parseInt(jtCodigoHabitacion.getText());
            boolean estado = Jchekestado.isSelected();
            Huesped selectedHuesped = (Huesped) jComboBox1.getSelectedItem();
            Habitacion selectedHabitacion = habitacionData.buscarHabitacion(codigoHabitacion);
            TipodeHabitacion selectedTipoHabitacion = (TipodeHabitacion) jcTipoHabitacion.getSelectedItem();
            double monto = Double.parseDouble(JtMontoApagar.getText());

            reservaActual.getHabitacion().setEstado(true);                      // En el caso que al modificar la reserva se cambie de habitacion
            habitacionData.modificarHabitacion(reservaActual.getHabitacion());  // se setea la habitacion que deja como libre(true) en la base.

            reservaActual.setFechaEntrada(fechaEntrada);
            reservaActual.setFechaSalida(fechaSalida);
            reservaActual.setCantidadPerso(cantidadPersonas);
            reservaActual.setHabitacion(selectedHabitacion);
            reservaActual.setEstado(estado);
            reservaActual.setHuesped(selectedHuesped);
            reservaActual.setTipoHabitacion(selectedTipoHabitacion);

            reservaActual.setMonto(monto);

            reservadata.actualizarReserva(reservaActual);

            selectedHabitacion.setEstado(false);                        // Setea la habitacion como ocupada(false)
            habitacionData.modificarHabitacion(selectedHabitacion);     // y se actualiza la base de datos.

            limpiarFormulario();
            JOptionPane.showMessageDialog(this, "Reserva actualizada exitosamente.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa valores válidos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar la reserva: " + ex.getMessage());
        }
//actualiza una reserva de hotel en la bd
    }//GEN-LAST:event_jbguardarActionPerformed

    private void jblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_jblimpiarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Huesped selectedHuesped = (Huesped) jComboBox1.getSelectedItem();
        if (selectedHuesped != null) {
            jtIdHuesped.setText(String.valueOf(selectedHuesped.getIdHuesped()));
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Jchekestado;
    private javax.swing.JTable JtHabitacionesDispo;
    private javax.swing.JTextField JtMontoApagar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbguardar;
    private javax.swing.JButton jblimpiar;
    private javax.swing.JComboBox<TipodeHabitacion> jcTipoHabitacion;
    private com.toedter.calendar.JDateChooser jdFentrada;
    private com.toedter.calendar.JDateChooser jdfeSalida;
    private javax.swing.JTextField jtCodigoHabitacion;
    private javax.swing.JTextField jtIdHuesped;
    private javax.swing.JTextField jtcantidadperso;
    // End of variables declaration//GEN-END:variables

    private void limpiarFormulario() {
        jtIdHuesped.setText("");
        Jchekestado.setSelected(false);
        jtcantidadperso.setText("");
        jdFentrada.setDate(null);
        jdfeSalida.setDate(null);
        jcTipoHabitacion.setSelectedIndex(0);
        DefaultTableModel model = (DefaultTableModel) JtHabitacionesDispo.getModel();
        model.setRowCount(0);
        jtCodigoHabitacion.setText("");
        JtMontoApagar.setText("");
    }

    private void llenarCampos(Reserva reserva) {

        Habitacion habitacion = reserva.getHabitacion();
        TipodeHabitacion tipoHabitacionReserva = reserva.getHabitacion().getIdTDHabitacion();

        jtIdHuesped.setText(String.valueOf(reserva.getHuesped().getIdHuesped()));
        jdFentrada.setDate(Date.from(reserva.getFechaEntrada().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        jdfeSalida.setDate(Date.from(reserva.getFechaSalida().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        jtcantidadperso.setText(String.valueOf(reserva.getCantidadPerso()));
        jtCodigoHabitacion.setText(String.valueOf(reserva.getHabitacion().getIdHabitacion()));
        Jchekestado.setSelected(reserva.isEstado());
        JtMontoApagar.setText("");

        for (int i = 0; i < jComboBox1.getItemCount(); i++) {
            Huesped item = (Huesped) jComboBox1.getItemAt(i);
            if (item.getIdHuesped() == reserva.getHuesped().getIdHuesped()) {
                jComboBox1.setSelectedIndex(i);
            }
        }

        for (int i = 0; i < jcTipoHabitacion.getItemCount(); i++) {
            TipodeHabitacion item = (TipodeHabitacion) jcTipoHabitacion.getItemAt(i);
            if (item.getIdTipoHabitacion() == tipoHabitacionReserva.getIdTipoHabitacion()) {
                jcTipoHabitacion.setSelectedIndex(i);
            }
        }

        mostrarHabitacionesDisponibles(habitacion.getIdTDHabitacion());
        calcularMontoPagar();
//llena el for con los datos de una reserva que ya existe. y permite modicicar
    }

    private void armarCabecera() {
        modelo.addColumn("IdHabitacion");
        modelo.addColumn("numero");
        modelo.addColumn("piso");
        modelo.addColumn("estado");
        modelo.addColumn("Id TipodeHabitacion");
        JtHabitacionesDispo.setModel(modelo);
    }

    private void mostrarHabitacionesDisponibles(TipodeHabitacion tipoHabitacion) {
        List<Habitacion> habitacionesDisponibles = habitacionData.obtenerTipoHabitacion(tipoHabitacion.getIdTipoHabitacion());
        DefaultTableModel model = (DefaultTableModel) JtHabitacionesDispo.getModel();
        model.setRowCount(0); // Limpia la tabla
        for (Habitacion habitacion : habitacionesDisponibles) {
            model.addRow(new Object[]{
                habitacion.getIdHabitacion(),
                habitacion.getNumero(),
                habitacion.getPiso(),
                habitacion.isEstado() ? "LIBRE" : "OCUPADA",
                habitacion.getIdTDHabitacion().getIdTipoHabitacion()
            });

        }
    }

    private void calcularMontoPagar() {
        int filaSeleccionada = JtHabitacionesDispo.getSelectedRow();

        if (filaSeleccionada != -1) {
            Object valorId = JtHabitacionesDispo.getValueAt(filaSeleccionada, 0);
            jtCodigoHabitacion.setText(String.valueOf(valorId));
            Habitacion selectedHabitacion = habitacionData.buscarHabitacion((int) valorId);

            if (jdFentrada.getDate() != null && jdfeSalida.getDate() != null) {
                LocalDate fechaEntrada = jdFentrada.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fechaSalida = jdfeSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                long numNoches = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);

                double precioPorNoche = selectedHabitacion.getIdTDHabitacion().getPrecioNoche();

                double monto = numNoches * precioPorNoche;
                JtMontoApagar.setText(String.valueOf(monto));
            }
        }
    }

    private void inicializarDatos() {
        reservadata = new ReservaData();
        huespedData = new HuespedData();
        habitacionData = new HabitacionData();
        tipoDeHabitacionData = new TipodeHabitacionData();
        armarCabecera();
        cargarCombos();
        llenarCampos(reservaActual);
    }

    private void cargarCombos() {
        jComboBox1.setModel(new DefaultComboBoxModel<>(huespedData.listarHuespedes().toArray()));
        jcTipoHabitacion.setModel(new DefaultComboBoxModel(tipoDeHabitacionData.listarTipodeHabitaciones().toArray()));
    }
//llena los combos con la info de cada uno 
    private void cargarHabitacionesDisponiblesModificar() {
        TipodeHabitacion tipoHabitacionSeleccionado = (TipodeHabitacion) jcTipoHabitacion.getSelectedItem();

        if (tipoHabitacionSeleccionado != null) {
            mostrarHabitacionesDisponibles(tipoHabitacionSeleccionado);
        }
    }

}
