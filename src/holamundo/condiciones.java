package holamundo;

import java.util.Scanner;

public class condiciones {

    public static void main(String[] args) {

        //dado dos numeros define cual es mayor utiliza if 
        // solicitar numero de consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Ingresa el primer numero : ");
        int numero1 = scanner.nextInt();
        System.out.println("  Ingresa el segundo numero : ");
        int numero2 = scanner.nextInt();

        // utilizar la estructura de decision if
        if (numero1 > numero2) {
            System.out.println("el numero  " + numero1 + "  es el mayor");
        } else {
            System.out.println("el numero  " + numero2 + " es el mayor");

        }

    }
}
