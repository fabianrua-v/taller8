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
public class Cliente implements Comparable<Cliente>{
    private long dni;
    private String nombre;
    private int peticion;

    public Cliente() {
    }
    
    

    public Cliente(long dni) {
        this.dni = dni;
    }
    

    public Cliente(String nombre,int dni, int peticion) {
        this.nombre = nombre;
        this.peticion = peticion;
        this.dni=dni;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeticion() {
        return peticion;
    }

    public void setPeticion(int peticion) {
        this.peticion = peticion;
    }

    @Override
    public int compareTo(Cliente c) {
        return this.nombre.compareTo (c.nombre);
    }
    
}
