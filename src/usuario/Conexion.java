package usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static Conexion instance;

    public Conexion() {
    }

    public static final Conexion getInstance() {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    public static Connection con;

    public Connection getConnetion() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost/usuarioDB";
            String userName = "root";
            String userPassword = "root";
            Class.forName(driver);
            Connection conection = (Connection) DriverManager.getConnection(url, userName, userPassword);
            Conexion.con = conection;
        } catch (SQLException e) {
            System.out.println("No se pudo establecer la conexión con la base de datos");
            //JOptionPane.showMessageDialog(null, "Error de conexión, el programa se cerrará", "Error", JOptionPane.ERROR_MESSAGE);
            //System.exit(0);
        } catch (ClassNotFoundException e1) {
            System.out.println("Driver para la conexión no encontrado");
            JOptionPane.showMessageDialog(null, "Driver para la conexión no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return con;
    }

    public void createDBandTables() {
        try {
            getInstance().getConnetion();
            PreparedStatement createDBCREATE = con.prepareStatement("CREATE DATABASE IF NOT EXISTS usuarioDB;");
            PreparedStatement createUserTypeStmt = con.prepareStatement("CREATE TABLE IF NOT EXISTS `usuarioDB`.`tipoUsuario` ( "
                    + "`idTU` INT(255) NOT NULL AUTO_INCREMENT, "
                    + "`nomTU` VARCHAR(255) NULL , "
                    + "PRIMARY KEY (`idTU`)"
                    + ") ENGINE = InnoDB;");
            PreparedStatement insertUserTypeStmt = con.prepareStatement("INSERT IGNORE INTO `tipousuario` ("
                    + "`idTU`, `nomTU`) "
                    + "VALUES ('1', 'Admin'), ('2', 'Comun');");
            PreparedStatement createUserStmt = con.prepareStatement("CREATE TABLE IF NOT EXISTS `usuarioDB`.`usuario`("
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
            insertUserTypeStmt.executeUpdate();
            createUserStmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al intentar crear base de datos y/o tablas");
            JOptionPane.showMessageDialog(null, "Error al intentar crear base de datos y/o tablas", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion");
            }
        }
    }
}
