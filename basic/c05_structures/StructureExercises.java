package basic.c05_structures;

import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructureExercises {

    static public void main (String[] args){
        // 1. Crea un Array con 5 valores e imprime su longitud.
        System.out.println("1. Crea un Array con 5 valores e imprime su longitud.");
        String[] countries = new String[5];

        countries[0] = "Japon";
        countries[1] = "Colombia";
        countries[2] = "Rusia";
        countries[3] = "Chile";
        countries[4] = "Venezuela";
        System.out.println(countries.length);
        System.out.println("------------------------------------------------------");

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.");
        System.out.println(countries[3]);
        countries[3] = "China";
        System.out.println(countries[3]);
        System.out.println("------------------------------------------------------");

        // 3. Crea un ArrayList vacío.
        System.out.println("3. Crea un ArrayList vacío.");
        var numbers = new ArrayList<Integer>();
        System.out.println(numbers.size());
        System.out.println("------------------------------------------------------");

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        System.out.println("4. Añade 4 valores al ArrayList y elimina uno a continuación.");
        numbers.add(2);
        numbers.add(5);
        numbers.add(78);
        numbers.add(1);

        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        System.out.println("------------------------------------------------------");

        // 5. Crea un HashSet con 2 valores diferentes.
        System.out.println("5. Crea un HashSet con 2 valores diferentes.");
        HashSet<String> things = new HashSet<>();
        things.add("Carro");
        things.add("Lego");
        System.out.println(things);
        System.out.println("------------------------------------------------------");

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        System.out.println("6. Añade un nuevo valor repetido y otro sin repetir al HashSet.");
        things.add("Carro");
        System.out.println(things);
        things.add("Barbie");
        System.out.println(things);
        System.out.println("------------------------------------------------------");

        // 7. Elimina uno de los elementos del HashSet.
        System.out.println("7. Elimina uno de los elementos del HashSet.");
        things.remove("Carro");
        System.out.println(things);
        System.out.println("------------------------------------------------------");

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        System.out.println("8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.");
        HashMap<String, String> informations = new HashMap<>();

        informations.putIfAbsent("Juan", "3114561234");
        informations.putIfAbsent("Marcos", "3205561234");
        informations.put("Marta", "3114567812");
        System.out.println(informations);
        System.out.println("------------------------------------------------------");

        // 9. Modifica uno de los contactos y elimina otro.
        System.out.println("9. Modifica uno de los contactos y elimina otro.");
        informations.replace("Juan", "3114523174");
        informations.remove("Marta", "3114567812");
        System.out.println(informations);
        System.out.println("------------------------------------------------------");

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        System.out.println("10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.");
        var transformArraylists = new ArrayList<String>(Arrays.asList(countries));
        System.out.println(transformArraylists);

        var transformHasSets = new HashSet<String>(transformArraylists);
        System.out.println(transformHasSets);

        var transformHashMaps = new HashMap<String, String>();
        for (String element: transformHasSets){
            transformHashMaps.put(element, element);
        }
        System.out.println(transformHashMaps);
        System.out.println("------------------------------------------------------");
    }
}
