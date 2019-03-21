package examen.ejercicio1;

public class Triangulo {
	    private double base;
	    private double altura;
	    private double areaTriangulo;
	    private double perimetroTriangulo;
	    

	    public Triangulo(double base, double altura) 
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
	    public double getperimetroTriangulo() {
	    	return perimetroTriangulo;
	    }

	    public double getareaTriangulo() 
	    {
	        return areaTriangulo;
	    }
	    public void perimetro() {
	    	double h;
	    	 h = (double) Math.sqrt((base/2)*(base/2) + (altura * altura));
	    	perimetroTriangulo =  h*2 + base; 
	    }

	    public void area(){
	        areaTriangulo = base * altura / 2;
	    }    
	    
	}
	
