/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String palabra;
        
        do{
            System.out.println("Ingrese la letra para saber que es: ");
            palabra = input.nextLine();
            switch(palabra){
            case "a":
                System.out.println("La letra" + palabra + "es vocal");
                break;
            case "e":
                System.out.println("La letra" + palabra + "es vocal");
                break;
            case "i":
                System.out.println("La letra" + palabra + "es vocal");
                break;
            case "o":
                System.out.println("La letra" + palabra + "es vocal");
                break;
            case "u":
                System.out.println("La letra" + palabra + "es vocal");
                break;
            default:
                System.out.println("Es una consonante");
        }
            System.out.println("quieres salor del programa?");
    }while(!palabra.equals("Si"));
        System.out.println("Fin del programa");
        }
    
}
