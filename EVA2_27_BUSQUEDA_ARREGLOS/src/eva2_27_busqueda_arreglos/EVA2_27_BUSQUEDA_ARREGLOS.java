/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_27_busqueda_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_27_BUSQUEDA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        // crear un arreglos
        int[]arreglo = new int[15];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= (int)(Math.random()*100);
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("["+arreglo[i]+"]");
        }
        System.out.println("");
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Que numero buscas?");
        num= leer.nextInt();
        //BUE¿SQUEDA SECUENCIAL (POR FUERZA BRUTA)
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == num) {
                System.out.println("el valor encontrado en la posicion"+ i);
                break;
            } 
        }
        System.out.println("no se encuentra en la numeracion");
    }
    
}
