package GestionarUsuario;

import static GestionarUsuario.Conexion.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExpertoGestionarUsuario {

    public ArrayList<DTOUsuario> selectAllUsers() {

        ArrayList<DTOUsuario> dtoList = new ArrayList<DTOUsuario>();
        try {
            Conexion.getInstance().getConnetion();
            Statement stmt = (Statement) con.createStatement();
            String nombretabla = "usuario";
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + nombretabla);
            while (rs.next()) {
                String id = rs.getString("idUsuario");
                String nom = rs.getString("nombre");
                String ape = rs.getString("apellido");
                String dom = rs.getString("domicilio");
                String edad = rs.getString("edad");
                String tu = rs.getString("idTU");
                DTOUsuario dtoUsuario = new DTOUsuario(id, nom, ape, dom, edad, tu);
                dtoList.add(dtoUsuario);
            }
        } catch (SQLException ex) {
            System.out.println("Error al cargar los usuarios");
            JOptionPane.showMessageDialog(null, "Error al iniciar ventana principal", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "El sistema se cerrará", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion");
            }
        }
        return dtoList;
    }

    public ArrayList<DTOTipoUsuario> selectAllUsersTypes() {
        ArrayList<DTOTipoUsuario> dtoList = new ArrayList<DTOTipoUsuario>();
        try {
            Conexion.getInstance().getConnetion();
            Statement stmt = (Statement) con.createStatement();
            String nombretabla = "tipousuario";
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + nombretabla);
            while (rs.next()) {
                String nom = rs.getString("nomTU");
                DTOTipoUsuario dtoTipoUsuario = new DTOTipoUsuario(nom);
                dtoList.add(dtoTipoUsuario);
            }
        } catch (SQLException ex) {
            System.out.println("Error al cargar los tipos de usuario");
            JOptionPane.showMessageDialog(null, "No se pudieron cargar los tipos de usuario", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion");
            }
        }
        return dtoList;
    }

    public void insertInUser(DTOUsuario dtoUsuario) {
        try {
            Conexion.getInstance().getConnetion();
            String nom = dtoUsuario.getNombreDTOUsuario();
            String ape = dtoUsuario.getApellidoDTOUsuario();
            String dom = dtoUsuario.getDomicilioDTOUsuario();
            String edad = dtoUsuario.getEdadDTOUsuario();
            String tu = dtoUsuario.getTipoUsuarioDTOUsuario();
            Integer nomTU = DTOTipoUsuario.DTOTUsuario.valueOf(tu).getId();
            String idTU = nomTU.toString();
            PreparedStatement insertIntoUsuer = con.prepareStatement("INSERT INTO `usuario` ("
                    + "`idUsuario`, `nombre`, `apellido`, `domicilio`, `edad`, `idTU`) "
                    + "VALUES (NULL, '" + nom + "', '" + ape + "', '" + dom + "', '" + edad + "', '" + idTU + "');");
            insertIntoUsuer.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion");
            }
        }
    }

    public void deleteUser(DTOUsuario dtoUsuarioCapturado) {
        try {
            Conexion.getInstance().getConnetion();
            String id = dtoUsuarioCapturado.getIdDTOUsuario();
            PreparedStatement insertIntoUsuer = con.prepareStatement("DELETE FROM `usuario` "
                    + "WHERE `idUsuario` = \"" + id + "\";");
            insertIntoUsuer.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion");
            }
        }
    }

    public void updateUser(DTOUsuario dtoUsuario) {
        try {
            Conexion.getInstance().getConnetion();
            String id = dtoUsuario.getIdDTOUsuario();
            String nom = dtoUsuario.getNombreDTOUsuario();
            String ape = dtoUsuario.getApellidoDTOUsuario();
            String dir = dtoUsuario.getDomicilioDTOUsuario();
            String edad = dtoUsuario.getEdadDTOUsuario();
            PreparedStatement updateUser = con.prepareStatement(
                    "UPDATE `usuario` "
                    + "SET `nombre` = \"" + nom + "\",`apellido` = \"" + ape + "\",`domicilio` = \"" + dir + "\",`edad` = \"" + edad + "\" "
                    + "WHERE `idUsuario` IN (\"" + id + "\");");
            updateUser.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar usuario", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion");
            }
        }
    }
}
