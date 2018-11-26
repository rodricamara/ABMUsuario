package usuario;

import iuUsuario.IUGestionarUsuarioAlta;
import iuUsuario.IUGestionarUsuarioModificar;
import java.util.ArrayList;

public class ControladorGestionarUsuario {

    private static ControladorGestionarUsuario instance;

    public static final ControladorGestionarUsuario getInstance() {
        if (instance == null) {
            instance = new ControladorGestionarUsuario();
        }
        return instance;
    }

    public ControladorGestionarUsuario() {
    }

    public static DTOUsuario dtoUsuarioCap;

    public ArrayList<DTOUsuario> selectAllUsers() {
        return ExpertoGestionarUsuario.getInstance().readUsers();
    }

    public ArrayList<DTOTipoUsuario> selectAllUsersTypes() {
        return ExpertoGestionarUsuario.getInstance().readUserType();
    }

    public void insertInUser(DTOUsuario dtoUsuario) {
        ExpertoGestionarUsuario.getInstance().createUser(dtoUsuario);
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
        ExpertoGestionarUsuario.getInstance().deleteUser(dtoUsuarioCapturado);
    }

    public void updateUser(DTOUsuario dtoUsuario) {
        ExpertoGestionarUsuario.getInstance().updateUser(dtoUsuario);
    }
}
