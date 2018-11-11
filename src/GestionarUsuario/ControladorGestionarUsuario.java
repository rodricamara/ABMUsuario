package GestionarUsuario;

import IUGestionarUsuario.IUGestionarUsuarioAlta;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorGestionarUsuario {
    
    public ControladorGestionarUsuario() {
    }
    
    private ExpertoGestionarUsuario experto = new ExpertoGestionarUsuario();
    
    public ArrayList<DTOUsuario> selectAllUsers() {
        return experto.selectAllUsers();
    }
    
    public ArrayList<DTOTipoUsuario> selectAllUsersTypes() {
        return experto.selectAllUsersTypes();
    }
    
    public void mostrarPantallaAlta() {
        IUGestionarUsuarioAlta pantallaAlta = new IUGestionarUsuarioAlta();
        pantallaAlta.setVisible(true);
    }
    
    public void insertInUser(DTOUsuario x) {
        experto.insertInUser(x);
    }
    
}
