package holamundo;

import java.util.Scanner;

public class mostrarnumeroWhile {

    public static void main(String[] args) {

        //pedir numero a usuario para mostrar la tabla del 1-9 de ese numero
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero : ");
        //leer valor ingresado
        int numeroDeTabla = scanner.nextInt();

        int i = 0; //nuestro contador 
        
        // estructura iteratica while -mientras
        System.out.println("la table del " + numeroDeTabla);
        
        while (i <  10) {
            i = i + 1;
            int producto = i * numeroDeTabla;
            System.out.println(i + " x " + numeroDeTabla + " = " + producto);

        }

    }

}
