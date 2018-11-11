package IUGestionarUsuario;

import GestionarUsuario.ControladorGestionarUsuario;
import GestionarUsuario.DTOUsuario;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.RowFilter;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class IUGestionarUsuario extends javax.swing.JFrame {

    ControladorGestionarUsuario controlador = new ControladorGestionarUsuario();

    public IUGestionarUsuario() {
        initComponents();
        selectAllUsers();
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                dispose();
                // IULogin iULogin = new IULogin();
                // iULogin.setVisible(true);
            }
        });
    }

    private void selectAllUsers() {
        ArrayList<DTOUsuario> listDtoUsuario = controlador.selectAllUsers();

        String[] columnas = {"Nombre", "Apellido", "Domicilio", "Edad", "Tipo Usuario"};

        DefaultTableModel dtm = new DefaultTableModel(null, columnas) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    case 2:
                        return String.class;
                    case 3:
                        return String.class;
                    case 4:
                        return String.class;
                    default:
                        return null;
                }
            }
        };

        for (DTOUsuario dtoUsuario : listDtoUsuario) {
            Vector<Object> vect = new Vector<>();
            vect.add(dtoUsuario.getNombreDTOUsuario());
            vect.add(dtoUsuario.getApellidoDTOUsuario());
            vect.add(dtoUsuario.getDomicilioDTOUsuario());
            vect.add(dtoUsuario.getEdadDTOUsuario());
            vect.add(dtoUsuario.getTipoUsuarioDTOUsuario());
            dtm.addRow(vect);
        }

        tabla_usuario.setModel(dtm);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button_Alta = new javax.swing.JButton();
        button_modificacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuario = new javax.swing.JTable();
        textField_filtrar = new javax.swing.JTextField();
        button_filtrar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gestionar Usuario");

        jLabel2.setText("Seleccione una opción");

        button_Alta.setText("Alta");
        button_Alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AltaActionPerformed(evt);
            }
        });

        button_modificacion.setText("Modificación");
        button_modificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_modificacionActionPerformed(evt);
            }
        });

        tabla_usuario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_usuario);

        button_filtrar.setText("Filtrar");
        button_filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_filtrarActionPerformed(evt);
            }
        });

        btn_cerrar.setText("Cerrar");
        btn_cerrar.setToolTipText("");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(460, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(textField_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_filtrar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btn_cerrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_modificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_Alta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_filtrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Alta)
                    .addComponent(button_modificacion)
                    .addComponent(btn_cerrar))
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_AltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AltaActionPerformed
        controlador.mostrarPantallaAlta();
        this.dispose();
    }//GEN-LAST:event_button_AltaActionPerformed

    private void button_modificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_modificacionActionPerformed

    }//GEN-LAST:event_button_modificacionActionPerformed

    private void button_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_filtrarActionPerformed
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) tabla_usuario.getModel()));
        sorter.setRowFilter(RowFilter.regexFilter(textField_filtrar.getText()));
        tabla_usuario.setRowSorter(sorter);
    }//GEN-LAST:event_button_filtrarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

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
            java.util.logging.Logger.getLogger(IUGestionarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUGestionarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUGestionarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUGestionarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUGestionarUsuario().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton button_Alta;
    private javax.swing.JButton button_filtrar;
    private javax.swing.JButton button_modificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_usuario;
    private javax.swing.JTextField textField_filtrar;
    // End of variables declaration//GEN-END:variables

}
