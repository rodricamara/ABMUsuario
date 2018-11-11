package IUGestionarUsuario;

import GestionarUsuario.ControladorGestionarUsuario;
import GestionarUsuario.DTOUsuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IUGestionarUsuarioModificar extends javax.swing.JFrame {

    String nombreUsuario;
    public static DTOUsuario dtoUsuario;

    ControladorGestionarUsuario controlador = new ControladorGestionarUsuario();

    public IUGestionarUsuarioModificar(DTOUsuario x) {
        initComponents();
        dtoUsuario = x;
        setearUsuarioAModificar(dtoUsuario);
    }

    private void setearUsuarioAModificar(DTOUsuario x) {
        textfield_nombre.setText(x.getNombreDTOUsuario());
        textfield_apellido.setText(x.getApellidoDTOUsuario());
        textfield_dir.setText(x.getDomicilioDTOUsuario());
        textfield_edad.setText(x.getEdadDTOUsuario());
        combo_TipoUsuario.addItem(x.getTipoUsuarioDTOUsuario());
    }

    public void setearNombreUsuario(String nombreUsuario) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        label_direccion = new javax.swing.JLabel();
        label_edad = new javax.swing.JLabel();
        label_tipo_usuario = new javax.swing.JLabel();
        combo_TipoUsuario = new javax.swing.JComboBox<>();
        button_Aceptar = new javax.swing.JButton();
        button_Cancelar = new javax.swing.JButton();
        textfield_direccion = new javax.swing.JPasswordField();
        textfield_edad = new javax.swing.JTextField();
        textfield_nombre = new javax.swing.JTextField();
        textfield_dir = new javax.swing.JTextField();
        textfield_apellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Modificar Usuario");

        label_nombre.setText("Nombre Usuario:");

        label_apellido.setText("Apellido Usuario:");

        label_direccion.setText("Dirección:");

        label_edad.setText("Edad:");

        label_tipo_usuario.setText("Tipo Usuario:");

        combo_TipoUsuario.setEnabled(false);
        combo_TipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_TipoUsuarioActionPerformed(evt);
            }
        });

        button_Aceptar.setText("Aceptar");
        button_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AceptarActionPerformed(evt);
            }
        });

        button_Cancelar.setText("Cancelar");
        button_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CancelarActionPerformed(evt);
            }
        });

        textfield_direccion.setUI(null);

        textfield_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_nombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_tipo_usuario)
                                    .addComponent(label_edad)
                                    .addComponent(label_direccion))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(textfield_direccion)
                                        .addGap(206, 206, 206))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(textfield_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(textfield_nombre)
                                            .addComponent(textfield_dir, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(textfield_edad)
                                            .addComponent(combo_TipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_apellido)
                                    .addComponent(label_nombre))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(button_Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nombre)
                    .addComponent(textfield_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_apellido)
                    .addComponent(textfield_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(textfield_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_dir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_direccion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_edad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_tipo_usuario))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Cancelar)
                    .addComponent(button_Aceptar))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AceptarActionPerformed

    }//GEN-LAST:event_button_AceptarActionPerformed

    private void button_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CancelarActionPerformed
        try {
            this.dispose();
            IUGestionarUsuario iu = new IUGestionarUsuario();
            iu.setLocationRelativeTo(null);
            iu.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(IUGestionarUsuarioAlta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_CancelarActionPerformed

    private void textfield_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_nombreActionPerformed

    private void combo_TipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_TipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_TipoUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IUGestionarUsuarioModificar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUGestionarUsuarioModificar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUGestionarUsuarioModificar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUGestionarUsuarioModificar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUGestionarUsuarioModificar(dtoUsuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Aceptar;
    private javax.swing.JButton button_Cancelar;
    private javax.swing.JComboBox<String> combo_TipoUsuario;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_direccion;
    private javax.swing.JLabel label_edad;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_tipo_usuario;
    private javax.swing.JTextField textfield_apellido;
    private javax.swing.JTextField textfield_dir;
    private javax.swing.JPasswordField textfield_direccion;
    private javax.swing.JTextField textfield_edad;
    private javax.swing.JTextField textfield_nombre;
    // End of variables declaration//GEN-END:variables


}
