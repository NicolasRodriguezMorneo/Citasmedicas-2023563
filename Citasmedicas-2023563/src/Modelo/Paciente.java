package Modelo;
public class Paciente {
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String fechanaciemiento;
    private String genero;

    public Paciente(String identificacion, String nombres, String apellidos, String fechanaciemiento, String genero) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechanaciemiento = fechanaciemiento;
        this.genero = genero;
    }
    
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getFechanaciemiento() {
        return fechanaciemiento;
    }
    public void setFechanaciemiento(String fechanaciemiento) {
        this.fechanaciemiento = fechanaciemiento;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
