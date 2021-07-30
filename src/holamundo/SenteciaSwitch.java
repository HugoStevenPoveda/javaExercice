//ingresado un dia en minusculas  lo devuelve ingles
package holamundo;

import java.util.Scanner;

public class SenteciaSwitch {

    public static void main(String[] args) {

        //ingresa dia por teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dia de la semana ");

        String dia = scanner.nextLine();
        String diaIngles;

        switch (dia) {
            case "lunes":
                diaIngles = "Monday" ;
                break;
            case "martes":
                diaIngles ="tuesday";
                break;
            case "miercoles":
                diaIngles ="wednesday";
                break;
            case "jueves":
                diaIngles ="thursday";
                break;
            case "viernes":
                diaIngles ="friday";
                break;
            case "savado":
                diaIngles ="saturday";
                break;
            case "domingo":
                diaIngles ="sunday";
                break;
            default:
                diaIngles ="no existe ese dia , recuarda ingresarlo con minuscula";
        }
           System.out.println("El " + dia +" En ingles es " + diaIngles);

    }

}
