package holamundo;

import java.util.Scanner;

public class potenciasFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            int cuadrado = i * i;
            System.out.println(" El  " + i + "  su cuadrado es  " + cuadrado);

        }

    }

}
