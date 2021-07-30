
package holamundo;

import java.util.Scanner;


public class suma {
    
    public static  void  main(String[] args){
        
        Scanner dato = new Scanner(System.in);
        System.out.print("digita tu numero1 ");
        
        int numeroUno = dato.nextInt();
        System.out.print("Digite el segundo numero  ");
        int numeroDos = dato.nextInt();
        int suma = numeroDos +numeroUno;
        System.out.println("tu suma es : "+ suma);        
        
    }
    
}
