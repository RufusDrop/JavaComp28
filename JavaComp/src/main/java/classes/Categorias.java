
package classes;

public enum Categorias {
    Componentes("Componentes",0),
    Ordenadores("Ordenadores",1),
    MóvilesTelefonía("Móviles y telefonía",2),
    TVAudioFoto("TV, audio y foto",3),
    ConsolasVideojuegos("Consolas y videojuegos",4);
    private String categoria;
    private int index;
    private Categorias(String categoria,int index){
        this.categoria = categoria;
        this.index = index;
    }
    public String getCategoria(){
        return categoria;
    }
    public int getIndex(){
        return index;
    }   
}
