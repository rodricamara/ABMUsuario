package GestionarUsuario;

import IUGestionarUsuario.IUGestionarUsuarioAlta;
import IUGestionarUsuario.IUGestionarUsuarioModificar;
import java.util.ArrayList;

public class ControladorGestionarUsuario {

    public ControladorGestionarUsuario() {
    }

    private ExpertoGestionarUsuario experto = new ExpertoGestionarUsuario();
    public static DTOUsuario dtoUsuarioCap;

    public ArrayList<DTOUsuario> selectAllUsers() {
        return experto.selectAllUsers();
    }

    public ArrayList<DTOTipoUsuario> selectAllUsersTypes() {
        return experto.selectAllUsersTypes();
    }

    public void insertInUser(DTOUsuario dtoUsuario) {
        experto.insertInUser(dtoUsuario);
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

    public void deleteUser(DTOUsuario dtoUsuarioCapturado) {
        experto.deleteUser(dtoUsuarioCapturado);
    }

    public void updateUser(DTOUsuario dtoUsuario) {
        experto.updateUser(dtoUsuario);
    }
}
