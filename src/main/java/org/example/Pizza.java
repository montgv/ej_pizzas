package org.example;

import javax.xml.bind.annotation.XmlType;

@XmlType (propOrder = {"nombre", "precio", "ingrediente"})
public class Pizza {

    private String nombre;

    private Double precio;

    private String[] ingredientes;

    public Pizza(String nombre, Double precio, String[] ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public Pizza() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
}
