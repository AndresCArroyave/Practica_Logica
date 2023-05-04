/*
 Hacer un algoritmo que lea las tres notas de un estudiante e
imprima su nota definitiva (las notas valen igual porcentaje)
 */
package ejercico.basico3;

import java.util.Scanner;
public class EjercicoBasico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        float n1,n2,n3,n_def;
        System.out.print("Digite nota 1 ");
        n1=objread.nextFloat();
        
        System.out.print("Digite nota 2 ");
        n2=objread.nextFloat();
        
        System.out.print("Digite nota 3 ");
        n3=objread.nextFloat();
        
        n_def= (n1 + n2 + n3)/3;
        System.out.println( "Su nota definitiva es: " + n_def);
    }
    
}
