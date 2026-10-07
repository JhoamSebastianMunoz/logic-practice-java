package basic.c01_beginner;

public class Variables {
    public static void main(String[] args) {
        String name = "";
        name= "Jhoam";
        int edad = 31;
        double modena = 3.23;
        boolean hombre = false;

        if(hombre == true){
            System.out.println(name+", es hombre");
        }else{
            System.out.println(name+", No es hombre");
        }
        System.out.println("Nombre: "+name+", Edad: "+edad+", Moneda: "+modena+", es Hombre?: "+hombre);

        // la palabra var hace que no tengamos que definir el tipo de la variable ya que segun el valor el la infiere
        var email = "JhoamSebstian@gmail.com";
        var numero = 23;


        // CONST: convención de nombres en Mayúscula sostenida y con la palabra reservada final
        final String EMAIL = "jhoam@gmail.com";
        System.out.println(email);
        System.out.println(numero);
        System.out.println(EMAIL);
    }
}
