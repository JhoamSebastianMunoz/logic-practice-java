package basic.c04_conditionals;

public class ConditionalExercises {
    public static void main(String[] args){
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
            var age = 12;
            if(age >= 18){
                System.out.println("El usuario tiene: " +age+ " años, por lo que puede votar");
            }else{
                System.out.println("El usuario tiene: " +age+ " años, por lo que NO puede votar");
            }
        System.out.println("-----------------------------------------------------------------");
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        var num1 = 12;
        int num2 = 12;

        if(num1 > num2){
            System.out.println("num1 = " +num1+ ", por lo que es mayor que num2 = " +num2);
        }else if(num1 < num2){
            System.out.println("num1 = " +num1+ ", por lo que es menor que num2 = " +num2);
        }else{
            System.out.println("num1 = " +num1+ ", por lo que es igual que num2 = " +num2);
        }
        System.out.println("-----------------------------------------------------------------");
        // 3. Dado un número, verifica si es positivo, negativo o cero.
        var num3 = -12;
        if(num3 < 0){
            System.out.println(num3+": El número es negativo");
        } else if (num3 > 0) {
            System.out.println(num3+": El número es positivo");
        }else {
            System.out.println(num3+": El número es 0");
        }
        System.out.println("-----------------------------------------------------------------");
        // 4. Crea un programa que diga si un número es par o impar.
        var numero = 3;

        if ((numero % 2) == 0){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }
        System.out.println("-----------------------------------------------------------------");
        // 5. Verifica si un número está en el rango de 1 a 100.
        int num4 = 0;
        if((num4 >= 1) && (num4 <= 100)){
            System.out.println("La variable num4 = " +num4+ ", está en el rango de 1 a 100");
        }else {
            System.out.println("La variable num4 = " +num4+ ", No está en el rango de 1 a 100");
        }
        System.out.println("-----------------------------------------------------------------");
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int day = 6;
        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

        }
        System.out.println("-----------------------------------------------------------------");
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        var note = 101;
        String state1 = "Sobresaliente";
        String state2 = "Aprobado";
        String state3 = "Suspenso";

        if((note >= 0) && (note <= 59)){
            System.out.println("La Nota es = "+note+ ", por lo que el estado del estudiante es = " +state3);
        } else if ((note >= 60 ) && (note <= 89) ) {
            System.out.println("La Nota es = "+note+ ", por lo que el estado del estudiante es = " +state2);
        } else if ((note >= 90) && (note <= 100)) {
            System.out.println("La Nota es = "+note+ ", por lo que el estado del estudiante es = " +state1);
        }else{
            System.out.println("La Nota es = "+note+ ", por lo que es incorrecta ya que debe estar entre el rango de 0 a 100 ");
        }
        System.out.println("-----------------------------------------------------------------");
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        double age2 = 12;
        boolean family = true;
        if(age2 < 0.1 || age2 > 123){
            System.out.println("El cliente reporta que tiene: " +age2+ ", años, por lo que o no ha nacido o no esta vivo");
        } else if (age2 >= 15){
            System.out.println("El cliente puede entrar ya que tiene: " +age2+ ", años.");
        } else if (( age2 < 15 ) && (family)){
            System.out.println("El cliente puede entrar ya que tiene: " +age2+ ", años, pero sí cuenta con acompañante");
        } else {
            System.out.println("El cliente NO puede entrar ya que tiene: " +age2+ ", años y No cuenta con acompañante");
        }
        System.out.println("-----------------------------------------------------------------");
        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letter = Character.toLowerCase('A');

        if ( !Character.isLetter(letter)){
            System.out.println("El valor ingresado sobre la variable letter no es una letra válida");
        }else if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' ||letter == 'u'){
            System.out.println("la variable letter es: " +letter+ ", por lo que es una vocal");
        }else {
            System.out.println("la variable letter es: " +letter+ ", por lo que es una consonante");
        }
        System.out.println("-----------------------------------------------------------------");
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int a = -17;
        int b = -38;
        int c = -15;

        int major;

         if((a > b )&& (a > c)){
            major = a;
            System.out.println("La variable a es mayor, con el valor de: "+major);
        } else if ((b > a ) && (b > c)) {
             major = b;
             System.out.println("La variable b es mayor, con el valor de: "+major);
         }else{
             major = c;
             System.out.println("La variable c es mayor, con el valor de: "+major);
         }

    }
}
