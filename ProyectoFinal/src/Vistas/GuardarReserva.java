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
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GuardarReserva extends javax.swing.JPanel {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {

            return false;

        }
    };
    private HabitacionData habitacionData;
    private TipodeHabitacionData tipoDeHabitacionData;

    public GuardarReserva() {
        initComponents();
        HuespedData huespedData = new HuespedData();
        ReservaData reservaData = new ReservaData();
        armarCabecera();
        cargarTiposHabitacion();
        HabitacionData habitacionData = new HabitacionData();
        this.tipoDeHabitacionData = new TipodeHabitacionData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtIdHuesped = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtcantidadperso = new javax.swing.JTextField();
        jdFentrada = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jdfeSalida = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jcTipoHabitacion = new javax.swing.JComboBox();
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

        jButton2.setText("jButton2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Nueva Reserva");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Reserve.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Codigo De Huesped");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Fecha De Entrada");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Fecha De Salida");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Tipo De Habitacion");

        jcTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoHabitacionActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        jScrollPane1.setViewportView(JtHabitacionesDispo);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        jLabel11.setText("Codigo De Habitacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jblimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtIdHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtcantidadperso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jdFentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Jchekestado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jdfeSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtCodigoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtMontoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtIdHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtcantidadperso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jchekestado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jcTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdFentrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdfeSalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCodigoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtMontoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbguardar))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarActionPerformed

        try {
            // Obtener los datos del formulario
            String idHuespedStr = jtIdHuesped.getText();
            String cantidadPersonasStr = jtcantidadperso.getText();
            String codigoHabitacion = jtCodigoHabitacion.getText();
            boolean estado = Jchekestado.isSelected();

            // Validar los campos de entrada
            if (idHuespedStr.isEmpty() || cantidadPersonasStr.isEmpty() || codigoHabitacion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor complete todos los campos obligatorios ");
                return;  // Salir del método si faltan datos
            }

            int idHuesped = Integer.parseInt(idHuespedStr);
            int cantidadPersonas = Integer.parseInt(cantidadPersonasStr);

            LocalDate fechaEntrada = jdFentrada.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaSalida = jdfeSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Validar que las fechas de entrada y salida sean coherentes
            if (fechaEntrada.isAfter(fechaSalida)) {
                JOptionPane.showMessageDialog(this, "La fecha de entrada no puede ser posterior a la fecha de salida.");
                return;  // Salir del método si las fechas son incoherentes
            }

            // Obtener el tipo de habitación seleccionado en el JComboBox
            TipodeHabitacion tipoHabitacion = (TipodeHabitacion) jcTipoHabitacion.getSelectedItem();

            // Calcular el monto total de la reserva
            long numNoches = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
            double monto = numNoches * tipoHabitacion.getPrecioNoche();

            // Crear una instancia de Reserva
            Reserva reserva = new Reserva();
            Huesped huesped = new Huesped();
            Habitacion habitacion = new Habitacion();
            huesped.setIdHuesped(idHuesped);
            reserva.setHuesped(huesped);
            reserva.setEstado(estado);
            reserva.setCantidadPerso(cantidadPersonas);
            reserva.setFechaEntrada(fechaEntrada);
            reserva.setFechaSalida(fechaSalida);
            reserva.setTipoHabitacion(tipoHabitacion);
            reserva.setHabitacion(habitacion);
            reserva.setMonto(monto);

            // Guardar la reserva en la base de datos
            ReservaData reservaData = new ReservaData();
            reservaData.guardarReserva(reserva);

// Notificar al usuario que la reserva se ha guardado con éxito
            JOptionPane.showMessageDialog(this, "Reserva guardada con éxito");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, " Ingresa valores válidos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar la reserva: " + ex.getMessage());
        }


    }//GEN-LAST:event_jbguardarActionPerformed

    private void jblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimpiarActionPerformed
        limpiarFormulario();

    }//GEN-LAST:event_jblimpiarActionPerformed

    private void jcTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoHabitacionActionPerformed


    }//GEN-LAST:event_jcTipoHabitacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Jchekestado;
    private javax.swing.JTable JtHabitacionesDispo;
    private javax.swing.JTextField JtMontoApagar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JComboBox jcTipoHabitacion;
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

    private void cargarHabitacionesDisponibles() {
        try {
            // Obtener el tipo de habitación seleccionado en el ComboBox
            TipodeHabitacion tipoHabitacion = (TipodeHabitacion) jcTipoHabitacion.getSelectedItem();

            // Obtener la fecha de entrada y fecha de salida
            LocalDate fechaEntrada = jdFentrada.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaSalida = jdfeSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Obtener las habitaciones disponibles para el tipo de habitación y fechas seleccionadas
            HabitacionData habitacionData = new HabitacionData();
            List<Habitacion> habitacionesDisponibles = habitacionData.obtenerHabitacionesDisponibles(tipoHabitacion.getIdTipoHabitacion(), fechaEntrada, fechaSalida);

            // Mostrar las habitaciones disponibles en la tabla
            DefaultTableModel model = (DefaultTableModel) JtHabitacionesDispo.getModel();
            model.setRowCount(0);
            for (Habitacion habitacion : habitacionesDisponibles) {
                model.addRow(new Object[]{habitacion.getIdHabitacion(), habitacion.getNumero(), habitacion.getPiso()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar habitaciones disponibles: " + ex.getMessage());
        }
    }

    private void armarCabecera() {
        modelo.addColumn("IdHabitacion");
        modelo.addColumn("numero");
        modelo.addColumn("piso");
        modelo.addColumn("estado");
        modelo.addColumn("Id TipodeHabitacion");
        JtHabitacionesDispo.setModel(modelo);
    }

    private void cargarTiposHabitacion() {
        // Obtén la lista de tipos de habitación desde TipoDeHabitacionData
        List<TipodeHabitacion> tiposHabitacion = tipoDeHabitacionData.listarTipodeHabitaciones();

        // Crea un nuevo modelo de ComboBox para tipos de habitación
        DefaultComboBoxModel<TipodeHabitacion> model = new DefaultComboBoxModel<>();

        // Agrega cada tipo de habitación al modelo del ComboBox
        tiposHabitacion.forEach((tipo) -> {
            model.addElement(tipo);
        });

      
        jcTipoHabitacion.setModel(model);
    }

}
