/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclo.para3;

import java.util.Scanner;
public class CicloPara3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner objread=new Scanner(System.in);
        int edad;
        String nom;
        
        for (int i = 0; i <= 15; i++) {
            System.out.print("Digite su nombre: ");
            nom=objread.next();
            System.out.print("Digite su edad: ");
            edad=objread.nextInt();
            
            if(edad >= 18)
                System.out.print(nom + "Es mayor de edad " + edad);
            else
                System.out.println(nom + "No es mayor de edad " + edad);
        }
    }
    
}
