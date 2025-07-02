package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.KoneksiDB; 

public class LoginService {

    public boolean authenticate(String username, String password) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean authenticated = false;

        try {
            conn = KoneksiDB.getConnection(); 
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                authenticated = true;
            }

        } catch (SQLException e) {
       
            System.err.println("Error saat autentikasi dari database: " + e.getMessage());
           
        } finally {
         
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.err.println("Error menutup sumber daya database: " + e.getMessage());
            }
        }
        return authenticated;
    }
}