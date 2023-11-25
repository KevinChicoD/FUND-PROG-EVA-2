/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg10;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cade;
        String carac [] = new String [10];
        int conta = 0;
        String msj = "";
        
        carac[0] = "0";
        carac[1] = "1";
        carac[2] = "2";
        carac[3] = "3";
        carac[4] = "4";
        carac[5] = "5";
        carac[6] = "6";
        carac[7] = "7";
        carac[8] = "8";
        carac[9] = "9";
        
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un texto");
        cade = input.nextLine();
        
        for (int i = 0; i < cade.length(); i++) {
            conta = 0;
            for (int j = 0; j < 10; j++) {
                if(cade.charAt(i) == carac [j].toString().charAt(0)){
                    conta = 1;
                    continue;
                }
                
            }
            if(conta == 0){
                msj = " No";
                continue;
            }
        }
        System.out.println("el numero: " + msj + " es valido");
    }
    
}
