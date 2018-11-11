package GestionarUsuario;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExpertoGestionarUsuario {

    public ArrayList<DTOUsuario> selectAllUsers() {

        ArrayList<DTOUsuario> list = new ArrayList<DTOUsuario>();
        try {
            Conexion.getConnetion();
            list = Conexion.selectAllUsers();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());;
        }

        return list;
    }

    public ArrayList<DTOTipoUsuario> selectAllUsersTypes() {

        ArrayList<DTOTipoUsuario> list = new ArrayList<DTOTipoUsuario>();
        try {
            Conexion.getConnetion();
            list = Conexion.selectAllUsersTypes();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public void insertInUser(DTOUsuario x){    
        try {
            Conexion.insertInUser(x);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

}
