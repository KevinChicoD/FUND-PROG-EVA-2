/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_5_operadores;

/**
 *
 * @author invitado
 */
public class EVA2_5_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma;
        int val1;
        int val2;
        
        val1 = 100;
        val2 = 200;
        
        suma = val1 + val2;//suma aritmetica 
        System.out.println("SUMA-------------------");
        System.out.println("La suma es = " + suma);//concatenacion
       
        //RESTA
        int resta;
       resta = val1 - val2;
        System.out.println("RESTA------------------");
        System.out.println("La resta es = " + resta);
        
        //MULTIPLICACION
        System.out.println("mULTIPLICACION---------");
        int multi;
        multi = val1 * val2;
        System.out.println("La multplicacion es = " + multi);
        
        //DIVISION
        System.out.println("DIVISION---------------");
        int divi;
        divi= val1 / val2;
        System.out.println("La division es = " + divi);
        val1 = 11;
        val2 = 2;
        divi= val1 / val2;
        System.out.println("la division de 11/2 = " + divi);
        int residuo;
        residuo = val1 %val2;
        System.out.println("Residuo de 11/2 = " + residuo);
        double resu;
        resu = val1/val2;
        System.out.println("la division de 11/2 = " + resu);
        double val2double;
        val2double = 2;
        resu = val1/val2double;
        System.out.println("la division de 11/2.0 = " + resu);
        //int resu = 11/2.0; // perdida de informacion
        resu = 11/2.0;
        System.out.println("la division de 11/2.0 = " + resu);
        
        //POTENCIAS
        double potencia;
        potencia = Math.pow(3, 3);
        System.out.println("tres elevado a la tres = " + potencia);
        
        //RAIZ -- NO HAY OPERADOR
        double raiz;
        raiz = Math.pow(100, 0.5);
        System.out.println("La raiz cuadrada de 100 es = " + raiz);
        
        //precedencia de operaciones
        int resuOp;
        int x = 3;
       int y = 2;
      int z = 5;
        resuOp = (x * z) +(x * y) / 2 - (y - z);
        System.out.println("El resultado es = " + resuOp);
        
        //Formula general
        double resuform, a = 3, b = 9, c = 3;
        resuform = ((-b)-Math.pow((b*b - 4 * a * c), 0.5)) / (2 * a);
        System.out.println(resuform);
    }
    
}
