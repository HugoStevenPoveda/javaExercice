package holamundo;

import java.util.Scanner;
//el usuario da la cantidad de filas y columnas y cramos un maris con esas dimesiones y los datos aleatorios

public class matrizNumerosAleatorios {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingresa la cantidad de filas ");
        int filas = scanner.nextInt();
        System.out.println(" Ingresa la cantidad de Columnas ");
        int columnas = scanner.nextInt();
        //se contrulle la matriz
        int matriz[][] = new int[filas][columnas];
        int numero;
        //carga datos de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numero = (int) (Math.random() * 1000);
                matriz[i][j] = numero;
        }

            }
        //se muestra la matriz
        for (int i = 0; i < filas; i++) {
            System.out.println("|");

            for (int j = 0; j < columnas; j++) {
                System.out.print("  " + matriz[i][j] + "  ");
            }
            System.out.println("|");
        }

    }

}
