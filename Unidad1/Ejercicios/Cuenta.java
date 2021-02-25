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
public class Cuenta 
{
    private String titular;
    
    private double cantidad;
    
    public Cuenta(String t)
    {
        this.titular = t;
    }
    
    public Cuenta(String t, double can)
    {
        this.titular = t;
        this.cantidad = can;
    }
    
    public void settitular(String t)
    {
        this.titular = t;
    }
    public void setcantidad(double c)
    {
        this.cantidad = c;
    }
    public String gettitular()
    {
        return titular;
    }
    public double getcantidad()
    {
        return cantidad;
    }
    
    public String toString()
    {
        return ("Titular: "+titular +"\nCantidad: " +cantidad );
    }
    
    public void ingresar(double x)
    {
        if(cantidad<0)
        {
            return;
        }
        else
        {
            setcantidad(x);
            return;
        }
    }
    public void retirar(double a)
    {
        if(a>cantidad)
        {
            cantidad = 0;
            return;
        }
        else
        {
            double s = cantidad-a;
            setcantidad(s);
            return;
        }
    }
}
