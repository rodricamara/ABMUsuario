package GestionarUsuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

    public Connection getConnetion() throws Exception {

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

    public void createDBandTables() throws SQLException {
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
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
