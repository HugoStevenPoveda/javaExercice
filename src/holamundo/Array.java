package holamundo;

//definir un array de n elemento que el usuario ingresa valores y luego lo recorremos
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos a guardar  ");
        int numero = scanner.nextInt();
        //define un aaray de longitud en numero ingresado por el usuario
        int numeros[] = new int[numero];
        
        //me permite llenar el array desde el teclado
        for (int i = 0; i < numero; i++) {
            System.out.println("ingresa el dato indice " + i);
            int dato = scanner.nextInt();
            numeros[i] = dato;

        }
        //imprime el array
        System.out.println("su arreglo es  ");
        for (int i = 0; i < numero; i++) {
            System.out.println(numeros[i]);

        }

    }

}
