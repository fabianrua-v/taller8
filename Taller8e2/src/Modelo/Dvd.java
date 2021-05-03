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
public class Dvd implements Comparable<Dvd>{
    private String codigo;
    private String Titulo;
    private String autor;

    public Dvd(String codigo) {
        this.codigo = codigo;
    }
    
    public Dvd(String Titulo, String autor) {
        this.Titulo = Titulo;
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public int compareTo(Dvd d) {
       return this.Titulo.compareTo (d.Titulo);
    }
    
}
