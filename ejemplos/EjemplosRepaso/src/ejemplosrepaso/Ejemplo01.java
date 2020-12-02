/*
 *  Las entradas son: ciudad Loja, pais Ecuador
    La salida del programa debe ser así:
    
    Loja, ciudad
    del país:
        Ecuador.
 */
package ejemplosrepaso;

import java.util.Scanner;
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        String ciudad;
        String pais;
        System.out.println("Ingrese el nombrede su ciudad");
        ciudad=entrada.nextLine();
        System.out.println("Ingrese el nombrede su pais");
        pais=entrada.nextLine();
        System.out.printf("%s, ciudad \ndel pais:\n\t %s\n", ciudad, pais);
    }
    
}
