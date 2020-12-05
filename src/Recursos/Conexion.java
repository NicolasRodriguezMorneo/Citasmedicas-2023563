package Recursos;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
    public class Conexion {
    String url="jdbc:mysql://localhost:3306/citas_medicas";
    String user="root",pass="";    
    Connection con;
    StringBuffer sql = new StringBuffer ();
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection(url,user,pass);
             JOptionPane.showMessageDialog(null,"conexion a la base de datos ");
        } catch (Exception e) {  
             JOptionPane.showMessageDialog(null,"Error de conexion a la base de datos ");
        }
        return con;
    }

    public java.sql.Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}