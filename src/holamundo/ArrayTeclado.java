package holamundo;

import java.util.Scanner;

public class ArrayTeclado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //usuario ingresa las filas y columnas deseada
        System.out.println("ingresa el numero de filas");
        int filas = scanner.nextInt();
        System.out.println("ingresa el numero de columnas");
        int columnas = scanner.nextInt();
        //contruccion matriz
        int matriz[][] = new int[filas][columnas];
        //se piden los datos matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("ingrese el dato " + (i+1) + " " + (j+1));
                int elemento = scanner.nextInt();
                matriz[i][j] = elemento;

            }
        }

        //presenta matriz
        for (int i = 0; i < filas; i++) {
            System.out.print("| ");
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println("| ");

        }

    }

}
