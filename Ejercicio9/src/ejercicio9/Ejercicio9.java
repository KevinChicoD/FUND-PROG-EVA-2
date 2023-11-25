/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cade;
        char carac;
        int carac2 = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el texto");
        cade = input.nextLine();
        
        System.out.println("ingresa un caracter");
        carac = input.nextLine().charAt(0);
        
        for (int i = cade.length(); i < 10; i++) {
            if(cade.charAt(i) == carac){
                carac2 = carac2+ 1;
            }
            
        }
        System.out.println("El caracter: " + carac + "se repite " + carac2 + "veces");
    }
    
}
