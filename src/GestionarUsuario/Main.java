package GestionarUsuario;

import IUGestionarUsuario.IUGestionarUsuario;

public class Main {

    public static void main(String[] args) {
        try {
            Conexion.getInstance().createDBandTables();
            IUGestionarUsuario iu = new IUGestionarUsuario();
            iu.setLocationRelativeTo(null);
            iu.setVisible(true);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());;
        }

    }

}
