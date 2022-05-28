package com.company;


import java.util.*;

public class CollectionMap3{

    public static void main(String args[]) {
        /* This is how to declare TreeMap */
        TreeMap<Integer, String> empleados = new TreeMap<Integer, String>();

        /*Adding elements to TreeMap*/
        empleados.put(1, "Empleado1");
        empleados.put(23, "Empleado2");
        empleados.put(70, "Empleado3");
        empleados.put(4, "Empleado4");
        empleados.put(2, "Empleado5");

        /* Display content using Iterator*/
        Set set = empleados.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("La clave es: "+ mentry.getKey() + " y Valor es: ");
            System.out.println(mentry.getValue());

        } } }