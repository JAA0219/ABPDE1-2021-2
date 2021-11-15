
package Conector;

import java.sql.*;

/**
 *
 * @author DIGNA VASQUEZ
 */

public class Conector {

private Connection cn;
final private String url = "jdbc:mariadb://localhost:3306/consultorio?";
final private String user = "user=root&";
final private String password = "password=admin";

    public Conector(String correo, String string, String subject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Conector() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public Connection getConexion() throws SQLException{


return DriverManager.getConnection( url + user + password);

}

}
