package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCUtil {
    public static Connection getConnection(){
        Connection c = null;
        
        
        try {
            //Đăng kí MySQL Driver với DriverManager
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            // Các thông số
            String url = "jdbc:mySQL://localhost:3306/vinland";
            String username = "root";
            String password = "";
            
            // Tạo kết nối
            c = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
    }
    
    public static void closeConnection(Connection c) {
        try {
            if(c!=null){
                c.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void printInfo(Connection c) {
        try {
            if(c!=null){
                System.out.println(c.getMetaData().toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
