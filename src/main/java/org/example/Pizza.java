package org.example;

import javax.xml.bind.annotation.XmlType;

@XmlType (propOrder = {"nombre", "precio", "ingrediente"})
public class Pizza {

    private String nombre;

    private Double precio;

    private String[] ingrediente;

    public Pizza(String nombre, Double precio, String[] ingrediente) {
        super();
        this.nombre = nombre;
        this.precio = precio;
        this.ingrediente = ingrediente;
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

    public String[] getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String[] ingrediente) {
        this.ingrediente = ingrediente;
    }
}
