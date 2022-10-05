package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement()
public class ListaPizzas {

    private ArrayList<Pizza> listaPizzaz;

    private String nombre;

    private Double precio;

    private String[] ingredientes;

    public ListaPizzas(ArrayList<Pizza> listaPizzaz, String nombre, Double precio, String[] ingredientes) {
        this.listaPizzaz = listaPizzaz;
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public ListaPizzas() {
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

    @XmlElementWrapper(name = "Ingredientes")
    @XmlElement(name = "Ingrediente")
    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    @XmlElementWrapper(name = "ListaPizzas")
    @XmlElement(name = "Pizza")
    public ArrayList<Pizza> getListaPizzaz() {
        return listaPizzaz;
    }

    public void setListaPizzaz(ArrayList<Pizza> listaPizzaz) {
        this.listaPizzaz = listaPizzaz;
    }
}
