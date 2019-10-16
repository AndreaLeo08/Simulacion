/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopruebacorrida;


import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class texto {
    public texto() {
        
    }
    
    public Double[] ObtenerTexto(){
        ArrayList<Double>dat = new ArrayList<Double>();
        try {
            FileReader leer = new FileReader("C:\\Users\\Andrea\\Desktop\\5 Semestre\\Simulacion\\Tema2\\proyectoPruebaCorrida\\numeros.txt");
            BufferedReader mibuffer = new BufferedReader(leer);
            String linea ="";
            while(linea != null){
                linea = mibuffer.readLine();
                
                if(linea!=null){
                    Double line = Double.parseDouble(linea);
                    dat.add(line);
                }
                
            }

        } catch (IOException ex) {
            System.out.println("archivo no encontrado");
        }
         Double []numeros = new Double[dat.size()];
         dat.toArray(numeros);
        
        return numeros;
    }
 
    
}
