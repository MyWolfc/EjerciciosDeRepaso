/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.Ejercicios;
import java.util.Random;
/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private int edad;
    private String RFC;
    private char sexo;
    private double peso;
    private double altura;
    
    public void setpeso(double p)
    {
        peso = p;
    }
    public void setaltura(double a)
    {
        altura = a;
    }
    
    public Persona()
    {
        nombre = "";
        edad = 0;
        RFC = "";
        sexo = ' ';
        peso = 0.0;
        altura = 0.0;
    }
    public Persona(String Nombre,int Edad,char Sexo)
    {
        nombre = Nombre;
        edad = Edad;
        RFC = "";
        sexo = Sexo;
        peso = 0.0;
        altura = 0.0;
        
    }
    public Persona(String Nombre,int Edad,String rfc,char Sexo,double Peso,double Altura)
    {
        nombre = Nombre;
        edad = Edad;
        RFC = rfc;
        sexo = Sexo;
        peso = Peso;
        altura = Altura;
    }
    public String calculaIMC()
    {
        double imc = (peso/(Math.pow(peso, 2)));
        if(imc<20)
        {
            return("Esta por debajo de su peso ideal");
        }
        else if(imc>= 20 && imc <=25)
        {
            return("Esta en su peso ideal");
        }
        else
        {
            return("Esta sobre su peso idea (Sobrepeso)");
        }
      
    }
    public String esMayorDeEdad()
    {
        if(edad<18)
        {
            return("No es mayor edad");
        }
        else
        {
            return ("Es mayor edad");
        }
    }
    public char comprobarSexo(char s)
    {
        if(s=='H'|| s== 'h'|| s=='M' || s == 'm')
        {
            return(s);
        }
        else
        {
            return('H');
        }
    }
    
    public String toString()
    {
        String s = "Nombre: " + nombre + "\nedad:" + edad + "\nRFC: " + GenerarRFC() + "\nsexo: " + sexo + "\nPeso: " + peso + "\naltura: " + altura;
        return s; 
    }
    
    public String GenerarRFC()
    {
        String []  ll = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Random r = new Random();
        String lol,XD = "",pow = "";
        int owo;
        
        for(int i=0;i<4;i++)
        {
            owo = r.nextInt();
            XD = XD +ll[owo];
        }
        
        for(int j=0;j<6;j++)
        {
            pow = pow + r.nextInt();
        }
        lol = XD + pow;
        return(lol);
    }
    
    
    
    
}
