package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

//Definimos el elemento raiz del XML
@XmlRootElement(name = "pizzas")

//Definimos la clase ListaPizzas
public class ListaPizzas {

    //Declaramos los atributos de la clase
    private ArrayList<Pizza> listaPizzas;

    //Creamos el constructor con los atributos
    public ListaPizzas(ArrayList<Pizza> listaPizzas) {
        super();
        this.listaPizzas = listaPizzas;
    }

    //Creamos el constructos vacio
    public ListaPizzas() {
    }

    //Creamos los getter y los setter de los atributos
    //Definimos el atributo cuando es un array
    @XmlElement(name = "pizza")
    public ArrayList<Pizza> getListaPizzas() {
        return listaPizzas;
    }

    public void setListaPizzas(ArrayList<Pizza> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }
}
