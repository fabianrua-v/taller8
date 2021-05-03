/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
/**
 *
 * @author Fabian
 */
public class CentroCultural implements Comparable<CentroCultural>{
    private int numeroDvd;

    public CentroCultural(int numeroDvd) {
        this.numeroDvd = numeroDvd;
    }

    public int getNumeroDvd() {
        return numeroDvd;
    }

    public void setNumeroDvd(int numeroDvd) {
        this.numeroDvd = numeroDvd;
    }

    @Override
    public int compareTo(CentroCultural t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
