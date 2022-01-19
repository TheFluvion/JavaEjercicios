/*

 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
public class JavaApplication2 {

 /*

 */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String A = leer.nextLine();
       String B = A.substring(0,0);
       if (B.equals("a")){
           System.out.println("correcto");
       }
       else {
           System.out.println("incorrecto");
       }
       }
    }