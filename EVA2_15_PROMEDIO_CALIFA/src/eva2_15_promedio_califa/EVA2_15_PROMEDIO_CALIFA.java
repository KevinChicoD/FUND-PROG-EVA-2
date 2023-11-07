/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_promedio_califa;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_15_PROMEDIO_CALIFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantCali;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el numero de calificaciones a capturar");
        cantCali = captu.nextInt();
        int sumaCalifas;
        sumaCalifas = 0;
        
        //acumulador
        
        for (int i = 1; i <= cantCali; i++) {
            System.out.println("introduce la calificacion");
            int califas;
            califas = captu.nextInt();
            sumaCalifas = sumaCalifas + califas;
        }
        System.out.println("La sumatoria " + sumaCalifas);
        double promedio;
        promedio = sumaCalifas / (cantCali * 1.0);
        System.out.println("El promedio de calificaciones es: " + promedio);
    }
    
}
