/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        int resu;
        resu = 1;
        Scanner input = new Scanner(System.in);
                
        System.out.println("Ingresa el numero base:");
        num1 = input.nextInt();
        System.out.println("Ingresa el exponente por el cual el numero base sera multiplicado:");
        num2 = input.nextInt();
        
        
        for (int i = 1; i <= num2; i++) {
            resu *= i;
        }
        System.out.println("El resultado es: " + resu + ".");
        
    }
    
}
