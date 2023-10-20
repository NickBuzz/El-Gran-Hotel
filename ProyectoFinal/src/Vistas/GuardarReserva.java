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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class GuardarReserva extends javax.swing.JPanel {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {

            return false;

        }
    };
    private HabitacionData habitacionData;
    private TipodeHabitacionData tipoDeHabitacionData;
    private HuespedData huespedData;
    private ReservaData reservaData;
    private Huesped selectedHuesped;
    private Habitacion selectedHabitacion;

    public GuardarReserva() {
        initComponents();
        this.huespedData = new HuespedData();
        this.habitacionData = new HabitacionData();
        this.reservaData = new ReservaData();
        this.tipoDeHabitacionData = new TipodeHabitacionData();
        armarCabecera();
        cargarTiposHabitacion();
        cargarHuespedes();
        jtCodigoHabitacion.setEnabled(false);
        JtMontoApagar.setEnabled(false);
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        JtHabitacionesDispo.setRowSorter(sorter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
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

        jButton2.setText("jButton2");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nueva Reserva");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Codigo De Huesped");

        jtIdHuesped.setEditable(false);
        jtIdHuesped.setFocusable(false);

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
        JtHabitacionesDispo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtHabitacionesDispoMouseClicked(evt);
            }
        });
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

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jblimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtcantidadperso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jchekestado, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdfeSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtCodigoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JtMontoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1))
                        .addGap(50, 50, 50))))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JtMontoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCodigoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
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

            selectedHabitacion.setEstado(false);
            habitacionData.modificarHabitacion(selectedHabitacion);
            
            reserva.setHuesped(selectedHuesped);
            reserva.setEstado(estado);
            reserva.setCantidadPerso(cantidadPersonas);
            reserva.setFechaEntrada(fechaEntrada);
            reserva.setFechaSalida(fechaSalida);
            reserva.setTipoHabitacion(tipoHabitacion);
            reserva.setHabitacion(selectedHabitacion);
            reserva.setMonto(monto);

            // Guardar la reserva en la base de datos
            reservaData.guardarReserva(reserva);
            limpiarFormulario();

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

        cargarHabitacionesDisponibles();
    }//GEN-LAST:event_jcTipoHabitacionActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        selectedHuesped = (Huesped) jComboBox1.getSelectedItem();
        if (selectedHuesped != null) {

            jtIdHuesped.setText(String.valueOf(selectedHuesped.getIdHuesped()));
        }


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void JtHabitacionesDispoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtHabitacionesDispoMouseClicked
        int filaSeleccionada = JtHabitacionesDispo.getSelectedRow();
        if (filaSeleccionada != -1) {
            Object valorId = JtHabitacionesDispo.getValueAt(filaSeleccionada, 0);
            Object valorMonto = JtHabitacionesDispo.getValueAt(filaSeleccionada, 4);
            jtCodigoHabitacion.setText(String.valueOf(valorId));
            selectedHabitacion = habitacionData.buscarHabitacion((int) valorId);
            if (jdFentrada != null && jdfeSalida != null) {
                // Calcular el monto total de la reserva
                LocalDate fechaEntrada = jdFentrada.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fechaSalida = jdfeSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                long numNoches = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
                TipodeHabitacion tp = tipoDeHabitacionData.buscarTipoHabitacion((int) valorMonto);
                double monto = numNoches * tp.getPrecioNoche();
                JtMontoApagar.setText(String.valueOf(monto));
            }
        }
    }//GEN-LAST:event_JtHabitacionesDispoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Jchekestado;
    private javax.swing.JTable JtHabitacionesDispo;
    private javax.swing.JTextField JtMontoApagar;
    private javax.swing.JButton jButton2;
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

    private void cargarHabitacionesDisponibles() {
        try {
            // Obtener el tipo de habitación seleccionado en el ComboBox
            int index = jcTipoHabitacion.getSelectedIndex();
            TipodeHabitacion tipoHabitacion = jcTipoHabitacion.getItemAt(index);
            System.out.println(index);
            // Obtener la fecha de entrada y fecha de salida
            //LocalDate fechaEntrada = jdFentrada.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            //LocalDate fechaSalida = jdfeSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Obtener las habitaciones disponibles para el tipo de habitación y fechas seleccionadas
            //HabitacionData habitacionData = new HabitacionData();
            List<Habitacion> habitacionesDisponibles = habitacionData.obtenerTipoHabitacion(tipoHabitacion.getIdTipoHabitacion());
            System.out.println(tipoHabitacion.getIdTipoHabitacion());
            // Mostrar las habitaciones disponibles en la tabla
            DefaultTableModel model = (DefaultTableModel) JtHabitacionesDispo.getModel();
            model.setRowCount(0);
            for (Habitacion habitacion : habitacionesDisponibles) {
                model.addRow(new Object[]{
                    habitacion.getIdHabitacion(),
                    habitacion.getNumero(),
                    habitacion.getPiso(),
                    habitacion.isEstado()? "LIBRE":"OCUPADA",
                    habitacion.getIdTDHabitacion().getIdTipoHabitacion()});
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

        List<TipodeHabitacion> tiposHabitacion = tipoDeHabitacionData.listarTipodeHabitaciones();

        // Crea un nuevo modelo de ComboBox para tipos de habitación
        DefaultComboBoxModel<TipodeHabitacion> model = new DefaultComboBoxModel<>();

        // Agrega cada tipo de habitación al modelo del ComboBox
        tiposHabitacion.forEach((tipo) -> {
            model.addElement(tipo);
        });

        jcTipoHabitacion.setModel(model);
    }

    private void cargarHuespedes() {
// lista de huéspedes desde HuespedData
        List<Huesped> huespedes = huespedData.listarHuespedes();

        DefaultComboBoxModel<Huesped> model = new DefaultComboBoxModel<>();

        huespedes.forEach((huesped) -> {
            model.addElement(huesped);
        });

        jComboBox1.setModel(model);
    }

}
