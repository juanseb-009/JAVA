package com.krakedev;

public class Cuadrado {
	
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public double Area() {
		
		double area = lado * lado;
		
		return area;
		
	}
	public double Perimetro() {
		double perimetro = lado * 4;
		
		return perimetro;
		
	}

}
