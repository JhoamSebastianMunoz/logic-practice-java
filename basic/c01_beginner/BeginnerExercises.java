package basic.c01_beginner;

public class BeginnerExercises {

    public static void main(String[] args){
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Jhoam Sebastian";
        System.out.println("Mi nombre es: "+name);
        // 2. Crea una variable de tipo int y asígnale tu edad.
        int myAge = 32;
        System.out.println("Mi nombre es: "+name+", y mi edad es: "+myAge);
        // 3. Crea una variable double con tu altura en metros.
        double height = 34.5;
        System.out.println("La altura es: " + height + " cm");
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        Boolean isLikeDev = true;
        System.out.println("A " + name + " le gusta programar? = " + isLikeDev);
        // 5. Declara una constante con tu email.
        final String EMAIL = "juan@gmail.com";
        System.out.println("El correo de: "+name+ " es: "+ EMAIL);
        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char myCharacter = 'J';
        System.out.println("La inicial de mi nombre es: "+myCharacter);
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String currentlocation = "Montenegro";
        System.out.println("Yo vivo en: "+currentlocation);
        currentlocation ="Armenia";
        System.out.println("Yo vivo en: "+currentlocation);
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a;
        int b;
        a =23;
        b=34;
        System.out.println("La suma de: "+a+" + "+b+" = "+(a+b));
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(name.getClass().getSimpleName());
        System.out.println(isLikeDev.getClass().getSimpleName());
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int number;
        number = 56;
        System.out.println(number);
    }
}
