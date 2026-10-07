package basic.c03_string;

import java.util.Locale;

public class Strings {

    public static void main(String[] args){
        String name = "Jhoam";
        String surName = new String( "Muñoz");

        //Operaciones básicas
        //Contatenación
        System.out.println("------------------------------");
        System.out.println(name+ " "+surName);
        //Longitud
        System.out.println("------------------------------");
        System.out.println(name.length());
        System.out.println("------------------------------");
        System.out.println(surName.charAt(name.length() -1));

        //Substring:
        System.out.println("------------------------------");
        System.out.println(name.substring(1, 2));

        //Mayúsculas, minúsculas
        System.out.println("------------------------------");
        name = name.toUpperCase();
        System.out.println(name);
        System.out.println(name.toLowerCase());

        //Contiene
        System.out.println("------------------------------");
        System.out.println("Bienvenidos todos a clases".toLowerCase().contains("Bienvenidos"));
        System.out.println("Bienvenidos todos a clases".toLowerCase().contains("bienvenidos"));

        //Igual
        System.out.println("------------------------------");
        var a = "Daniel";
        String b = "Daniel";
        var c = "Daniel";
        var d = new String("Daniel");

        System.out.println("a es igual (==) a b? "+(a == b));
        System.out.println("a es igual (==) a c? "+(a == c));
        System.out.println("a es igual (==) a d? "+(a == d));
        //Lo mejor es comparar el contenido del objeto mediante .equals
        System.out.println("a es igual .(equals) a b? "+(a.equals(d)));

        // Eliminar o recortar, trim(elimina espacios al inicio o final de una cadena de texto)
        System.out.println("------------------------------");
        System.out.println(" ¿Que tal como están todos? ".trim());

        // Reemplazar, .replace(reemplaza el caracter)
        System.out.println("------------------------------");
        System.out.println("Cada vez aprendemos más".replace(" ", ""));

        //Formatear: .format(formatea variables %s(string), %d(int), %f(float))
        System.out.println("------------------------------");
        String myName = "Marcos";
        int myAge = 27;
        String text = "Hola cómo están todos?, mi nombre es: %s y tengo: %d años";
        System.out.println(String.format("Hola cómo están todos?, mi nombre es: %s y tengo: %d años", myName,myAge ));
        System.out.println(String.format(text, myName,myAge ));

    }
}
