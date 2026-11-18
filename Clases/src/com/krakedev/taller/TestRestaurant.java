package com.krakedev.taller;

import com.krakedev.Vehiculo;

public class TestRestaurant {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Restaurante t;
		t = new Restaurante();
		
		System.out.println("Restaurante 1 : Creado");
		
		
		System.out.println("Nombre:" + t.nombre);
		System.out.println("Direccion:" + t.direccion);
		System.out.println("Calificacion:" + t.calificacion);
		
		System.out.println("Restaurante 1 : Valores asignados");

		t.nombre = "Sebastian's";
		t.direccion = "Ambato";
		t.calificacion = 8;

		System.out.println("Nombre:" + t.nombre);
		System.out.println("Direccion:" + t.direccion);
		System.out.println("Calificacion:" + t.calificacion);
		

		System.out.println("Restaurante 2: Creado");
		
		Restaurante t2 = new Restaurante(); 
		
		System.out.println("nombre:" + t2.nombre);
		System.out.println("direccion:" + t2.direccion);
		System.out.println("calificacion:" + t2.calificacion);
		
		System.out.println("Restaurante 2 : Valores asignados");

		t2.nombre = "Sol´s Restaurant";
		t2.direccion = "Quito";
		t2.calificacion = 10;

		System.out.println("Nombre:" + t2.nombre);
		System.out.println("Direccion:" + t2.direccion);
		System.out.println("Calificacion:" + t2.calificacion);
		
		

	}

}
