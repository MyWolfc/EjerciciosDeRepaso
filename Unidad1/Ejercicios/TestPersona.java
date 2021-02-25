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
public class TestPersona 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre: ");
        String nom = sc.next();
        System.out.println("Ingrese la edad: ");
        int e = sc.nextInt();
        System.out.println("Ingrese el sexo: ");
        char s = sc.next().charAt(0);
        System.out.println("Ingrese el peso: ");
        double p = sc.nextDouble();
        System.out.println("Ingrese la altura: ");
        double a = sc.nextDouble();
        
        Persona p1 = new Persona(nom,e,s);
        p1.setaltura(a);
        p1.setpeso(p);
        Persona p2 = new Persona(nom,e,s);
        p2.setaltura(1.90);
        p2.setpeso(56.2);
        Persona p3 = new Persona();
        p3.setaltura(1.80);
        p3.setpeso(70.3);
        
        System.out.println(p1 + p1.esMayorDeEdad() + p1.calculaIMC() );
        System.out.println(p2 + p2.esMayorDeEdad() + p2.calculaIMC() );
        System.out.println(p3 + p3.esMayorDeEdad() + p3.calculaIMC() );
        
    }
}
