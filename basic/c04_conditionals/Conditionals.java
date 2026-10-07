package basic.c04_conditionals;

public class Conditionals {
    public static void main(String[] args){
        //Condicionales
        //Sentencia if

        var age = 17;

        if (age > 18){
            System.out.println("El usuario tiene: "+age+ " años, por lo que es mayor de edad");
        }else if( age == 18){
            System.out.println("El usuario tiene: "+age+ " años, por lo que recién cumplió los 18 años");
        }else{
            System.out.println("El usuario tiene: "+age+ " años, por lo que es menor de edad");
        }

        // Sentencia: Switch

        var day = 3;

        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            default:
                System.out.println("No es ni lunes, ni Martes");

        }
    }
}
