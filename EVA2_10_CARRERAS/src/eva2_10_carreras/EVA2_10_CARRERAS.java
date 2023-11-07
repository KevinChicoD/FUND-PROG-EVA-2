/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String carrera,ISC, INF, LA, ARQ, IND, IDI, IGE;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingresa las iniciales de la carrera (ISC, INF, LA, ARQ, IND, IDI, IGE)");
        carrera = captu.nextLine();
        
        switch(carrera){
            case "ISC":
                System.out.println("ingeneria en sistemas computacionales");
                break;
            case "INF":
                System.out.println("Ingeneria en informatica");
                break;
            case "LA":
                System.out.println("Licenciatura en administracion");
                break;
            case "ARQ":
                System.out.println("Arquitectura");
                break;
            case "II":
                System.out.println("Ingeneria industrial");
                break;
            case "IDI":
                System.out.println("Ingeneria en diseño industrial");
                break;
            case "IGE":
                System.out.println("Ingeneria en gestion empresarial");
                break;
                 default://Siempre alfinal no tiene break 
                System.out.println("Las letras " + carrera + " no son validas");
        }
    }
    
}
