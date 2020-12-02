/*
    El siguiente programa muestra de forma infinita la frase:
    Usted está en el ciclo

    Modificar el código para que el usuario decida si quiere seguir en el ciclo
    El usuario podrá salir con las siguiente opciones:
    SI
    Si
    SI
    si
    sI
    S
    s
 */
package ejemplosrepaso;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String salida2="";
        String salida1="si";
        String salida3="s";
        while (bandera) { 
            System.out.println("Usted está en el ciclo");
            System.out.printf("Desea salir del ciclo escriba: SI\n"
                    + "Si\nSI\nsi"
                    + "\nsI\nS "
                    + "\ns\n>");
            salida2=  entrada.nextLine();
            salida2= salida2.toUpperCase();
            salida2= salida2.toLowerCase();
            if ((salida2 == salida1)||(salida2 == salida3)){
                bandera=false;
            }
        }
    }
}
