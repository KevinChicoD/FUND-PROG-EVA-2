/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         int num;
         int max;
         int min;
         num = 0;
         max = 0;
         min = 0;
         
         do{
             System.out.println("Ingrese un numero");
             num = input.nextInt();
             if(num > max){
                 max= num;
             }
             else if(num < min){
                 min = num;
             }
         }while (num >= 0);
         System.out.println("El valor maximo:"+ max);
         System.out.println("El valor minimo:"+ min);
         System.out.println("Fin del programa");
         
    }
    
}
