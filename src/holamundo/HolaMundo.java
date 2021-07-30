package holamundo;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        //bloque de codigo para traer datos 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita su nombre  edad  altura   : ");
        String nombre = scanner.nextLine();
        int  edad  =  scanner.nextInt();
        Double altura = scanner.nextDouble();
        System.out.println("hola :" + nombre 
                           + " Edad : " + edad
                            + " Mides : "+ altura);

    }
    
   

}
