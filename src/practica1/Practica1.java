/*
 Hacer un algoritmo que lea el número de horas y el valor de la hora e imprima el salario básico
 */
package practica1;

import java.util.Scanner;

public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        int num_horas, valor_hora, salario;
        System.out.print("Digite numero de horas: ");
        num_horas=objread.nextInt();
        System.out.print("Digite valor de hora: ");
        valor_hora=objread.nextInt();
        
        salario= num_horas * valor_hora;
        System.out.println("El salario basico es: " + salario);
        
        
    }   
    
}
