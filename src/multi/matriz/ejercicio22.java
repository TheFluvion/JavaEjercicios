/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi.matriz;
import java.util.Arrays;

//import java.util.Collections; //para ordenar vector de forma descendente
/**
 *
 * @author Gaston
 */
public class ejercicio22 {
    public static void main(String[]args){
        int [] vector = new int [5];
        for (int i=0; i<=100; i++){
            vector[i] = (int) (Math.random()*100);
            System.out.print(vector[i]+" ");
        
        
        }
        //Arrays.sort(vector); [para ordenarlo de forma ascendente
        //Arrays.sort(vector, Collections.reverseOrder()); [para ordenar de forma descendente
        Arrays.sort(vector);
        for (int n:vector){
            System.out.println(n);}
    }
    
}
