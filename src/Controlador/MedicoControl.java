package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MedicoControl implements ActionListener {
    Vista.Registrar_Medico medicovista;
    Modelo.Medico medicomod;
    Modelo.GestorMedico gmedicomod;

    public MedicoControl(Vista.Registrar_Medico medicovista) {
        this.medicovista = medicovista;
        this.gmedicomod = new Modelo.GestorMedico();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(medicovista.RegistrarBtn)){
            String identificador = medicovista.Identificador.getText();
            String nombres = medicovista.Nom.getText();
            String apellidos = medicovista.Ape.getText();
            this.medicomod = new Modelo.Medico(identificador, nombres, apellidos);
            this.gmedicomod.RegistrarMedico(medicomod);
        }
        if(e.getSource().equals(medicovista.NuevoBtn)){
            medicovista.Identificador.setText("");
            medicovista.Nom.setText("");
            medicovista.Ape.setText("");
            medicovista.Identificador.requestFocus();
        }
    }
    
}
