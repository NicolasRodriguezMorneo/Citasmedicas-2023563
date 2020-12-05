
package Modelo;

public class Medico {
    private String Identificador;
    private String Nombres;
    private String Apellidos;

    public Medico(String Identificador, String Nombres, String Apellidos) {
        this.Identificador = Identificador;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
}
