/*
 
Hacer un algoritmo que lea el número de horas y el valor de la hora e imprima el salario básico

 */
package practica;

import java.util.Scanner;
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objread= new Scanner(System.in);
        float lado, area;
        System.out.println("lado: ");
        lado=objread.nextFloat();
        
        
        area= lado * lado;
        
        System.out.println("el area es: " + area);
    }
    
}
