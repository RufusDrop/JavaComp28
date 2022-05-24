package classes;

import java.io.Serializable;


public class Direccion implements Serializable {
    private String direccion;
    private int codigoPostal;
    private String ciudad;

    public Direccion(String calle, int codigoPostal, String ciudad) {
        this.direccion = calle;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + direccion + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + '}';
    }
  
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
