package holamundo;
// crear array  conociendo los elemento 

import java.util.Scanner;

public class DiasSemana {

    public static void main(String[] args) {
        //arrayde dias de la semana
        String dias[] = {"lunes", "martes", "miercoles",
            "jueves", "viernes", "savado", "domingo"};

        //usuario ingresa el dia deseado en numero
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero del dia ");
        int dia = scanner.nextInt();
        
        if (dia > 0 && dia <= dias.length) {
            System.out.println("tu dia es " + dias[dia - 1]);

        } else {
            System.out.println("tu dia no existe ");

        }

    }

}
