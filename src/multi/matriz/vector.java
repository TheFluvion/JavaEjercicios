/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi.matriz;
import java.util.Scanner;
/**
 * Realizar una multiplicacion de un vector por una matriz
 * dado un vector 1xN y una matriz NxM, el resultado del producto es 1xM
 *
 */
public class vector {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        
        //Tipo[] nombreVector = new Tipo[tamaño];
        int[] vector;
        vector = new int[2];
        //dos pasos anteriores en una linea
        int[] producto = new int[3];
        
        //Tipo[][] nombreMatriz = new Tipo[Filas][Columnas];
        int[][] matriz = {{4,8,6}, {2,1,7}};
        
        //declaracion y creacion de arreglos genericos
        //tipo [][]...[] nombreArreglo = new Tipo[cardinalidad 1][cardinalidad2]... [Cardinalidad n];
        
        System.out.println("Ingrese los valores del vector de tamaño"+vector.length+":");
        
        //int=0 porque los sub indices en java inician con 0
        for (int i=0; i<vector.length; i++){
            System.out.print("v["+i+"]=");
            //acceder al valor i del vector
            vector[i] =leer.nextInt();
        }
        
        //multiplicacion vector por matriz
        int sum;
        //para cada columna de la matriz
        for (int j = 0; j<matriz[0].length; j++){
            sum = 0;
            //recorro el vector y multiplico
            for (int i=0; i<vector.length; i++){
                sum += vector[i] * matriz[i][j];
            
            }
            producto[j] = sum;
        }
        
        
        String aux = "";
        
        //mostrar vector
        System.out.println("*Vector:");
        //bucle for "mejorado" (enhanced)
        //for (tipo elemento : arreglo)
        for(int elemento:vector){
            aux = aux + " " + elemento;
        }
        
        System.out.println(aux);
        
        //mostrar matriz
        System.out.println("\n* Matriz:");
        //para cada fila de la matriz
        for (int[] fila : matriz){
            aux = "";
               //para cada elemento de la fila
               for (int elemento : fila){
                   aux += " " + elemento;
               }
               System.out.println(aux);
        }
        
        //mostrar resultado
        aux = "";
        System.out.println("\n Vector x Matriz:");
        for (int elemento : producto){
            aux += " " + elemento;  
        }
        System.out.println(aux);
        
    }
    
}
