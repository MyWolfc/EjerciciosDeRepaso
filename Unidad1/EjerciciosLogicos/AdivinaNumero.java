/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.EjerciciosLogicos;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Usuario
 */
public class AdivinaNumero 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int owo;
        Random r = new Random();
        owo = (int)(r.nextDouble()*9+1);
        
         
        
        boolean intentos= true;
        do
        {
            System.out.println("Advine el numero ");
            int Z = sc.nextInt();
            if(Z==owo)
            {
                System.out.println("Has acertado");
                intentos = false;
            }
            else if( Z>owo)
            {
                System.out.println("El numero es menor al que escogiste");
               intentos = true;
            }
            else
            {
                System.out.println("El numero es mayor al que escogiste");
                intentos = true;
            }
        }while(intentos);
        
    }
    
}
