/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
       
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        num1 = input.nextInt();
        
        int suma = 1;
        
         for (int i = 1; i <= num1; i++) {
            System.out.print(i + " - ");
            suma = suma + i;
        }
        System.out.println("");
        System.out.println("la suma de todos los numeros es = " + suma);
    }
    
}
