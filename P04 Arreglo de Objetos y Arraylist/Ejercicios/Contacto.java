package S4EJER;
//import java.util.Arrays;

public class Contacto {
    private String nombre;
    private String telefono;
    private String direccion;

    public Contacto(String nombre, String telefono, String direccion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

}
/*
 *     @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nNOMBRE: ");
        sb.append(nombre);
        sb.append("\nTELEFONO: ");
        sb.append(telefono);
        sb.append("\nDIRECCION: ");
        sb.append(direccion);    
        return sb.toString();
    }
 */