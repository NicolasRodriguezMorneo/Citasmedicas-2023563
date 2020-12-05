package Modelo;
public class Consultorio {
    private String identificacion;
    private String nombre;
    public Consultorio(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }      
}
