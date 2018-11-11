package GestionarUsuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexion {

    private static Conexion instance;

    public Conexion() {
    }

    public static Conexion getInstance() {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    public static Connection con;

    public static Connection getConnetion() throws Exception {

        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost/usuarioDB";
            String userName = "root";
            String userPassword = "root";
            Class.forName(driver);
            Connection conection = (Connection) DriverManager.getConnection(url, userName, userPassword);
            Conexion.con = conection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    public static void createDBandTables() throws SQLException {
        try {
            getConnetion();
            PreparedStatement createDBCREATE = con.prepareStatement("CREATE DATABASE IF NOT EXISTS usuarioDB;");
            PreparedStatement createUserTypeStmt = con.prepareStatement("CREATE TABLE IF NOT EXISTS `usuarioDB`.`tipoUsuario` ( "
                    + "`idTU` INT(255) NOT NULL AUTO_INCREMENT, "
                    + "`nomTU` VARCHAR(255) NULL , "
                    + "PRIMARY KEY (`idTU`)"
                    + ") ENGINE = InnoDB;");
            PreparedStatement createUserStmt = con.prepareStatement("CREATE TABLE IF NOT EXISTS `usuariodb`.`usuario` ("
                    + "`idUsuario` INT(255) NOT NULL AUTO_INCREMENT,"
                    + "`nombre` VARCHAR(255) NOT NULL , "
                    + "`apellido` VARCHAR(255) NOT NULL , "
                    + "`domicilio` VARCHAR(255) NOT NULL , "
                    + "`edad` VARCHAR(255) NOT NULL , "
                    + "`idTU` INT(255) NOT NULL , "
                    + "PRIMARY KEY (`idUsuario`),"
                    + "INDEX (`idTU`), FOREIGN KEY (`idTU`) REFERENCES `usuariodb`.`tipousuario`(`idTU`)"
                    + ") ENGINE = InnoDB;");

            createDBCREATE.executeUpdate();
            createUserTypeStmt.executeUpdate();
            createUserStmt.executeUpdate();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void setUserType() {

        try {
            getConnetion();
            PreparedStatement set = con.prepareStatement("INSERT IGNORE INTO `tipousuario` ("
                    + "`idTU`, `nomTU`) "
                    + "VALUES ('1', 'Admin'), ('2', 'Comun');");
            set.executeUpdate();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void insertInUser(DTOUsuario x) throws SQLException {
        try {
            getConnetion();
            
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

    public static ArrayList<DTOUsuario> selectAllUsers() throws SQLException{    
        ArrayList<DTOUsuario> dtoList = new ArrayList<DTOUsuario>();
        try {
            getConnetion();
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
    
    
    public static ArrayList<DTOUsuario> selectUser(DTOUsuario x) throws SQLException {
        ArrayList<DTOUsuario> dtoList = new ArrayList<DTOUsuario>();
        try {
            getConnetion();
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
                
                System.out.println(nom + ape + dom + edad + tu);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        con.close();
        return dtoList;
    }
    
        public static ArrayList<DTOTipoUsuario> selectAllUsersTypes() throws SQLException{    
        ArrayList<DTOTipoUsuario> dtoList = new ArrayList<DTOTipoUsuario>();
        try {
            getConnetion();
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
}
