package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Xml_To_Jaxb {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        //String miArchivo = "pizzas.xml";

        //Creamos el contexto indicando la clase raiz
        JAXBContext context = JAXBContext.newInstance(ListaPizzas.class);

        //Creamos el unmarshaller en el contexto de la clase raiz
        Unmarshaller unmarshaller = context.createUnmarshaller();

        //Obtenemos los datos de un Reader con el metodo unmarshaller
        ListaPizzas listaPizzas2 = (ListaPizzas) unmarshaller.unmarshal(new FileReader("pizzas.xml"));

        //Extraemos los datos y los mostramos por pantalla
        System.out.println("Lista de las pizzas: ");

        ArrayList<Pizza> lista = listaPizzas2.getListaPizzas();
        for (Pizza pizza : lista) {
            System.out.println("\tNombre de la pizza: " + pizza.getNombre());
            System.out.println("\tPrecio de la pizza: " + pizza.getPrecio());
            System.out.println("\tIngredientes de la pizza: " + Arrays.toString(pizza.getIngredientes()));
            System.out.println();
        }
    }
}
