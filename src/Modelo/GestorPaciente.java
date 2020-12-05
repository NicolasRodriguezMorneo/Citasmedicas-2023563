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

public class GestorPaciente {    
    private static LinkedList<Paciente> pacientes;
    private static Connection con;
    public GestorPaciente() {
        Conexion conexion = new Conexion();
        con = conexion.getConnection();
        pacientes = new LinkedList<Paciente>();
    }
    public void registrarPacientes(Paciente paciente) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("INSERT INTO pacientes (Pac_Identificador, Pac_Nombres, Pac_Apellidos, Pac_Fechanacimiento, Pac_Sexo) VALUES (?, ?, ?, ?, ?)");
            pst.setString(1, paciente.getIdentificacion());
            pst.setString(2, paciente.getNombres());
            pst.setString(3, paciente.getApellidos());
            pst.setString(4, paciente.getFechaNacimiento());
            pst.setString(5, paciente.getGenero());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Paciente Registrado");
        } catch (SQLException ex) {
            Logger.getLogger(GestorPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        // pacientes.add(paciente);
    }
    public LinkedList<Paciente> getPacientebyParametro(int parametro, String valor) {
        LinkedList<Paciente> resultado = new LinkedList<Paciente>();
        String sql = "";
        //   for (Paciente pac : pacientes) {
        switch (parametro) {
            case 1:
                // if (pac.getIdentificador().equals(valor)) {
                sql = "select * from pacientes where Pac_Identificador='" + valor + "'";
                //}
                //resultado.add(pac);
                break;
            case 2:
                //  if (pac.getNombres().equals(valor)) {
                sql = "select * from pacientes where Pac_Nombres='" + valor + "'";
                // }
                // resultado.add(pac);
                break;
            case 3:
                // if (pac.getApellidos().equals(valor)) {
                sql = "select * from pacientes where Pac_Apellidos='" + valor + "'";
                // }
                // resultado.add(pac);
                break;
            case 4:
                // if (pac.getSexo().equals(valor)) {
                sql = "select * from pacientes where Pac_Sexo='" + valor + "'";
                // }
                //resultado.add(pac);
                break;
        }
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String identificador = rs.getString("Pac_Identificador");
                String nombre = rs.getString("Pac_Nombres");
                String apellido = rs.getString("Pac_Apellidos");
                String fechaNacimiento = rs.getString("Pac_Fechanacimiento");
                String genero = rs.getString("Pac_Sexo");
                Paciente paciente = new Paciente(identificador, nombre, apellido,fechaNacimiento, genero);   
                resultado.add(new Paciente(identificador, nombre, apellido,fechaNacimiento, genero));
            }
            // st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
           // JOptionPane.showMessageDialog(null, e.getMessage());            
        }
        return resultado;
    }
}


