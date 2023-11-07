/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_if2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura = new Scanner(System.in);
        int valor1;
        int valor2;
        System.out.println("Introduzaca el valor 1");
        valor1 = captura.nextInt();
        System.out.println("Introduzaca el valor 2");
        valor2 = captura.nextInt();
        
        if(valor1  > valor2)
            System.out.println("El valor mas grande es "+ valor1);//concatenar
        else{//cuando el valor es falso
            if(valor1 == valor2)
                System.out.println("Los dos numeros son iguales");
        else {
                System.out.println("El mas grande es "+ valor2);//concatenar
                }  
    }
    
}
