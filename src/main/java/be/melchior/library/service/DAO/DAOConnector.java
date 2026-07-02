package be.melchior.library.service.DAO;
import javax.swing.*;
import java.sql.*;



public class DAOConnector {

    private String dbUrl;
    private String dbUser;
    private String dbPassword;
    private static DAOConnector instance;

    public DAOConnector() {
        this.dbUrl = "jdbc:mysql://localhost:3306/LibraryDB";
        this.dbUser = "root";
        this.dbPassword = "root";
    }


    public static DAOConnector getInstance() {
        if (instance == null) {
            instance = new DAOConnector();
        }
        return instance;
    }

    public Connection connection() {
        Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.dbUrl, this.dbUser, this.dbPassword);
            return con;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erreur driver mysql : " + ex.getMessage());
            return null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Echec à la connexion : " + ex.getMessage());;
            return null;
        }
    }
}
