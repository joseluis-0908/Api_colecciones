
package test;

import java.util.*;// solo utilizo import java.util.* porque vamos a utilizar varias clases o interfaces en este paquete


public class TestColecciones {
    public static void main(String[] args) {
        List milista = new ArrayList();
        milista.add("lunes");
        milista.add("martes");
        milista.add("miercoles");
        milista.add("jueves");
        milista.add("viernes");
        milista.add("sabado");
        milista.add("domingo");
        //1. Puedo utilizar de dos formas como lo es el ciclo for de la siguiente foma o el forEach
        for (Object elemento:milista) {
        System.out.println(" EL DIA: " + elemento);
        }
                //2. con forEach seria de la sigueinte forma
        milista.forEach((elemento) -> {
            System.out.println(" EL DIA: " + elemento);
        });
    }
}

