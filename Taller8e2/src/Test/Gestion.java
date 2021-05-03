/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Modelo.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Fabian
 */
public class Gestion {
    public static void addElemento(List<Cliente>lista, Cliente c){
        lista.add(c);
        
    }
    
     public static void addElemento(List<Dvd>lista, Dvd d){
        lista.add(d);
    }
     
      public static void addElemento(List<CentroCultural>lista, CentroCultural t){
        lista.add(t);
    }

 public static void imprimirElementos(List<Cliente> lista){
        System.out.println("Listado de clientes: ");
        for (Cliente c : lista) {
            System.out.println("este es el nonbre del cliente:  "+c.getNombre());
            System.out.println("cedula del cliente: "+c.getDni());
            System.out.println("peticiones del usuario: "+c.getPeticion());
            System.out.println("----------------------------------------------------------------------------------------\n");
        }
        
    }
     public static void colectionOrdenar(List<Cliente> lista, Comparator orden){
        List<Cliente> listaOrdenada = new ArrayList(lista);
        if(orden!=null)
            Collections.sort(listaOrdenada, orden);
        else
            Collections.sort(listaOrdenada);
        
        imprimirElementos(listaOrdenada);
    }
    
    public static void colectionOrdenar(List<Cliente> lista){
        colectionOrdenar(lista, null);
    }
    
}