/*
 * Escribir un programa que repita un número determinado de veces la obtención
 * de N números aleatorios comprendidos en un rango elegido entre cuatro 
 * opciones.
 */
package miriadax;

/**
 *
 * @author Oscar Fernandez
 */

import java.util.Random;
public class ejercicio_01_random {
          public static void main(String[] args){
          random aleatorio = new Random();
          int num =aleatorio.nextInt(20)+1;
          System.out.println("Mostrando " + num + " numeros aleatorios entre 18 y 65");
          int i = 0;
          for (i = 1; i <= num; i++){
             int resultado= aleatorio.nextInt(65-18+1)+18;
             System.out.println("Resultado " + i + " de " + num + " : " + resultado);
          }           
     }
}
