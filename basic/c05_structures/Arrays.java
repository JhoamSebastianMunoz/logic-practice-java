package basic.c05_structures;

public class Arrays {
    public static void main (String[] args){
        // array list: es un tipo de estructura más extricta que otras estrucutras
        // es una estrucutra estática con la obligación de declarar un tamaño fijo.
        // Declaración y creación
        int[] numbers = new int[3];

        String[] names ={"Juan", "Carlos", "Daniela"};
        System.out.println(names[1]);

        // Acceder a los elementos
        System.out.println((new String[4])[1]);

        //   numbers[3] = 2; Error
        //Modificación
        numbers[0] = 2;
        numbers[1] =9;
        System.out.println((numbers[0]));

        System.out.println(names[2]);
        names[2] = "Mauricio";
        System.out.println(names[2]);

        System.out.println(names.length);
        names[2] = null;
        System.out.println(names[2]);
        System.out.println(names.length);

        // number[1] = null;

        boolean[] booleans = new boolean[6];
        System.out.println(booleans.length);
        System.out.println(booleans[0]);
        System.out.println(booleans[1]);
        System.out.println(booleans[2]);
        System.out.println(booleans[3]);
        System.out.println(booleans[4]);
        System.out.println(booleans[5]);




    }
}
