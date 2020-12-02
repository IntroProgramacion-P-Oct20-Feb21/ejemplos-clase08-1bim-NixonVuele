/*
 *  Las entradas son: ciudad Loja, pais Ecuador
    La salida del programa debe ser así:
    
    Loja, situada en el sur del país:
    
        ECUADOR.
 */
package ejemplosrepaso;

import java.util.Scanner;


public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        String ciudad;
        String pais;
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad=entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais =entrada.nextLine();
        System.out.printf("Las entradas son: "
                + "ciudad %s, pais %s\nLa salida del programa debe ser asi:\n"
                + "%s,situada en el sur del pais"
                + "\n\n\t%s\n", ciudad, pais,ciudad, pais=pais.toUpperCase());
    }
    
}
