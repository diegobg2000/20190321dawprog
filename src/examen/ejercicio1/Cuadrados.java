package examen.ejercicio1;

public class Cuadrados extends Figura{
	private double lado;
    private double areaCuadrado;
    private  double perimetroCuadrado;

    public void Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    public double getLado() 
    {
        return lado;
    }

    public void setLado(double lado) 
    {
        this.lado = lado;
    }
    public double getperimetroCuadrado() {
		return perimetroCuadrado;
   
    }

    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    public void area() 
    {
        areaCuadrado = lado * lado;
    } 
    public void perimetro() {
    perimetroCuadrado = 4 * lado;
    }
}