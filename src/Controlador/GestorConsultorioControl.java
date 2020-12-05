package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
public class GestorConsultorioControl implements ActionListener{
    Modelo.GestorConsultorio consultoriosModelo;
    Vista.ConsultarConsultorio consultarConsultorioVista;
    
    public GestorConsultorioControl(Vista.ConsultarConsultorio consultarConsultorioVista){
        this.consultarConsultorioVista = consultarConsultorioVista;
        consultoriosModelo = new Modelo.GestorConsultorio();
    }
    
    public void actionPerformed(ActionEvent e){
        DefaultTableModel tmodelo;
        String valor = consultarConsultorioVista.ValorTxt.getText();
        int parametro = 0;
        
        if(consultarConsultorioVista.rdb_identificacion.isSelected()){
            parametro = 1;
        }
        if(consultarConsultorioVista.rdb_nombre.isSelected()){
            parametro = 2;
        }
        
        LinkedList<Modelo.Consultorio> consultorios = consultoriosModelo.getConsultoriobyParametro(parametro, valor);
        String registro[] = new String[2];
        
        String []Titulos = {"Identificacion","Nombre"};
        
        tmodelo = new DefaultTableModel();
        tmodelo.setColumnIdentifiers(Titulos);
        
        for(Modelo.Consultorio c:consultorios){
            registro[0] = c.getIdentificacion();
            registro[1] = c.getNombre();
            tmodelo.addRow(registro);
        }
        consultarConsultorioVista.Tbl_datos.setModel(tmodelo);
    }
}
