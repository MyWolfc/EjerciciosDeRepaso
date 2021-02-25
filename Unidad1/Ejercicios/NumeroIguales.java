/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.Ejercicios;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class NumeroIguales {
    public static void main(String[] args)
    {
        double x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        x = sc.nextDouble();
        System.out.println("ingrese el segundo numero");
        y = sc.nextDouble();
        
        if(x==y)
        {
            System.out.println("los numeros son iguales");
       
        }
        else
        {
            System.out.println("los numeros NO son igulaes");
       
        }
    }
            
}
