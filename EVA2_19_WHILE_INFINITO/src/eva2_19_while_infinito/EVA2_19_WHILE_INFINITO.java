/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_while_infinito;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_19_WHILE_INFINITO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume;
        nume = 100;
        int captu;
        captu = 0;
        Scanner input = new Scanner(System.in);
        
        while(true){//ciclo infinito
            System.out.println("Introduce un numero");
            captu = input.nextInt();
            if(captu == nume){
                System.out.println("ADIVINASTE YEIYYY :))");
            break;//romper --> lo detiene
            }
        }
    }
    
}
