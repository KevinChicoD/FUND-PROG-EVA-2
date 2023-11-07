/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_22_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_22_DO_WHILE {
    final static String NOMBRE_USUARIO = "Admin";
    final static String PASSWORD = "Admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario;
        String pwd;
        Scanner leer = new Scanner(System.in); 
       
        do{
            System.out.println("Intruduce el usuario");
            usuario = leer.nextLine();  
            System.out.println("Intruduce la contraseña");
            pwd = leer.nextLine();
                    
        }while(!usuario.equals(NOMBRE_USUARIO) || (!pwd.equals(PASSWORD)));
        System.out.println("BIENVENIDO");
    }
    
}
