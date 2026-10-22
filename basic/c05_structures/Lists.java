package basic.c05_structures;
import java.util.ArrayList;


public class Lists {

    static public void main( String[] args){
        // array list: es un tipo de estructura más flexible que el Array,
        // es una estrucutra dinámica sin tener que declarar un tamaño fijo.

        // Declaración y creación
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        //Tamaño
        System.out.println(names.size());
        names.add("Daniel");
        names.add("Marta");
        names.add("Rodrigo");
        System.out.println(names.size());

        // Acceder a los elementos
        System.out.println(names);
        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        //Modificar Elementos
        names.set(2, "Daniela");
        System.out.println(names);

        //Eliminar elementos
        names.remove(2);
        System.out.println(names);

        //buscar elementos
        System.out.println(names.contains("Sebastian"));
        System.out.println(names.contains("Marta"));

        //Limpiar

        names.clear();
        System.out.println(names.size());





    }
}
