
package appPack;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBFuncion {
    
    DB db = new DB();
    /**
     * 
     * @param username
     * @param userPass
     * @return boolean
     */
    public boolean adminLogin( String username, String userPass ){
        boolean statu = false;
        try {
            String query = "SELECT * FROM `admin` WHERE `username` = ? AND `userpass` = ? ";
            PreparedStatement pre = db.pre(query);
            pre.setString(0, username);
            pre.setString(1, userPass);
            ResultSet rs = pre.executeQuery();
            statu = rs.next();
            
                    
        } catch (Exception e) {
            System.err.println("Admin login error: " + e);
            statu = false;
        }
        return statu;
    
    
    
    
    }
    
    
    
    
    
    
}
