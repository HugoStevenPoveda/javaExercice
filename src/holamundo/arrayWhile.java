/*
llena un array hasta que el usuario ingrese 0 y luego muestra en pantalla los elementos de array
 */
package holamundo;

import java.util.Scanner;

public class arrayWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos a guardar");
        int numero = scanner.nextInt();
        int numeros[] = new int[numero];

        System.out.println("ingrese el  primer valor o cero para no ingresar mas ");
        int valoresIngresados = scanner.nextInt();

        int i = 0;//contador

        //me recibe los datos
        while (valoresIngresados != 0 && i < numero) {

            System.out.println("ingrese l elemento" + i + " : ");
            valoresIngresados = scanner.nextInt();
            numeros[i++] = valoresIngresados;

        }
        //muestra los datos 

        for (int j = 0; j < numero; j++) {
            System.out.println(numeros[j]);

        }

    }

}
