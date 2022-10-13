package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.util.Arrays;

//Definimos el orden en el que se van a escribir los elementos
@XmlType (propOrder = {"nombre", "precio", "ingredientes"})

//Definimos la clase Pizza
public class Pizza {

    //Declaramos los atributos de la clase
    private String nombre;

    private Double precio;

    private String[] ingredientes;

    //Creamos el constructor con los atributos
    public Pizza(String nombre, Double precio, String[] ingredientes) {
        super();
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    //Creamos el constructos vacio
    public Pizza() {
    }

    //Creamos los getter y los setter de todos los atributos
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

    //Definimos el atributo cuando es un array
    @XmlElementWrapper(name = "ingredientes")
    @XmlElement(name = "ingrediente")
    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

}
