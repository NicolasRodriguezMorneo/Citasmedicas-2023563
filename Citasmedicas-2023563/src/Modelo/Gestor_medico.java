
package Modelo;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Gestor_medico {
    
    private static LinkedList<Medico> medico;
    private static Connection conn;
    
    public Gestor_medico(){
        
    }
    
    public void RegistrarMedico(Medico medico){
        
        PreparedStatement pst;
        
        try {
            pst = conn.preparedStatement("Inserte into medioc values(?,?,?,?,?)");
            pst.setInt(1, medico.getIdentificacion());
            pst.setString(2, medico.getNombres());
            pst.setString(3, medico.getApellidos());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Médico Registrado");
            
        } 
        catch (SQLException ex){
            Logger.getLogger(Gestor_medico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
