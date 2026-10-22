package basic.c05_structures;
import java.util.HashSet;


public class Sets {
    public static void main(String[] args){

        // Interfaz del Conjunto Java que almacena una colección de elementos únicos
        // No permite datos duplicados
        // La manera de guardar los elementos es desordenada y Hasheados

        // Declaración y creación
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        //Tamaño
        System.out.println(names.size());
        names.add("carlos");
        names.add("Juan");
        names.add("cesar");
        names.add("Carlos");
        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos
        // Error: System.out.println(names.getFirst());
        // Error: System.out.println(names.get(1));
        // Error: System.out.println(names.getLast());
        System.out.println(names);

        //Eliminar elementos
        names.remove("carlos");
        System.out.println(names);
        System.out.println(names.size());

        //buscar elementos
        System.out.println(names.contains("Carlos"));
        System.out.println(names.contains("carlos"));

        //--------------------
        var countries = new HashSet<String>();

        countries.add("Colombia");
        countries.add("Rusia");
        countries.add("Korea");
        System.out.println(countries);
        System.out.println(countries.size());

        //----------------------
        System.out.println(numbers.size());
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
        System.out.println(numbers.size());

        //conjuntos
        //names.addAll(numbers); Error: No puedo realizar un conjunto de tipo de datos distintos
        names.addAll(countries);
        System.out.println(names);
        System.out.println(names.size());

        names.removeAll(countries);
        System.out.println(names);
        System.out.println(names.size());

        //Limpiar
        names.clear();
        System.out.println(names);
    }
}
