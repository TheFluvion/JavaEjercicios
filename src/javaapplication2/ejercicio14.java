/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
 */
public class ejercicio14 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor maximo positivo");
        int valorp = leer.nextInt();
        int total = 0;
        do{
            System.out.println("Ingrese el valor a sumar:");
            int suma = leer.nextInt();
            total = total + suma;
            
            
        }while(total<valorp);
        
        
    }
    
}
