package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("FECHA 1");
		Fecha f1 = new Fecha(1, 4, 2026);
		
		
		System.out.println("Año: " + f1.getAnio());
		System.out.println("Mes: " + f1.getMes());
		System.out.println("Dia: " + f1.getDia());
		
		

		System.out.println("FECHA 2");
		Fecha f2 = new Fecha(2009);
		
		System.out.println("Año: " + f2.getAnio());
		System.out.println("Mes: " + f2.getMes());
		System.out.println("Dia: " + f2.getDia());

		
	}
	

}
