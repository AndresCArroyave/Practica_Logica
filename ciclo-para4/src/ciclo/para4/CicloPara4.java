/*
 En un almacén, cada que se realiza una venta se elabora un registro con el nombre del artículo, 
el precio por unidad y la cantidad de artículos vendidos. Suponiendo que se hicieron 20 ventas, 
elabore un diagrama que imprima por cada venta el nombre del articulo y el valor total de la venta.

Para el mismo enunciado del ejercicio anterior, suponga que si el valor de la venta es mayor de 
50.000.oo se concede un descuento del 10 % sobre el valor de la venta.
 */
package ciclo.para4;

import java.util.Scanner;
public class CicloPara4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner objread=new Scanner(System.in);
      String nom_art = null;
      int precio_uni, cantidad_art;
      float total_venta = 0, desc;
      desc=(float)0.10;
      
        for (int i = 0; i <= 20; i++) {
            System.out.print("Digite nombre del articulo: ");
            nom_art=objread.next();
            System.out.print("Digite precio por unidad: ");
            precio_uni=objread.nextInt();
            System.out.print("Digite cantidad de articulos: ");
            cantidad_art=objread.nextInt();
            
            total_venta = precio_uni * cantidad_art;
            if ( total_venta > 50000)
                total_venta=total_venta-total_venta*desc;
            System.out.println(nom_art + "El total de la venta es: " + total_venta);
        }
        
    }
    }
    

