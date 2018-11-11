package GestionarUsuario;

import IUGestionarUsuario.IUGestionarUsuarioAlta;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorGestionarUsuario {

    public ControladorGestionarUsuario() {
    }

    private ExpertoGestionarUsuario experto = new ExpertoGestionarUsuario();

    public ArrayList<DTOUsuario> selectAllUsers() throws SQLException {
        return experto.selectAllUsers();
    }

    public ArrayList<DTOTipoUsuario> selectAllUsersTypes() throws SQLException {
        return experto.selectAllUsersTypes();
    }

    public void mostrarPantallaAlta() {
        IUGestionarUsuarioAlta pantallaAlta = new IUGestionarUsuarioAlta();
        pantallaAlta.setVisible(true);
    }

    public void insertInUser(DTOUsuario x) throws SQLException {
        experto.insertInUser(x);
    }

}
