package basic.c02_operators;

public class OperatorsExercises {
    public static void main(String[] args){
        // 1. Crea una variable con el resultado de cada operación aritmética.
        double a = 16;
        System.out.println(a+12);
        System.out.println(a-5);
        System.out.println(a/3);
        System.out.println(a*4);
        System.out.println(a%3);
        System.out.println("---- ----");
        // 2. Crea una variable para cada tipo de operación de asignación.
        var b = 13;
        b += 2;
        System.out.println(b);
        int c = 34;
        c -= 11;
        System.out.println(c);
        float d = 45.12f;
        d /= 2;
        System.out.println(d);
        double e = 22.56;
        e *= 2;
        System.out.println(e);
        int f = 45;
        f %= 2;
        System.out.println(f);

        System.out.println("---- ----");

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println( 11 >= 1);
        System.out.println( 14 <= 20);
        System.out.println( 2 == 2);
        System.out.println("---- ----");

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println( 2 <=1 );
        System.out.println( 4 == 8 );
        System.out.println(5 >= 30 );
        System.out.println("---- ----");

        // 5. Utiliza el operador lógico and.
        System.out.println((356 > 56) && (356 < 500) );
        System.out.println("---- ----");

        // 6. Utiliza el operador lógico or.
        System.out.println( 25 >= 30 || 43 <= 60);
        System.out.println("---- ----");

        // 7. Combina ambos operadores lógicos.
        System.out.println( (185 <= 30) || (12 > 2) && (20 < 19) );
        System.out.println("---- ----");

        // 8. Añade alguna negación.
        System.out.println(!( 33 >= 21));
        System.out.println("---- ----");

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int h = 12;
        System.out.println((h++));
        System.out.println(++h);
        System.out.println(--h);
        System.out.println("---- ----");

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        int i = 78;
        int j = 321;
        int result = i + j;
        System.out.println( i >= j && j == i || result < 500);
        System.out.println("---- ----");
    }
}
