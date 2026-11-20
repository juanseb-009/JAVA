package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo r1 = new Rectangulo();
		
		r1.altura = 5;
		r1.base = 4;
		
		int resultadoArea;
		
	
		resultadoArea = r1.calcularArea();
		System.out.println("Resultado:  " + resultadoArea);

		
		
		Rectangulo r2 = new Rectangulo();
		
		r2.base = 8;
		r2.altura = 5;
		
		int resultadoArea2;
		
		resultadoArea2 = r2.calcularArea();
		System.out.println("Resultado Area 2: " + resultadoArea2);
		
		Rectangulo p1 = new Rectangulo();
		
		p1.altura = 2;
		p1.base = 4;
		
		double resultadoPerimetro;
		
		resultadoPerimetro = p1.calcularPerimetro();
		System.out.println("Resultado perimetro: " + resultadoPerimetro);
		
	}

}
