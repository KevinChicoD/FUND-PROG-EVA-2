/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_if.java;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_1_IFJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura = new Scanner(System.in);
        int calif;
        System.out.println("Intrdoduce tu calificacion");
        calif = captura.nextInt();
        
        if(calif >= 70){//if (expresion a evaluar)
            //este bloque siempre es verdad
            //Las llaves se usan cuando son mas de una instruccion
            //dentro del if es una sola, no se usan
            System.out.println("Acreditado (A)");//pertenece al if
        System.out.println("felicidades");//no pertenece
    }else//si no es verdad
            //Este bloque siempre es falso
         System.out.println("No acreditado (NA)");
        
    System.out.println("fin del programa");
    }
    

    }
  
