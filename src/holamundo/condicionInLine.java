package holamundo;

import java.util.Scanner;

public class condicionInLine {

    public static void main(String[] args) {

        //dada una edad decidir si es mayor de edad utilisado estructura de decision in-line
        int edadMinima = 18;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su edad : ");
        int edadIngresadad = scanner.nextInt();
        String message = (edadIngresadad > edadMinima) ? "eres mayor de edad" : "eres menor de edad";
        System.out.println(message);

    }

}
