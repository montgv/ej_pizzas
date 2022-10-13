package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "pizzas")
public class ListaPizzas {

    private ArrayList<Pizza> listaPizzas;

    public ListaPizzas(ArrayList<Pizza> listaPizzas) {
        super();
        this.listaPizzas = listaPizzas;
    }

    public ListaPizzas() {
    }

    @XmlElement(name = "pizza")
    public ArrayList<Pizza> getListaPizzas() {
        return listaPizzas;
    }

    public void setListaPizzas(ArrayList<Pizza> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }
}
