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
public class Circunferencia 
{
    public static void main(String [] args)
    {
        double per,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        r = sc.nextDouble();
        
        per = Math.PI*r*2;
        System.out.println("El perimetro es: " + per);
    }
    
}
