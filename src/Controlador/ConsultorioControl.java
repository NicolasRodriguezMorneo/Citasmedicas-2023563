package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ConsultorioControl implements ActionListener {
    Vista.RegistrarConsultorio consultoriovista;
    Modelo.Consultorio consultorioModelo;
    Modelo.GestorConsultorio gestorConsultorios;

    public ConsultorioControl(Vista.RegistrarConsultorio consultoriovista) {

        this.consultoriovista = consultoriovista;
        this.gestorConsultorios = new Modelo.GestorConsultorio();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(consultoriovista.RegistrarBtn)) {
            String identificacion = consultoriovista.IdentificacionTxt.getText();
            String nombres = consultoriovista.NombreTxt.getText();

            this.consultorioModelo = new Modelo.Consultorio(identificacion, nombres);
            this.gestorConsultorios.registrarConsultorios(consultorioModelo);
        }
        if (e.getSource().equals(consultoriovista.NuevoBtn)) {

            consultoriovista.IdentificacionTxt.setText("");
            consultoriovista.NombreTxt.setText("");
            consultoriovista.IdentificacionTxt.requestFocus();
        }
    }

}
