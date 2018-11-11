package IUGestionarUsuario;

import GestionarUsuario.DTOTipoUsuario;
import GestionarUsuario.ControladorGestionarUsuario;
import GestionarUsuario.DTOUsuario;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.WindowConstants;

public class IUGestionarUsuarioAlta extends javax.swing.JFrame {

    ControladorGestionarUsuario controlador = new ControladorGestionarUsuario();

    public IUGestionarUsuarioAlta() {
        initComponents();
        llenarComboTipoUsuario();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                dispose();
                IUGestionarUsuario iu = new IUGestionarUsuario();
                iu.setVisible(true);
            }
        });
    }

    public void llenarComboTipoUsuario() {
        try {
            ArrayList<DTOTipoUsuario> listDtoTipoUsuario = controlador.selectAllUsersTypes();
            for (DTOTipoUsuario dtoTipoUsuario : listDtoTipoUsuario) {
                comboBox_tipoUsuario.addItem(dtoTipoUsuario.getNombreDTOTipoUsuario());
            }
        } catch (Exception ex) {
            Logger.getLogger(IUGestionarUsuarioAlta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_nombre = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        label_direccion = new javax.swing.JLabel();
        label_tipo_usuario = new javax.swing.JLabel();
        textfield_nombre = new javax.swing.JTextField();
        textfield_direccion = new javax.swing.JTextField();
        textfield_apellido = new javax.swing.JTextField();
        comboBox_tipoUsuario = new javax.swing.JComboBox<>();
        button_crear = new javax.swing.JButton();
        button_atras = new javax.swing.JButton();
        label_edad = new javax.swing.JLabel();
        textfield_edad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_nombre.setText("Nombre");

        label_apellido.setText("Apellido");

        label_direccion.setText("Dirección");

        label_tipo_usuario.setText("Tipo Usuario");

        textfield_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_nombreActionPerformed(evt);
            }
        });

        comboBox_tipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_tipoUsuarioActionPerformed(evt);
            }
        });

        button_crear.setText("Crear");
        button_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_crearActionPerformed(evt);
            }
        });

        button_atras.setText("Atrás");
        button_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_atrasActionPerformed(evt);
            }
        });

        label_edad.setText("Edad");

        textfield_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_edadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(button_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(button_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nombre)
                    .addComponent(label_apellido)
                    .addComponent(label_direccion)
                    .addComponent(label_tipo_usuario)
                    .addComponent(label_edad))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textfield_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(textfield_nombre)
                    .addComponent(textfield_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(comboBox_tipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textfield_edad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nombre)
                    .addComponent(textfield_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_apellido)
                    .addComponent(textfield_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_direccion)
                    .addComponent(textfield_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_edad)
                    .addComponent(textfield_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tipo_usuario)
                    .addComponent(comboBox_tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_crear)
                    .addComponent(button_atras))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboBox_tipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_tipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_tipoUsuarioActionPerformed

    private void button_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_crearActionPerformed

        String nom = textfield_nombre.getText();
        String ape = textfield_apellido.getText();
        String dir = textfield_direccion.getText();
        String edad = textfield_edad.getText();
        String tu = comboBox_tipoUsuario.getSelectedItem().toString();

        DTOUsuario dtoUsuario = new DTOUsuario(nom, ape, dir, edad, "1");
        controlador.insertInUser(dtoUsuario);
        this.dispose();
        IUGestionarUsuario iu = new IUGestionarUsuario();
        iu.setVisible(true);


    }//GEN-LAST:event_button_crearActionPerformed

    private void button_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_atrasActionPerformed
        this.dispose();
        IUGestionarUsuario iu = new IUGestionarUsuario();
        iu.setLocationRelativeTo(null);
        iu.setVisible(true);
    }//GEN-LAST:event_button_atrasActionPerformed

    private void textfield_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_nombreActionPerformed

    private void textfield_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_edadActionPerformed

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
            java.util.logging.Logger.getLogger(IUGestionarUsuarioAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUGestionarUsuarioAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUGestionarUsuarioAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUGestionarUsuarioAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUGestionarUsuarioAlta().setVisible(true);
            }
        });
    }

    // Setter para el controlador
    /*
    public void setControlador(ControladorGestionarItem controlador) {
        this.controlador = controlador;
    }
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_atras;
    private javax.swing.JButton button_crear;
    private javax.swing.JComboBox<String> comboBox_tipoUsuario;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_direccion;
    private javax.swing.JLabel label_edad;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_tipo_usuario;
    private javax.swing.JTextField textfield_apellido;
    private javax.swing.JTextField textfield_direccion;
    private javax.swing.JTextField textfield_edad;
    private javax.swing.JTextField textfield_nombre;
    // End of variables declaration//GEN-END:variables
}
