/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.Ejercicios;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Cuadractica 
{
    public static void main(String []  args)
    {
     double a,b,c;   
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("capture el coeficinte a:");
     a = scanner.nextDouble();
     System.out.println("capture el coeficinte b:");
     b = scanner.nextDouble();
     System.out.println("capture el coeficinte c:");
     c= scanner.nextDouble();
     
     double determinante = (b*b)-(4*a*c);
     
     if (determinante>=0)
     {
                 double x1 = (-b + Math.sqrt(determinante)/2*a);
                 double x2 = (-b - Math.sqrt(determinante)/2*a);
                 System.out.println("solucion x1: "+ x1);
                 System.out.println("solucion x1: "+x2);
     }
     else
     {
         System.out.println("no existe soluciones reales para el problema");
     }

    }
}
