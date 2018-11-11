package GestionarUsuario;

import IUGestionarUsuario.IUGestionarUsuarioAlta;
import IUGestionarUsuario.IUGestionarUsuarioModificar;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorGestionarUsuario {

    public ControladorGestionarUsuario() {
    }

    private ExpertoGestionarUsuario experto = new ExpertoGestionarUsuario();
    public static DTOUsuario dtoUsuarioCap;

    public ArrayList<DTOUsuario> selectAllUsers() throws SQLException {
        return experto.selectAllUsers();
    }

    public ArrayList<DTOTipoUsuario> selectAllUsersTypes() throws SQLException {
        return experto.selectAllUsersTypes();
    }

    public void insertInUser(DTOUsuario x) throws SQLException {
        experto.insertInUser(x);
    }

    public void mostrarPantallaAlta() {
        IUGestionarUsuarioAlta pantallaAlta = new IUGestionarUsuarioAlta();
        pantallaAlta.setVisible(true);
    }

    public void mostrarPantallaModificacion(DTOUsuario dtoUsuarioCapturado) {
        IUGestionarUsuarioModificar pantallaModificacion = new IUGestionarUsuarioModificar(dtoUsuarioCapturado);
        pantallaModificacion.setVisible(true);
        dtoUsuarioCap = dtoUsuarioCapturado;
    }

    public void deleteUser(DTOUsuario dtoUsuarioCapturado) throws SQLException {
        experto.deleteUser(dtoUsuarioCapturado);
    }

    public void updateUser(DTOUsuario dtoUsuario) throws SQLException {
        experto.updateUser(dtoUsuario);
    }

}
