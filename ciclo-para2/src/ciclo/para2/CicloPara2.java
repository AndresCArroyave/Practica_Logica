/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclo.para2;

import java.util.Scanner;
public class CicloPara2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner objread=new Scanner(System.in);
       float valor_hora, total_dedu, total_boni, bruto, neto;
       int num_hora;
       String nom;
           
        for (int i = 0; i <= 10; i++) {
             System.out.print("Digite nombre: ");
            nom=objread.next();
            System.out.print("Digite valor hora: ");
            valor_hora=objread.nextFloat();
            System.out.print("Digite numero de horas: ");
            num_hora=objread.nextInt();
            System.out.print("Digite deducciones: ");
            total_dedu=objread.nextFloat();
            System.out.print("Digite bonificaciones: ");
            total_boni=objread.nextFloat();
            
            bruto= valor_hora * num_hora;
            System.out.print("El salario bruto de: " + nom + " es " + bruto);
            neto= bruto + total_boni - total_dedu;
            System.out.println("El salario neto de: " + nom + " es " + neto);
    }
    
    }
}
