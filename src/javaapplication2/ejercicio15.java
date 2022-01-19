/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

/**
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
public class ejercicio15 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la opcion a ejecutar:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        int eleccion = leer.nextInt();
        
        do{
        switch (eleccion){
            case 1:
                System.out.println("Ingrese los valores a sumar");
                int suma1 = leer.nextInt();
                int suma2 = leer.nextInt();
                int suma = suma1 + suma2;
                System.out.println("El resultado es: " + suma);
                continue;
            
            case 2:
                System.out.println("Ingrese los valores a restar");
                int resta1 = leer.nextInt();
                int resta2 = leer.nextInt();
                int resta = resta1 - resta2;
                System.out.println("El resultado es: " + resta);
                
            case 3:
                System.out.println("Ingrese los valores a multiplicar");
                int mult1 = leer.nextInt();
                int mult2 = leer.nextInt();
                int mult = mult1 - mult2;
                System.out.println("El resultado es: " + mult);
            
            case 4:
                System.out.println("Ingrese los valores a div");
                int div1 = leer.nextInt();
                int div2 = leer.nextInt();
                int div = div1 - div2;
                System.out.println("El resultado es: " + div);
            
            case 5:
                System.out.println("Esta seguro que desea salir? Ingrese s/n para confirmar");
                String salida = leer.nextLine();
                if ("s".equals(salida)){
                   break;
                }
                else {
                    continue;
                }
        }
        }while (eleccion>=1 || eleccion<=5);
    }
}
