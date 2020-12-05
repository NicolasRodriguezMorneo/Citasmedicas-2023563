package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
public class PacienteControl implements ActionListener {
    Vista.RegistroPaciente pacienteVista;
    Modelo.Paciente pacienteModelo;
    Modelo.GestorPaciente gestorpacienteModelo;
    
    public PacienteControl(Vista.RegistroPaciente pacienteVista){
    
        this.pacienteVista=pacienteVista;
        this.gestorpacienteModelo=new Modelo.GestorPaciente();  
    }
    @Override
    public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(pacienteVista.RegistrarBtn)){
        String identificacion=pacienteVista.IdentificacionTxt.getText();
        String nombres=pacienteVista.NombreTxt.getText();
        String apellidos=pacienteVista.ApellidosTxt.getText();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
        String fecha_nacimiento=formato.format(pacienteVista.dtd_fecha_nacimiento.getDate());
        String genero="";
        if(pacienteVista.rdb_masculino.isSelected()){
             genero="M";
        }
        
        if(pacienteVista.rdb_femenino.isSelected()){
             genero="F";
        }
        this.pacienteModelo=new Modelo.Paciente(identificacion,nombres,apellidos,fecha_nacimiento,genero);
        this.gestorpacienteModelo.registrarPacientes(pacienteModelo);    
        }  
    if(e.getSource().equals(pacienteVista.NuevoBtn)){
    
        pacienteVista.IdentificacionTxt.setText("");
        pacienteVista.NombreTxt.setText("");
        pacienteVista.ApellidosTxt.setText("");
        pacienteVista.dtd_fecha_nacimiento.setDate(null);
        pacienteVista.rdb_masculino.setSelected(true);
        pacienteVista.rdb_femenino.setSelected(false);
        pacienteVista.IdentificacionTxt.requestFocus();      
    } 
    }
    
}
