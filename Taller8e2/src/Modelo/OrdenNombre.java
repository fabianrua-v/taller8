/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Comparator;

    public class OrdenNombre implements Comparator<Cliente> {

    @Override
    public int compare(Cliente t, Cliente t1) {
        return t.getNombre().compareTo(t1.getNombre());
    }
    
}

    

