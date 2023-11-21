/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_28_arreglos_mdim;

/**
 *
 * @author invitado
 */
public class EVA2_28_ARREGLOS_MDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // TODO code application logic here
        //ARREGLOS DE DOS DIMENCIONES: MATRIZ
        int [][] matriz = new int [5][10];
        
        //ASIGNAR UN ARREGLO
        matriz[1][3] = 100;
        System.out.println("valor en[1][3]="+ matriz[1][3]);
        System.out.println("matriz.length="+ matriz.length);
        
        //matriz 
        for (int i = 0; i < matriz.length; i++) {
              for (int j = 0; j < matriz[i].length; j++) {
                  matriz[i][j]= (int) (Math.random()*100); 
            }
  
        }
        for (int i = 0; i < matriz.length; i++) {
              for (int j = 0; j < matriz[i].length; j++) {
                  System.out.println("["+matriz[i][j]+"]"); 
            }
  
        }
    }
    
}
