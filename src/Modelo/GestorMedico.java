package Modelo;
import Recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GestorMedico {
    private static LinkedList <Medico> medicos;
    private static Connection con;
    
    public GestorMedico (){
        Conexion conexion = new Conexion();
        con = conexion.getConnection();
        medicos = new LinkedList<Medico>();
    }
    public void RegistrarMedico(Medico medico){
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("INSERT INTO medicos (Med_Identificador, Med_Nombres, Med_Apellidos) VALUES (?, ?, ?)");
            pst.setString(1, medico.getIdentificador());
            pst.setString(2,medico.getNombres());
            pst.setString(3,medico.getApellidos());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Médico Registrado");
        }
        catch(SQLException ex){
            Logger.getLogger(GestorMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public LinkedList<Medico> getMedicobyParametro(int parametro, String valor){
        LinkedList<Medico> resultado = new LinkedList<Medico>();
        String sql = "";
        switch (parametro){
            case 1:
                sql = "SELECT * FROM medicos WHERE Med_Identificador='"+valor+"'";
                break;
            case 2:
                sql = "SELECT * FROM medicos WHERE Med_Nombres='"+valor+"'";
                break;
            case 3:
                sql = "SELECT * FROM medicos WHERE Med_Apellidos='"+valor+"'";
                break;
        }
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String identificador = rs.getString("Med_Identificador");
                String nombres = rs.getString("Med_Nombres");
                String apellidos = rs.getString("Med_Apellidos");
                Medico medico = new Medico(identificador, nombres, apellidos);
                resultado.add(new Medico(identificador, nombres, apellidos));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
}
