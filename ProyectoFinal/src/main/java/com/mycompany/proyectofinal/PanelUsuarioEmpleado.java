package com.mycompany.proyectofinal;
/**
 *
 * @author Dabney Arosemena Alpízar
 */
public class PanelUsuarioEmpleado extends javax.swing.JPanel {

    /**
     * Creates new form PanelUsuarios
     */
    public PanelUsuarioEmpleado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoConstEmpleado = new javax.swing.JComboBox<>();
        BotonBuscarUsuario = new javax.swing.JButton();
        BotonActualizarUsuario = new javax.swing.JButton();
        BotonBorrarUsuario = new javax.swing.JButton();
        BotonRegistarUsuario = new javax.swing.JButton();
        campoNombre = new javax.swing.JTextField();
        campoContraseña = new javax.swing.JTextField();
        CampoBuscarUsuario = new javax.swing.JTextField();
        campoVerContraseña = new javax.swing.JTextField();
        FondoRegistroUsuarios = new javax.swing.JLabel();
        TablaUsuarios = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Codigo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(990, 460));
        setPreferredSize(new java.awt.Dimension(990, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoConstEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado" }));
        add(campoConstEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, -1));

        BotonBuscarUsuario.setBackground(new java.awt.Color(246, 104, 68));
        BotonBuscarUsuario.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonBuscarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscarUsuario.setText("Buscar");
        BotonBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarUsuarioActionPerformed(evt);
            }
        });
        add(BotonBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 90, 20));

        BotonActualizarUsuario.setBackground(new java.awt.Color(246, 104, 68));
        BotonActualizarUsuario.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonActualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonActualizarUsuario.setText("Actualizar");
        BotonActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarUsuarioActionPerformed(evt);
            }
        });
        add(BotonActualizarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 140, 50));

        BotonBorrarUsuario.setBackground(new java.awt.Color(246, 104, 68));
        BotonBorrarUsuario.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonBorrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonBorrarUsuario.setText("Borrar");
        BotonBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarUsuarioActionPerformed(evt);
            }
        });
        add(BotonBorrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 140, 50));

        BotonRegistarUsuario.setBackground(new java.awt.Color(246, 104, 68));
        BotonRegistarUsuario.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonRegistarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistarUsuario.setText("Registrar");
        BotonRegistarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistarUsuarioActionPerformed(evt);
            }
        });
        add(BotonRegistarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 140, 50));
        add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 320, 30));
        add(campoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 320, 30));
        add(CampoBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 70, 20));
        add(campoVerContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 320, 30));

        FondoRegistroUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        FondoRegistroUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Registro de Usuarios Internos.png"))); // NOI18N
        add(FondoRegistroUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 550, 420));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaUsuarios.setViewportView(jTable1);

        add(TablaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 360));

        Codigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Código.png"))); // NOI18N
        add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Fondo.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegistarUsuarioActionPerformed

    private void BotonBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonBorrarUsuarioActionPerformed

    private void BotonActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonActualizarUsuarioActionPerformed

    private void BotonBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonBuscarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizarUsuario;
    private javax.swing.JButton BotonBorrarUsuario;
    private javax.swing.JButton BotonBuscarUsuario;
    private javax.swing.JButton BotonRegistarUsuario;
    private javax.swing.JTextField CampoBuscarUsuario;
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoRegistroUsuarios;
    private javax.swing.JScrollPane TablaUsuarios;
    private javax.swing.JComboBox<String> campoConstEmpleado;
    private javax.swing.JTextField campoContraseña;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoVerContraseña;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}