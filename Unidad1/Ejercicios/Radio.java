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
public class Radio {
    public static void main(String[] args)
    {
        double radio,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del  circulo");
        radio = sc.nextDouble();
        
        area= Math.PI*Math.pow(radio, 2);
        
        System.out.println("area es: " + area);
    }
    
}
