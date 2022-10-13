package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.util.Arrays;

@XmlType (propOrder = {"nombre", "precio", "ingredientes"})
public class Pizza {

    private String nombre;

    private Double precio;

    private String[] ingredientes;

    public Pizza(String nombre, Double precio, String[] ingredientes) {
        super();
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

    @XmlElementWrapper(name = "ingredientes")
    @XmlElement(name = "ingrediente")
    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza {" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", ingredientes=" + Arrays.toString(ingredientes) +
                '}';
    }
}
