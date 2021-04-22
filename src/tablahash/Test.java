/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablahash;
import java.io.*;

public class Test {


    public static void main(String[] args) throws IOException {
        int cantidad;
        String clave;
        int p;
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        TablaDispersa tabla = new TablaDispersa();
        
        CasaRural busqueda;

        System.out.println("Ingrese la cantidad de casas a agregar: ");
        cantidad = Integer.parseInt(entrada.readLine());
        
        for(int j=0; j<cantidad; j++){
            tabla.insertar(new CasaRural());
        }
        
        for(int i=0; i<cantidad; i++){
        System.out.println("\nIngrese la clave que desea buscar: ");
        clave = entrada.readLine();
        
        busqueda = tabla.buscar(clave);
        busqueda.muestra();
        p=tabla.direccion(clave);
        System.out.println("\nLa direccion de la clave es: " + p);
        }
        
        System.out.println("\nIngrese la clave de la desea eliminar: ");
        clave = entrada.readLine();
        tabla.eliminar(clave);
        
        try {
            busqueda = tabla.buscar(clave); //vuelve a buscar la clave que se elimino, para demostrar que si se elimino.
            busqueda.muestra();
        }
        catch(NullPointerException e){
            System.out.println("\nSe elimino la clave"); //en caso de que busqueda.muestra devuelva NULL, se mostrara este mensaje.
        }
    }
    
}

