/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.EjerciciosLogicos;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ordenar3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        
        System.out.println("Ingrese el primer num.");
        a = sc.nextInt();
        System.out.println("Ingrese el primer num.");
        b = sc.nextInt();
        System.out.println("Ingrese el primer num.");
        c = sc.nextInt();
        
        if(a>b && a>c)
        {
            System.out.println("El mayor numero es " +a);
        }
        if(b>a && b>c)
        {
            System.out.println("El mayor numero es " +b);
        }
        else
        {
            System.out.println("El mayor numero es " +c);
        }
    }
    
}
