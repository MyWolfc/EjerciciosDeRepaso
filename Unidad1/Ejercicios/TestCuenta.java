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
public class TestCuenta {
    public static void main(String [] args)
    {
        Cuenta c1 = new Cuenta("Pedro",300);
        Cuenta c2 = new Cuenta("Juan",300);
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad que desea meter a la cuenta 1");
        double i1 = s.nextDouble();
        c1.ingresar(i1);
        
        System.out.println("Ingrese la cantidad que desea meter a la cuenta 2");
        double i2 = s.nextDouble();
        c1.ingresar(i2);
        
        System.out.println("Ingrese la cantidad que desea retirar a la cuenta 1");
        double r1 = s.nextDouble();
        c1.retirar(r1);
        
        System.out.println("Ingrese la cantidad que desea retirar a la cuenta 2");
        double r2 = s.nextDouble();
        c1.ingresar(r2);
        
        System.out.println("------------------");
        System.out.println(c1);
        System.out.println(c2);
        
        
    }
    
}
