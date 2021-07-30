//dado un numero decidir si es par o impar
package holamundo;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        //ingresar un numero por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        int numeroEvaluado = scanner.nextInt();
        
        int resto = numeroEvaluado % 2;
        
        if (resto == 0) {
            System.out.println("El numero " + numeroEvaluado + " es par");

        } else {
            System.out.println("El numero " + numeroEvaluado + " es impar");

        }

    }

}
