import java.util.Scanner;

public class App {

    private String mostrarAltura (int altura){

        String resultado = "";
        
        if(altura >= 180){

            resultado = ("You are tall person, you are " + altura + " tall");

        }else{

            resultado = ("You are a litle person");

        }

        return resultado;
    };
    public static void main(String[] args) throws Exception {
        // comentario de una sola linea
        System.out.println("This is my firs Hello World in Java!");
        
        // variables: siempre debemos especificar el tipo de dato

        int edad = 27;
        String nombre = "Agustin Ibar";
        Boolean verdadero = true;

        System.out.println(nombre);

        //concatenacion con +

        System.out.println("I'm" + nombre + " and I'm" + edad + "years old.");

        //concatenacion con printf

        // System.out.printf("My name is %s and I'm %d  years old", nombre, edad);

        //entrada de datos

        Scanner sc = new Scanner(System.in); //con el .in tomamos lo que entra por sistema

        // System.out.println("Como te llamas?: ");

        // String name = sc.nextLine();

        // System.out.println("The user's name is: " + name);

        //condicionales

        System.out.println("How tall are you?: ");

        int altura = sc.nextInt();

        // if(altura >= 180){
        //     System.out.println("You are tall person, you are " + altura + " tall");
        // }else{
        //     System.out.println("You are a litle person");
        // }

        App app = new App();

        System.out.println(app.mostrarAltura(altura));

    }
}
