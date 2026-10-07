package basic.c01_beginner;

public class DataTypes {
    public static void main(String[] args){
        //Datos primitivos
        //tipos de números: int, double, float, long, byte

        int myAge = 32;
        System.out.println(myAge);

        double bill = 43.34;
        System.out.println(bill);

        boolean isDev = true;
        isDev = false;
        System.out.println("Es Desarrollador? = " + isDev);

        // char se usa para un carácter
        char myCharacter = '@';
        System.out.println("My character is: " + myCharacter);

        //String: es una clase en java es un string dotado
        String name = "Jhoam";
        System.out.println("Mi nombre es: "+ name);

        // Nota: por compilación en otros lenguajes podemos saber mediante typeof que tipo de dato es,
        // pero en java es mediante las clases, ej:

        System.out.println(name.getClass().getSimpleName());

        //begin

    }
}
