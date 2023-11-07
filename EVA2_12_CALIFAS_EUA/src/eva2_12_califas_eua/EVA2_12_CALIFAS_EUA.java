/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calificacion;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingresa la calificacion");
        calificacion = captu.nextInt();
        
        if((calificacion > -1) && (calificacion <= 100)){
            System.out.println("La calificacion "+ calificacion + " es valida :) ");
            
            if((calificacion >= 90) && (calificacion <= 100))
            System.out.println("La calificacion "+ calificacion + " es 'A' ");
            
            else if((calificacion >= 80) && (calificacion <= 89))
            System.out.println("La calificacion "+ calificacion + " es 'B' ");
            
            else if((calificacion >= 70) && (calificacion <= 79))
            System.out.println("La calificacion "+ calificacion + " es 'C' ");
            
            else if((calificacion >= 60) && (calificacion <= 69))
            System.out.println("La calificacion "+ calificacion + " es 'D' ");
            
            else if((calificacion >= 0) && (calificacion <= 60))
            System.out.println("La calificacion "+ calificacion + " es 'F' ");
            
    }else
            System.out.println("La calificacion "+ calificacion + " no es valida :( ");
   
    }
    
}
