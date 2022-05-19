import java.time.LocalDate; 
public class Tarjeta {
    private String nombreTitular;
    private int numero;
    private LocalDate fecha;

    public Tarjeta(String nombreTitular, int numero, LocalDate fecha) {
        this.nombreTitular = nombreTitular;
        this.numero = numero;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "nombreTitular=" + nombreTitular + ", numero=" + numero + ", fecha=" + fecha + '}';
    }
    

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}
