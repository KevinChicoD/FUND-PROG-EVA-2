/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_else_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_8_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingresa el mes");
           mes = captu.nextInt();
           
       if((mes >= 1) && (mes <= 12))
            System.out.println("El numero " + mes + " es un numero valido");
            else if(mes == 1)
            System.out.println("Enero");
        else if(mes == 1)
            System.out.println("Febrero");
        else if(mes == 1)
            System.out.println("Marzo");
        else if(mes == 1)
            System.out.println("Abril");
        else if(mes == 1)
            System.out.println("Mayo");
        else if(mes == 1)
            System.out.println("Junio");
        else if(mes == 1)
            System.out.println("Julio");
        else if(mes == 1)
            System.out.println("Agosto");
        else if(mes == 1)
            System.out.println("Septiembre");
        else if(mes == 1)
            System.out.println("Octubre");
        else if(mes == 1)
            System.out.println("Noviembre");
        else if(mes == 1)
            System.out.println("Diciembre");
       else
            System.out.println("El numero " + mes +" no es valido");
}
}
