/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import com.mysql.jdbc.MySQLConnection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author acer
 */
public class Koneksi {

    /**
     * @param args the command line arguments
     */
    
    static Connection conn;
    
    public static Connection getConnection() {
        
        if (conn == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("user_management");
            data.setUser("root");
            data.setPassword("");
            try {
                conn = data.getConnection();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return conn;
        
}
    
}
