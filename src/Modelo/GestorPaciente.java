package Modelo;

import con.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GestorPaciente {
    private static LinkedList<Paciente> paciente;
    private static Connection conn;
    
    public GestorPaciente(){
/*        Recursos.Conexion conexion = new Recursos.Conexion("localhost","root","","citas_medicas");
        conn = conexion.getConexion();
        pacientes = new LinkedList<Paciente>();*/
    }
    
    public void RegistrarPacientes(Paciente paciente){
        PreparedStatement pst;

        try{
            pst = conn.prepareStatement("insert inyo pacientes values(?,?,?,?,?)");
            pst.setString(1, paciente.getIdentificacion());
            pst.setString(2, paciente.getNombres());
            pst.setString(3, paciente.getApellidos());
            pst.setString(4, paciente.getFechanaciemiento());
            pst.setString(5, paciente.getGenero());
        }catch (SQLException ex){
            Logger.getLogger(GestorPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        //pacientes.add(pacientes);
    }
    
/*    public static LinkedList<Paciente> getPacientebyParametro(int parametro, String valor){
        LinkedList<Paciente> resultado=new LinkedList<Paciente>();
        for(Paciente pac:pacientes){
            switch(parametro){
                case 1: if(pac.getIdentificacion().equals(valor))
                    resultado.add(pac);
                break;
                case 2: if(pac.getNombres().equals(valor))
                    resultado.add(pac);
                break;
                case 3: if(pac.getApellidos().equals(valor))
                    resultado.add(pac);
                break;
                case 4: if(pac.getGenero().equals(valor))
                    resultado.add(pac);
                break;
            }
        }
    }*/
}
