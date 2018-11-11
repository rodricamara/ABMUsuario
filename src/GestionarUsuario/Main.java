package GestionarUsuario;

import IUGestionarUsuario.IUGestionarUsuario;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        try {
            Conexion.createDBandTables();
            Conexion.setUserType();

            IUGestionarUsuario iu = new IUGestionarUsuario();
            iu.setLocationRelativeTo(null);
            iu.setVisible(true);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());;
        }

    }

}
