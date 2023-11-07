/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingresa la calificacion");
        calif = captu.nextInt();
        
        //Evaluar
        //califa = 50 v/v = v
        if((calif >= 0) && (calif <= 100)){
            System.out.println("La calificacion "+ calif + " es valida");
        if(calif >= 70)
            System.out.println("Acreditasss!!!! :)))) ");
        else
            System.out.println("No acreditas!!! :(((( ");
    }else
            System.out.println("La calificacion "+ calif + " no es valida :( ");
    }
    
}
