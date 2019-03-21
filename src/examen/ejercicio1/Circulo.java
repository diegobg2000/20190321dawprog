package examen.ejercicio1;

public class Circulo extends Figura{
	 private double radio;
	    private double areaCirculo;
	    private double perimetroCirculo;
	  
	    public Circulo(double radio) 
	    {
	        this.radio = radio;
	    }

	    public double getRadio() 
	    {
	        return radio;
	    }

	    public void setRadio(double radio) 
	    {
	        this.radio = radio;
	    }
	    public double getPerimetroCirculo() {
	    	return perimetroCirculo;
	    }
	    public double getAreaCirculo() 
	    {
	        return areaCirculo;
	        
	    }
	    public void perimetro() {
	    	perimetroCirculo = 2 * 3.1415; 
	    }

	    public void area(){
	        areaCirculo = 3.1415 * radio * radio;
	    }    
	}

