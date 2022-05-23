package classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.Image;
import java.io.Serializable;
public class Producto implements Serializable {
    private String titulo;
    private String caracteristicas;
    private Categorias categoria; //Toma valores del 0 al 4 que corresponden a una categoria distinta
    private double precio;
    private String fotoProducto;
    private int stock;
    private LocalDate fechaDeEntrada;
    private ArrayList<Opinion> opiniones = new ArrayList<Opinion>();

    public Producto(String titulo, String caracteristicas, Categorias categoria, double precio, String fotoProducto, int stock, LocalDate fechaDeEntrada) {
        this.titulo = titulo;
        this.caracteristicas = caracteristicas;
        this.categoria = categoria;
        this.precio = precio;
        this.fotoProducto = fotoProducto;
        this.stock = stock;
        this.fechaDeEntrada = fechaDeEntrada;
    }

    @Override
    public String toString() {
        return "Producto{" + "titulo=" + titulo + ", caracteristicas=" + caracteristicas + ", categoriaID=" + categoria + ", precio=" + precio + ", fotoProducto=" + fotoProducto + ", stock=" + stock + ", fechaDeEntrada=" + fechaDeEntrada + ", opiniones=" + opiniones + '}';
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

    public Categorias getCategoriaID() {
        return categoria;
    }

    public void setCategoriaID(Categorias categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFotoProducto() {
        return fotoProducto;
    }

    public void setFotoProducto(String fotoProducto) {
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
