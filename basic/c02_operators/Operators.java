package basic.c02_operators;

public class Operators {
    static public void main(String[] args){
        //Operadores ariméticos
        System.out.println("---------------- Ariméticos -----------------------------");
        var a = 5;
        var b = 2;
        float c = 5;
        float d = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        // divide un entero
        System.out.println(a/b);
        // divide un decimal
        System.out.println(c/b);
        // modulo obtiene el residuo, por lo que si es = 0 es par y si es = 1 es impar
        System.out.println(a%b);

        //Operadores de Asignación:
        System.out.println("---------------- Asignación -----------------------------");
        a = b * 2;
        System.out.println("El valor de la variable a = "+a);
        a += 1;
        System.out.println("El valor de la variable a = "+a);
        a -= 1;
        System.out.println("El valor de la variable a = "+a);
        a *= 2;
        System.out.println("El valor de la variable a = "+a);
        a /= 1;
        System.out.println("El valor de la variable a = "+a);
        a %= 3;
        System.out.println("El valor de la variable a = "+a);

        // Operadores relacionales o de comparación: ==, !=

        //Igual: ==
        System.out.println("---------------- Igual -----------------------------");
        System.out.println("La variable de a: "+a+", es igual a la variable b: "+b+ " = "+(a == b));
        System.out.println("La variable de a: "+a+", es igual a la variable d: "+d+ " = "+(a == d));
        System.out.println("La variable de a: "+a+", es igual a 2: " + " = "+(a == 2));

        //Desigual: !=
        System.out.println("---------------- Desigual -----------------------------");
        System.out.println("La variable de a: "+a+", es diferente a la variable b: "+b+ " = "+(a != b));

        // otros: > >= < <=
        System.out.println("---------------- otros -----------------------------");
        System.out.println("La variable de a: "+a+", es mayor que d: "+d+ " = "+(a > d));
        System.out.println("La variable de a: "+a+", es mayor o igual que c: "+d+ " = "+(a >= c));
        System.out.println("La variable de a: "+a+", es menor que d: "+d+ " = "+(a > d));
        System.out.println("La variable de a: "+a+", es menor o igual que d: "+d+ " = "+(a >= d));

        // Operadores Lógicos

        // Y (AND) = && : Solo es True si todas son true
        System.out.println("---------------- && -----------------------------");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(4 > 2 && 5 == 2);

        // Ó (OR)= || : Solo es False si todas son false
        System.out.println("---------------- || -----------------------------");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(4 > 2 || 5 == 2);

        // Negación (![variable o expresión])= ! : invirte false o true
        System.out.println("---------------- ! -----------------------------");
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(4 > 2) || 5 == 2);

        // Operadores Unarios: Incremento y Decremento:
        int e = 12;
        System.out.println("---------------- Unarios -----------------------------");
        System.out.println(-e);
        System.out.println(+e);
        System.out.println("------------------------------------------------------");
        System.out.println(e++);
        System.out.println(e);
        System.out.println("------------------------------------------------------");
        System.out.println(++e);
        System.out.println(e);
        System.out.println("------------------------------------------------------");
        System.out.println(e--);
        System.out.println(e);
        System.out.println("------------------------------------------------------");
        System.out.println(--e);
        System.out.println(e);

    }

}
