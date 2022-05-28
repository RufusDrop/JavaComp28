
package classes;
import java.io.*;
import java.time.LocalDate;
import java.util.*;
public class UtilProducto {
    private static ArrayList<Producto> productos = new ArrayList<Producto>();
    public static Producto productoActual;
    /** Establece el ArrayList de productos
     * @param p */
    public static void setProductos(ArrayList<Producto> p) {
        productos = p;
    }
    /**@return Devuelve el ArrayList de productos */
    public static ArrayList<Producto> getProductos() {
        //Comparador para ordenar los clientes por su nombre
        Comparator NomCliComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Producto p1 = (Producto) o1;
                Producto p2 = (Producto) o2;
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        };
        //Ordenamos el array
        Collections.sort(productos, NomCliComp);
        return productos;
    }
    /** Da de alta un producto
     * @param objcli
     * @return  boolean */
    public static boolean altaProducto(Producto objproc) {
        if (!productos.contains(objproc)) {
            productos.add(objproc);
            return true;
        } else {
            return false;
        }

    }
    public static boolean bajaProducto(Producto objproc) {
        if (productos.contains(objproc)) {
            productos.remove(objproc);
            return true;
        } else {
            return false;
        }
    }
        
    /** Devuelve una producto por la posición dentro del ArrayList
     * @param indice
     * @return objcli */
    public static Producto consultaProducto(int indice) {
        return productos.get(indice);
    }
    /** Modifica los datos de una persona
     * @param cli     
     * @param cli_titulo     
     * @param cli_descripcion     
     * @param cli_categoria     
     * @param cli_precio     
     * @param cli_fotoProducto     
     * @param cli_stock     
     * @param cli_fechaDeEntrada     
     * @param opiniones     
     * @return boolean */
    public static boolean modificaProducto(Producto cli, String cli_titulo, String cli_descripcion, String cli_categoria, double cli_precio, String cli_fotoProducto, int cli_stock, LocalDate cli_fechaDeEntrada, ArrayList<Opinion> cli_opiniones) {
        if (cli == null || !productos.contains(cli)) {
            return false;
        }
        cli.setTitulo(cli_titulo);
        cli.setDescripcion(cli_descripcion);
        cli.setCategoria(cli_categoria);
        cli.setPrecio(cli_precio);
        cli.setFotoProducto(cli_fotoProducto);
        cli.setStock(cli_stock);
        cli.setFechaDeEntrada(cli_fechaDeEntrada);
        cli.setOpiniones(cli_opiniones);
        return true;
    }
    
    
    
    /////OPINIONEs
     
    
    /** Establece el ArrayList de productos
     * @param p */
    public static void setOpiniones(ArrayList<Opinion> o) {
        productoActual.setOpiniones(o);
    }
    /**@return Devuelve el ArrayList de productos */
    public static ArrayList<Opinion> getOpiniones() {
        //Comparador para ordenar los clientes por su nombre
        Comparator NomCliComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Opinion p1 = (Opinion) o1;
                Opinion p2 = (Opinion) o2;
                return p1.getFechaRealizacion().compareTo(p2.getFechaRealizacion());
            }
        };
        //Ordenamos el array
        System.out.println("1: "+productoActual.getOpiniones());
        Collections.sort(productoActual.getOpiniones(), NomCliComp);
        System.out.println("2: "+productoActual.getOpiniones());
        return productoActual.getOpiniones();
    }
    /** Da de alta un producto
     * @param objcli
     * @return  boolean */
    public static boolean altaOpinion(Opinion objopi) {
        if(!productoActual.getOpiniones().contains(objopi)){
           productoActual.addOpinion(objopi);
            return true;
        }
        else{
            return false;
        }

    }
    public static boolean bajaOpinion(Opinion objopi) {
        if (productoActual.getOpiniones().contains(objopi)) {
            productoActual.removeOpinion(objopi);
            return true;
        } else {
            return false;
        }

    }
    
    /** Devuelve una producto por la posición dentro del ArrayList
     * @param indice
     * @return objcli */
    public static Opinion consultaOpinion(int indice) {
        return productoActual.getOpiniones().get(indice);
    }
       /** Carga los datos de productos del fichero */
    public static void cargarDatos() {
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream istreamCli = new FileInputStream("copiasegProductos.dat");
            ObjectInputStream oisCli = new ObjectInputStream(istreamCli);
            productos = (ArrayList) oisCli.readObject();
            istreamCli.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos

    /** Guarda los datos de personas en el fichero */
    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!productos.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de las personas
                FileOutputStream ostreamCli = new FileOutputStream("copiasegProductos.dat");
                ObjectOutputStream oosCli = new ObjectOutputStream(ostreamCli);
                //guardamos el array de personas
                oosCli.writeObject(productos);
                ostreamCli.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin guardarDatos
       


}
