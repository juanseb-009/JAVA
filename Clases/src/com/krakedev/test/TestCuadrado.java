package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado();
		
		c1.setLado(4);
		
		double resultadoArea;
		
	
		resultadoArea = c1.Area();
		System.out.println("Resultado Area 1:  " + resultadoArea);
		
		double resultadoPerimetro;
		
		resultadoPerimetro = c1.Perimetro();
		System.out.println("Resultado Perimetro 1: " + resultadoPerimetro);
		
		//////////////////////////////////////////////////////////////////////
		Cuadrado c2 = new Cuadrado();
		
		c2.setLado(3);
		
		double resultadoArea2;
		
		
		resultadoArea2 = c2.Area();
		System.out.println("Resultado Area 2:  " + resultadoArea2);
		
		double resultadoPerimetro2;
		
		resultadoPerimetro2 = c2.Perimetro();
		System.out.println("Resultado Perimetro 2: " + resultadoPerimetro2);
		
		
//////////////////////////////////////////////////////////////////////
		Cuadrado c3 = new Cuadrado();
		
		c3.setLado(0); 
		
		double resultadoArea3;
		
		
		resultadoArea3 = c3.Area();
		System.out.println("Resultado Area 3:  " + resultadoArea3);
		
		double resultadoPerimetro3;
		
		resultadoPerimetro3 = c3.Perimetro();
		System.out.println("Resultado Perimetro 3: " + resultadoPerimetro3);


		
		
		

	}

}
