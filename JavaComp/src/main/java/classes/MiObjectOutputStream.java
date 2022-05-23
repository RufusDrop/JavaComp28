/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.*;

/**
 *
 * @author nicol
 */
public class MiObjectOutputStream extends ObjectOutputStream{
    
    //Sobreescribimos el método de la cabecera y hacemos que no haga nada para que solo hay una cabecera
    protected void writeStreamHeader() throws IOException{
        //No hace nada
    }
    public MiObjectOutputStream() throws IOException{
        super();
    }
    public MiObjectOutputStream(OutputStream out) throws IOException{
        super(out);
    }
}
