/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Comparator;

/**
 *
 * @author Fabian
 */
public class Ordenardvd implements Comparator<CentroCultural>{
    @Override
    public int compare(CentroCultural t, CentroCultural t1) {
        if(t.getNumeroDvd()>t1.getNumeroDvd()) return 1;
        else if(t.getNumeroDvd()<t1.getNumeroDvd()) return -1;
        else return 0;
    }
   
    
}
