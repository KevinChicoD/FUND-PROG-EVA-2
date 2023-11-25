/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num;
        int sobra;
        
        System.out.println("Ingresa un num: ");
        num = input.nextInt();
        
        System.out.println("su equivalencia binaria es:");
        
        do{
            sobra = num % 2;
            num = num / 2;
            System.out.println(sobra);
        }while (num > 0);
    }
    
}
