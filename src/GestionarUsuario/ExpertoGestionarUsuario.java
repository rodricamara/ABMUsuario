package GestionarUsuario;

import static GestionarUsuario.Conexion.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ExpertoGestionarUsuario {

    public ArrayList<DTOUsuario> selectAllUsers() throws SQLException {

        ArrayList<DTOUsuario> dtoList = new ArrayList<DTOUsuario>();
        try {
            Conexion.getInstance().getConnetion();
            Statement stmt = (Statement) con.createStatement();
            String nombretabla = "usuario";
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + nombretabla);

            while (rs.next()) {
                String nom = rs.getString("nombre");
                String ape = rs.getString("apellido");
                String dom = rs.getString("domicilio");
                String edad = rs.getString("edad");
                String tu = rs.getString("idTU");
                DTOUsuario dtoUsuario = new DTOUsuario(nom, ape, dom, edad, tu);
                dtoList.add(dtoUsuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        con.close();
        return dtoList;
    }

    public ArrayList<DTOTipoUsuario> selectAllUsersTypes() throws SQLException {
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
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        con.close();
        return dtoList;
    }

    public void insertInUser(DTOUsuario x) throws SQLException {

        try {
            Conexion.getInstance().getConnetion();

            String nom = x.getNombreDTOUsuario();
            String ape = x.getApellidoDTOUsuario();
            String dom = x.getDomicilioDTOUsuario();
            String edad = x.getEdadDTOUsuario();
            String tu = x.getTipoUsuarioDTOUsuario();
            PreparedStatement insertIntoUsuer = con.prepareStatement("INSERT INTO `usuario` ("
                    + "`idUsuario`, `nombre`, `apellido`, `domicilio`, `edad`, `idTU`) "
                    + "VALUES (NULL, '" + nom + "', '" + ape + "', '" + dom + "', '" + edad + "', '" + tu + "');");
            insertIntoUsuer.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        con.close();
    }

}
