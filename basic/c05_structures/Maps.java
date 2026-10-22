package basic.c05_structures;

import java.util.HashMap;

public class Maps {
    static public void main(String[] args){
        // Almacena un diccionario, clave: valor
        // Hay que definir de que tipos son: Key and Value
        // Se hashea el almacenamiento por lo que es desordenado el almacenamiento

        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, Integer>();

        //Tamaño
        System.out.println(names.size());
        names.put("Raul","raul@gmail.com");
        names.put("Sebastian", "sebastian@gmail.com");
        names.put("Viviana", "viviana@gmail.com");
        names.put("Lucas", "lucas@gmail.com");
        System.out.println(names.size());

        // Acceder a los elementos
        System.out.println(names.get("Raul"));
        System.out.println(names);

        //verificar elementos
        System.out.println(names.containsKey("dev"));
        System.out.println(names.containsKey("Lucas"));

        System.out.println(names.containsValue("sebastian@gmail.com"));
        System.out.println(names.containsValue("Martin"));

        //Eliminar elementos
        System.out.println(names.remove("Raul"));
        System.out.println(names.remove("Lucas"));
        System.out.println(names);

        //Limpiar HasMap
        names.clear();
        System.out.println(names);

        //Modificación de elementos
        names.put("Viviana", "viviana@gmail.com");//Si no existe lo crea, si existe lo modifica
        System.out.println(names);
        names.put("Viviana", "viviana12@gmail.com");//Si no existe lo crea, si existe lo modifica
        System.out.println(names);

        names.replace("Marcos", "marcos@gmail.com");// SOLO si existe lo modifica
        System.out.println(names);

        names.putIfAbsent("Marcos", "marcos@gmail.com"); // SOLO si NO existe lo crea
        System.out.println(names);

        //Otras operaciones

        System.out.println(names.isEmpty()); // revisa si está vacío

        var values = names.values();
        System.out.println(values); // Devuelve un List

    }
}
