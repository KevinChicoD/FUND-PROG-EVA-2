/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        String texto;
        Scanner input = new Scanner(System.in);
        
        do{
        System.out.println("Ingresa el numero");
        num1 = input.nextInt();
        
        if(num1 == 0)
            System.out.println("El numero es cero");
        else if(num1 < 0)
            System.out.println("El numero es negativo");
        else if(num1 > 0)
            System.out.println("El numero es positivo");
        
         System.out.println("¿Quieres cerrar el programa?");
        texto = input.next();
        
        }while (texto.equals("No"));
            
            System.out.println("Fin de el programa");
    }
}
