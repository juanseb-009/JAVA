package com.krakedev;

public class Cuadrado {
	
	public int lado;
	
	public double Area() {
		
		double area = lado * lado;
		
		return area;
		
	}
	public double Perimetro() {
		double perimetro = lado * 4;
		
		return perimetro;
		
	}

}
