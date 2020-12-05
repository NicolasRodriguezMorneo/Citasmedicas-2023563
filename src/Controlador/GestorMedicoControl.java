package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
public class GestorMedicoControl implements ActionListener {
    Modelo.GestorMedico medicomod;
    Vista.Consultar_Medico consmedicovista;
    public GestorMedicoControl(Vista.Consultar_Medico consmedico){
        this.consmedicovista = consmedico;
        medicomod = new Modelo.GestorMedico();
    }
    
    public void actionPerformed(ActionEvent e){
        DefaultTableModel tmodelo;
        String valor = consmedicovista.ValorTxt.getText();
        int parametro=0;
        
        if(consmedicovista.M_Id.isSelected()){
            parametro = 1;
        }
        if(consmedicovista.M_Nom.isSelected()){
            parametro = 2;
        }
        if(consmedicovista.M_Ape.isSelected()){
            parametro = 3;
        }
        LinkedList<Modelo.Medico> medicos = medicomod.getMedicobyParametro(parametro, valor);
        String registro[] = new String[3];
        String []Titulos = {"Identificador","Nombres","Apellidos"};
        
        tmodelo = new DefaultTableModel();
        tmodelo.setColumnIdentifiers(Titulos);
        
        for (Modelo.Medico m:medicos){
            registro[0] = m.getIdentificador();
            registro[1] = m.getNombres();
            registro[2] = m.getApellidos();
            tmodelo.addRow(registro);
        }
        consmedicovista.Tbl_datos.setModel(tmodelo);
    }
}
