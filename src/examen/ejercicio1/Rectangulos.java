package examen.ejercicio1;

public class Rectangulos extends Figura {
	    private double base;
	    private double altura;
	    private double areaRectangulo;
	    private double perimetroRectangulo;

	    public void Rectangulo(double base, double altura) 
	    {
	        this.base = base;
	        this.altura = altura;
	    }
	    
	    public double getBase() 
	    {
	        return base;
	    }

	    public void setBase(double base)
	    {
	        this.base = base;
	    }

	    public double getAltura() 
	    {
	        return altura;
	    }

	    public void setAltura(double altura) 
	    {
	        this.altura = altura;
	    }
	    public double getPerimetroRectangulo(){
	    	return perimetroRectangulo;
	    }
	    public double getAreaRectangulo() 
	    {
	        return areaRectangulo;
	    }
	    public void perimetro() {
	    	perimetroRectangulo = (base + altura) *2;
	    }
	    public void area()
	    {
	        areaRectangulo = base * altura;
	    }
	}
