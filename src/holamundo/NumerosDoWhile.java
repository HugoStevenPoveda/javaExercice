package holamundo;

import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class NumerosDoWhile {

    public static void main(String[] args) {
        //dato por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de enteros a ver ");
        int numero = scanner.nextInt();
        
        //contador
        int i = 1;

        do {
            System.out.println(i);
            i=i+1;
        } while (i <= numero);

    }

}
