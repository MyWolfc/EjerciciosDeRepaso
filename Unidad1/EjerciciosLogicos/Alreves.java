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
public class Alreves 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a,c1,c2,c3,c4;
        String C1,C2,C3,C4;
        
        System.out.println("Ingrese el numero ");
        a = sc.nextInt();
        c4= a%10;
        c3= a%100/10;
        c2= a%1000/100;
        c1= a%10000/1000;
        
        C1 = String.valueOf(c1);
        C2 = String.valueOf(c2);
        C3 = String.valueOf(c3);
        C4 = String.valueOf(c4);
        System.out.println("al reves: " + c4+c3+c2+c1);
    }
    
}
