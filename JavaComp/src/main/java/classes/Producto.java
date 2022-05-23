package classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.Image;
import java.io.Serializable;
public class Producto implements Serializable {
    private String titulo;
    private String caracteristicas;
    private int categoriaID; //Toma valores del 0 al 4 que corresponden a una categoria distinta
    private double precio;
    private Image fotoProducto;
    private int stock;
    private LocalDate fechaDeEntrada;
    private ArrayList<Opinion> opiniones = new ArrayList<Opinion>();

    public Producto(String titulo, String caracteristicas, int categoriaID, double precio, Image fotoProducto, int stock, LocalDate fechaDeEntrada) {
        this.titulo = titulo;
        this.caracteristicas = caracteristicas;
        this.categoriaID = categoriaID;
        this.precio = precio;
        this.fotoProducto = fotoProducto;
        this.stock = stock;
        this.fechaDeEntrada = fechaDeEntrada;
    }

    @Override
    public String toString() {
        return "Producto{" + "titulo=" + titulo + ", caracteristicas=" + caracteristicas + ", categoriaID=" + categoriaID + ", precio=" + precio + ", fotoProducto=" + fotoProducto + ", stock=" + stock + ", fechaDeEntrada=" + fechaDeEntrada + ", opiniones=" + opiniones + '}';
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getCategoriaID() {
        return categoriaID;
    }

    public void setCategoriaID(int categoriaID) {
        this.categoriaID = categoriaID;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Image getFotoProducto() {
        return fotoProducto;
    }

    public void setFotoProducto(Image fotoProducto) {
        this.fotoProducto = fotoProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getFechaDeEntrada() {
        return fechaDeEntrada;
    }

    public void setFechaDeEntrada(LocalDate fechaDeEntrada) {
        this.fechaDeEntrada = fechaDeEntrada;
    }
     
    public ArrayList<Opinion> getOpiniones() {
        return opiniones;
    }
    /**
     * 
     * Se añade una opinion a la lista asegurandose de que no se repita
     */
    public void addOpiniones(Opinion opinion) {
        if(!opiniones.contains(opinion)){
            opiniones.add(opinion);
        }
        else
        {
            //La opinion esta repetida
        }
    }
    public void removeOpiniones(Opinion opinion) {
        if(opiniones.contains(opinion)){
            opiniones.add(opinion);
        }
        else
        {
            //La opinion no existe
        }
    }
    
    
}
