package com.mycompany.proyectofinal.InterfazCliente;

import com.mycompany.proyectofinal.InfoClase;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mende
 */
public class PanelHorarioCliente extends javax.swing.JPanel {

    /**
     * Creates new form PanelHorarioC
     */
    public PanelHorarioCliente() {
        initComponents();
        llenarTabla();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHorarioCliente = new javax.swing.JTable();
        campoFecha = new javax.swing.JTextField();
        campoHoraIn = new javax.swing.JTextField();
        campoHoraFin = new javax.swing.JTextField();
        campoInstructor = new javax.swing.JTextField();
        campoClase = new javax.swing.JTextField();
        botonInscribirse = new javax.swing.JButton();
        FondoHorario = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaHorarioCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaHorarioCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaHorarioClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaHorarioCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, -1));

        campoFecha.setFocusable(false);
        jPanel1.add(campoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 290, 30));

        campoHoraIn.setFocusable(false);
        jPanel1.add(campoHoraIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 290, 30));

        campoHoraFin.setFocusable(false);
        jPanel1.add(campoHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 290, 30));

        campoInstructor.setFocusable(false);
        jPanel1.add(campoInstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 290, 30));

        campoClase.setFocusable(false);
        jPanel1.add(campoClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 290, 30));

        botonInscribirse.setBackground(new java.awt.Color(246, 104, 68));
        botonInscribirse.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        botonInscribirse.setForeground(new java.awt.Color(255, 255, 255));
        botonInscribirse.setText("Inscribirse");
        jPanel1.add(botonInscribirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 210, 50));

        FondoHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Horario Cliente.png"))); // NOI18N
        jPanel1.add(FondoHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 520, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Fondo.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaHorarioClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHorarioClienteMouseClicked
        // TODO add your handling code here:
        int fila = tablaHorarioCliente.rowAtPoint(evt.getPoint());
        campoFecha.setText(tablaHorarioCliente.getValueAt(fila, 2).toString());
        campoHoraIn.setText(tablaHorarioCliente.getValueAt(fila, 3).toString());
        campoHoraFin.setText(tablaHorarioCliente.getValueAt(fila, 4).toString());
        campoInstructor.setText(tablaHorarioCliente.getValueAt(fila, 5).toString());
        campoClase.setText(tablaHorarioCliente.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_tablaHorarioClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoHorario;
    private javax.swing.JButton botonInscribirse;
    private javax.swing.JTextField campoClase;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoHoraFin;
    private javax.swing.JTextField campoHoraIn;
    private javax.swing.JTextField campoInstructor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaHorarioCliente;
    // End of variables declaration//GEN-END:variables
InfoClase infoclase = new InfoClase();

//LLENAR TABLA  
    public void llenarTabla() {
        InfoClase f = new InfoClase();
        try {
            // Llamar a la función consultarTodos() de FuncionesEstudiante
            DefaultTableModel model = f.consultaParaHorarios();

            // Actualizar la tabla con los datos obtenidos de la consulta
            tablaHorarioCliente.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Aquí puedes agregar algún mensaje de error en caso de que ocurra un problema con la consulta
        }
    }
//CAMPOS DESHABILITADOS
        public void desabilitados() {
        campoFecha.setEnabled(false);
        campoHoraIn.setEnabled(false);
        campoHoraFin.setEnabled(false);
        campoInstructor.setEnabled(false);
        campoClase.setEnabled(false);
    }
    
}