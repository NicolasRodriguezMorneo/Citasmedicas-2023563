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

public class GestorConsultorio {
    private static LinkedList<Consultorio>consultorios;
    private static Connection con;
    public GestorConsultorio(){
        Conexion conexion = new Conexion();
        con = conexion.getConnection();
        consultorios = new LinkedList<Consultorio>();
    }
    public void registrarConsultorios(Consultorio consultorio){
        PreparedStatement pst;
        try{
            pst = con.prepareStatement("INSERT INTO consultorios (Con_Identificador, Con_Nombre) VALUES (?, ?)");
            pst.setString(1, consultorio.getIdentificacion());
            pst.setString(2, consultorio.getNombre());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Consultorio Registrado");
        } catch (SQLException ex){
            Logger.getLogger(GestorConsultorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        //consultorios.add(consultorio);
    }
    public LinkedList<Consultorio>getConsultoriobyParametro(int parametro, String valor){
        LinkedList<Consultorio> resultado = new LinkedList<Consultorio>();
        String sql = "";
        // for (Consultorio cons : consultorios){
        switch (parametro){
            case 1: 
                // if (cons.getIdentificacion().equals(valor)){
                sql = "select * from consultorios where Con_Identificador='" + valor + "'";
                //}
                //resultado.add(cons);
                break;
            case 2: 
                // if (cons.getNombre().equals(valor)){
                sql = "select * from consultorios where Con_Nombre='" + valor + "'";
                //}
                //resultado.add(cons);
                break;
        }
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String identificacion = rs.getString("Con_Identificador");
                String nombre = rs.getString("Con_Nombre");
                Consultorio consultorio = new Consultorio(identificacion, nombre);
                resultado.add(new Consultorio(identificacion, nombre));
            }
            // st.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
}
