package basic.c03_string;

public class StringExercises {
    public static void main(String[] args){
        // 1. Concatena dos cadenas de texto.
        System.out.println("Concatenación de dos cadenas"+ ", de texto");
        System.out.println(("---------------------------------------------"));
        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("La longitud de la cadena de texto es: "+("Les quiero agradecer a todos por la oportunidad de aceptarme en su equipo".length()));
        System.out.println(("---------------------------------------------"));
        // 3. Muestra el primer y último carácter de un string.
        var text = "esternocleidomastoideo";
        System.out.println("Primer carácter: "+(text.charAt(0))+ ", y el último carácter es: "+(text.charAt(text.length() -1)));
        System.out.println(("---------------------------------------------"));
        // 4. Convierte a mayúsculas y minúsculas un string.
        String text2 = "Este es el resultado de la conversión de mayúsculas y minúsculas";
        System.out.println(text2.toUpperCase());
        System.out.println(text2.toLowerCase());
        System.out.println(("---------------------------------------------"));
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        var text3 = "Verificar si la cadena de texto contiene una palabra en concreto";
        System.out.println(text3.toLowerCase().contains("verificar"));
        System.out.println(("---------------------------------------------"));
        // 6. Formatea un string con un entero.
        var number =17;
        System.out.println(String.format("Voy a formatear un entero: %d ",number));
        System.out.println(("---------------------------------------------"));
        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println("  La razón por la que estudio todos los días es porque quiero ser mejor cada vez más ".trim());
        System.out.println(("---------------------------------------------"));
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("Sustituyo todos los espacios en blanco por (-)".replace(" ", "-"));
        System.out.println(("---------------------------------------------"));
        // 9. Comprueba si dos strings son iguales.
        String text4 = "Marcos";
        var text5 = "Marcos";
        System.out.println("Comparación de String: "+(text4.equals(text5)));
        System.out.println(("---------------------------------------------"));
        // 10. Comprueba si dos strings tienen la misma longitud.
        String text6 = "Dime cualquier cosa y buscaré la manera de responder acertadamente";
        String text7 = "Dime algo y mejor me quedo callado";
        boolean isEquasLong = ((text6.length()) == (text7.length()));
        System.out.println("Comparación de la longitud de String1: '"+text6+"', y el String2: '"+text7+"', = "+isEquasLong);

    }
}
