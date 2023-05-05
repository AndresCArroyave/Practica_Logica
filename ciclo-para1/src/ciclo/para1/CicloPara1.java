/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclo.para1;

import java.util.Scanner; 
public class CicloPara1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
       int serie=4;
        System.out.print("Terminos de la serie: ");
        for (int i = 1; i <= 15; i++) {
            System.out.print(serie + " ");
            serie=serie + 4;
        }
    }
    
}
