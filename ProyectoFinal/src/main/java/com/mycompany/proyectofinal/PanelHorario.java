/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

/**
 *
 * @author shang
 */
public class PanelHorario extends javax.swing.JPanel {

    /**
     * Creates new form PanelHorario
     */
    public PanelHorario() {
        initComponents();
        llenarTabla();
        llenarcomboClase();
        llenarcomboInstructor();
        TableColumn columna;
        columna = tabla1.getColumnModel().getColumn(0);
        columna.setPreferredWidth(40);
        columna.setMaxWidth(40);
        columna.setMinWidth(40);
        tabla1.setRowHeight(20);
        desabilitados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TablaInstructores = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        rbNuevahorario = new javax.swing.JRadioButton();
        btnselecionar = new javax.swing.JButton();
        rbAcutalizar = new javax.swing.JRadioButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        cmbfechaYear = new javax.swing.JComboBox<>();
        cmbfechaDia = new javax.swing.JComboBox<>();
        cmbfechaMes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbInicioHora = new javax.swing.JComboBox<>();
        cmbInicioMinutos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboClase = new javax.swing.JComboBox<>();
        cmbFinalizacionHora = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comboIdClase = new javax.swing.JComboBox<>();
        cmbFinalizacionMinutos = new javax.swing.JComboBox<>();
        comboInstructor1 = new javax.swing.JComboBox<>();
        comboIdInstructor = new javax.swing.JComboBox<>();
        lbId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla1.setForeground(new java.awt.Color(0, 0, 0));
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE CLASE", "FECHA", "HORA iNICIO", "HORA FINALIZACION", "INSTRUCTOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla1.getTableHeader().setReorderingAllowed(false);
        TablaInstructores.setViewportView(tabla1);

        add(TablaInstructores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 647, 410));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbNuevahorario.setText("Crear Nueva Horario");
        rbNuevahorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNuevahorarioActionPerformed(evt);
            }
        });
        jPanel1.add(rbNuevahorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 14, -1, -1));

        btnselecionar.setText("Seleccionar");
        btnselecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselecionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnselecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 12, -1, -1));

        rbAcutalizar.setText("Actualizar");
        rbAcutalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAcutalizarActionPerformed(evt);
            }
        });
        jPanel1.add(rbAcutalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 52, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 50, 98, -1));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setText("Clase");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setText("Hora Finalizacion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setText("Año");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(246, 104, 68));
        btnRegistrar.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 140, 50));

        cmbfechaYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023" }));
        cmbfechaYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbfechaYearActionPerformed(evt);
            }
        });
        jPanel1.add(cmbfechaYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        cmbfechaDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbfechaDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbfechaDiaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbfechaDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        cmbfechaMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cmbfechaMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbfechaMesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbfechaMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel5.setText("Fecha");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel6.setText("Dia");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel7.setText("Mes");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        cmbInicioHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        cmbInicioHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInicioHoraActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInicioHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        cmbInicioMinutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "10", "20", "30", "40", "50" }));
        cmbInicioMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInicioMinutosActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInicioMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel8.setText("Minutos");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel9.setText("Hora");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel10.setText("Minutos");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        comboClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClaseActionPerformed(evt);
            }
        });
        jPanel1.add(comboClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 110, -1));

        cmbFinalizacionHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22" }));
        cmbFinalizacionHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFinalizacionHoraActionPerformed(evt);
            }
        });
        jPanel1.add(cmbFinalizacionHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel11.setText("Hora");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel12.setText("Hora Inicio");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel13.setText("Instructor");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        comboIdClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdClaseActionPerformed(evt);
            }
        });
        jPanel1.add(comboIdClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 40, 20));

        cmbFinalizacionMinutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "10", "20", "30", "40", "50" }));
        cmbFinalizacionMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFinalizacionMinutosActionPerformed(evt);
            }
        });
        jPanel1.add(cmbFinalizacionMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        comboInstructor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboInstructor1ActionPerformed(evt);
            }
        });
        jPanel1.add(comboInstructor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 90, -1));

        comboIdInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdInstructorActionPerformed(evt);
            }
        });
        jPanel1.add(comboIdInstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 50, 20));
        jPanel1.add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 30, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 300, 410));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Fondo.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1040, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void rbNuevahorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNuevahorarioActionPerformed
        // TODO add your handling code here:
        if (rbNuevahorario.isSelected()) {
            //limpiar();
            rbAcutalizar.setSelected(false);
            abilitados();
        }
    }//GEN-LAST:event_rbNuevahorarioActionPerformed

    private void btnselecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselecionarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tabla1.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtener los valores de la fila seleccionada
            int idClase = (int) tabla1.getValueAt(filaSeleccionada, 0);
            lbId.setText(String.valueOf(idClase));
        } else {
            // Si no hay fila seleccionada, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "Selecciona una fila Para Acutalizar.");
        }
    }//GEN-LAST:event_btnselecionarActionPerformed

    private void rbAcutalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAcutalizarActionPerformed
        // TODO add your handling code here:
        if (rbAcutalizar.isSelected()) {
            rbNuevahorario.setSelected(false);
            abilitados();
            JOptionPane.showMessageDialog(null, "Al Actualizar debe volver a \nselecionar todos los datos","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_rbAcutalizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tabla1.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtener los valores de la fila seleccionada
            int idClase = (int) tabla1.getValueAt(filaSeleccionada, 0);
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este registro?",
                    "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                infoclase.eliminarHorario(idClase);
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
            }
        } else {
            // Si no hay fila seleccionada, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "Selecciona una fila Para Acutalizar.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {
            if (rbNuevahorario.isSelected()) {
                insertaDatos();
            } else if (rbAcutalizar.isSelected()) {
                ModificarDatos();
            } else {
                JOptionPane.showMessageDialog(null, "Debe Selecionar una Accion");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cmbfechaYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbfechaYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbfechaYearActionPerformed

    private void cmbfechaDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbfechaDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbfechaDiaActionPerformed

    private void cmbfechaMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbfechaMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbfechaMesActionPerformed

    private void cmbInicioHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInicioHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbInicioHoraActionPerformed

    private void cmbInicioMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInicioMinutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbInicioMinutosActionPerformed

    private void comboClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClaseActionPerformed

    private void cmbFinalizacionHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFinalizacionHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFinalizacionHoraActionPerformed

    private void comboIdClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboIdClaseActionPerformed

    private void cmbFinalizacionMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFinalizacionMinutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFinalizacionMinutosActionPerformed

    private void comboInstructor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboInstructor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboInstructor1ActionPerformed

    private void comboIdInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdInstructorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboIdInstructorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TablaInstructores;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnselecionar;
    private javax.swing.JComboBox<String> cmbFinalizacionHora;
    private javax.swing.JComboBox<String> cmbFinalizacionMinutos;
    private javax.swing.JComboBox<String> cmbInicioHora;
    private javax.swing.JComboBox<String> cmbInicioMinutos;
    private javax.swing.JComboBox<String> cmbfechaDia;
    private javax.swing.JComboBox<String> cmbfechaMes;
    private javax.swing.JComboBox<String> cmbfechaYear;
    private javax.swing.JComboBox<String> comboClase;
    private javax.swing.JComboBox<String> comboIdClase;
    private javax.swing.JComboBox<String> comboIdInstructor;
    private javax.swing.JComboBox<String> comboInstructor1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbId;
    private javax.swing.JRadioButton rbAcutalizar;
    private javax.swing.JRadioButton rbNuevahorario;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
InfoClase infoclase = new InfoClase();

    public void llenarTabla() {
        InfoClase f = new InfoClase();
        try {
            // Llamar a la función consultarTodos() de FuncionesEstudiante
            DefaultTableModel model = f.consultaParaHorarios();

            // Actualizar la tabla con los datos obtenidos de la consulta
            tabla1.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Aquí puedes agregar algún mensaje de error en caso de que ocurra un problema con la consulta
        }
    }

    public void llenarcomboInstructor() {
        InfoClase f = new InfoClase();
        ArrayList<String> nombresInstructores = f.cargarInstructores();
        comboInstructor1.removeAllItems();
        for (String nombre : nombresInstructores) {
            comboInstructor1.addItem(nombre);
        }
        ArrayList<String> nombresIDInstructores = f.cargarIdInstrucores();
        comboIdInstructor.removeAllItems();
        for (String nombre : nombresIDInstructores) {
            comboIdInstructor.addItem(nombre);
        }
    }

    public void llenarcomboClase() {
        InfoClase f = new InfoClase();
        ArrayList<String> nombresClases = f.cargarClases();
        comboClase.removeAllItems();
        for (String nombre : nombresClases) {
            comboClase.addItem(nombre);
        }
        ArrayList<String> nombresidClases = f.cargarIdClases();
        comboIdClase.removeAllItems();
        for (String nombre : nombresidClases) {
            comboIdClase.addItem(nombre);
        }
    }

    public void insertaDatos() {
        try {
            String horaInicio = cmbInicioHora.getSelectedItem() + ":" + cmbInicioMinutos.getSelectedItem() + ":00";
            String horaFinalizacion = cmbFinalizacionHora.getSelectedItem() + ":" + cmbFinalizacionMinutos.getSelectedItem() + ":00";
            String fecha = cmbfechaYear.getSelectedItem() + "-" + cmbfechaMes.getSelectedItem() + "-" + cmbfechaDia.getSelectedItem();
            int posicion = comboClase.getSelectedIndex();
            int NombreClase = Integer.parseInt(comboIdClase.getItemAt(posicion));
            int posicion2 = comboInstructor1.getSelectedIndex();
            int NombreInstrictor = Integer.parseInt(comboIdInstructor.getItemAt(posicion2));
            int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de insertar estos datos?",
                    "Confirmación de inserción", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                infoclase.insertarHorarios(fecha, horaInicio, horaFinalizacion, NombreInstrictor, NombreClase);
                llenarTabla();
                //limpiar();
                JOptionPane.showMessageDialog(null, "Registro Insertado");
            } else {
                JOptionPane.showMessageDialog(null, "Inserción cancelada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de datos no valido");
            e.printStackTrace();
        }
    }

    public void ModificarDatos() {
        try {
            String horaInicio = cmbInicioHora.getSelectedItem() + ":" + cmbInicioMinutos.getSelectedItem() + ":00";
            String horaFinalizacion = cmbFinalizacionHora.getSelectedItem() + ":" + cmbFinalizacionMinutos.getSelectedItem() + ":00";
            String fecha = cmbfechaYear.getSelectedItem() + "-" + cmbfechaMes.getSelectedItem() + "-" + cmbfechaDia.getSelectedItem();
            int posicion = comboClase.getSelectedIndex();
            int NombreClase = Integer.parseInt(comboIdClase.getItemAt(posicion));
            int posicion2 = comboInstructor1.getSelectedIndex();
            int NombreInstrictor = Integer.parseInt(comboIdInstructor.getItemAt(posicion2));
            int id = Integer.parseInt(lbId.getText());
            int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de actualizar estos datos?",
                    "Confirmación de actualización", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                infoclase.modificarHorario(fecha, horaInicio, horaFinalizacion, NombreInstrictor, NombreClase, id);
                llenarTabla();
                //limpiar();
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Actualización cancelada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de datos no valido");
            e.printStackTrace();
        }
    }

//    public void limpiar() {
//        lbid.setText(String.valueOf(0));
//        txtNombreClase2.setText("");
//        txtDescripcion.setText("");
//        txtCupoMaximo.setText(String.valueOf(""));
//    }

    public void desabilitados() {
        comboClase.setEnabled(false);
        comboInstructor1.setEnabled(false);
        cmbFinalizacionHora.setEnabled(false);
        cmbFinalizacionMinutos.setEnabled(false);
        cmbInicioHora.setEnabled(false);
        cmbInicioMinutos.setEnabled(false);
        cmbfechaDia.setEnabled(false);
        cmbfechaMes.setEnabled(false);
        cmbfechaYear.setEnabled(false);
        btnRegistrar.setEnabled(false);
        comboIdClase.setVisible(false);
        comboIdInstructor.setVisible(false);
    }

    public void abilitados() {
        comboClase.setEnabled(true);
        comboInstructor1.setEnabled(true);
        cmbFinalizacionHora.setEnabled(true);
        cmbFinalizacionMinutos.setEnabled(true);
        cmbInicioHora.setEnabled(true);
        cmbInicioMinutos.setEnabled(true);
        cmbfechaDia.setEnabled(true);
        cmbfechaMes.setEnabled(true);
        cmbfechaYear.setEnabled(true);
        btnRegistrar.setEnabled(true);
    }
}