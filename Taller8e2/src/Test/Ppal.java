/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Modelo.*;
import java.util.*;

/**
 *
 * @author Fabian
 */
public class Ppal {
    public static void main(String[] args) {
        List<Cliente>listado =new ArrayList();
        
        Cliente jairo = new Cliente("jairo", 123, 5);
        Cliente rua = new Cliente("fabian", 567, 6);
        Cliente ana = new Cliente("ana", 789, 4);
        
        Gestion.addElemento(listado, jairo);
        Gestion.addElemento(listado, rua);
        Gestion.addElemento(listado, ana);
        
        System.out.println("** Imprime contenido de la coleccion ** ");
        Gestion.imprimirElementos(listado);
        
        System.out.println("** Imprime contenido de la coleccion ordenado por nombre ** ");
        Gestion.colectionOrdenar(listado,(Comparator) new OrdenNombre());
        
        System.out.println("** Imprime contenido de la coleccion ordenado por numro de peticion ** ");
    }
}
