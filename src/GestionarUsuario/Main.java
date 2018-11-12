package GestionarUsuario;

import IUGestionarUsuario.IUGestionarUsuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        try {
            Conexion.getInstance().createDBandTables();
            IUGestionarUsuario iu = new IUGestionarUsuario();
            iu.setLocationRelativeTo(null);
            iu.setVisible(true);
        } catch (SQLException ex) {
            System.out.println("No se pudo establecer la conexión con la base de datos");
        } catch (NullPointerException e1) {
            System.out.println("No se puede inicializar la pantalla Gestionar Usuario: (NullPointerException)");
            JOptionPane.showMessageDialog(null, "Error de conexión", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
