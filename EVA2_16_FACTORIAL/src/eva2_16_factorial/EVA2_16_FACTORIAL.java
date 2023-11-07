/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_16_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el numero");
        num = captu.nextInt();
        
        int factorial;
        factorial = 1;
        
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " - ");
            factorial = factorial * i;
        }
        System.out.println("");
        System.out.println("factorial de " + num + " es = " + factorial);
        System.out.println("");
        
        int factorial2;
        factorial2 = 1;
        for (int a = num; a >= 1; a--) {
            System.out.print(a + " -");
        factorial2 = factorial2 * a;  
            System.out.println("");
        System.out.println("factorial de " + num + " es = " + factorial2);
        }
    }
    
}
