package com.krakedev.taller;

public class TestRestaurant {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Restaurante t;
		t = new Restaurante("Sebastian's", "Ambato", 8);
		
		System.out.println("Restaurante 1 : Valores Asignados");
		
		
		System.out.println("Nombre:" + t.getNombre());
		System.out.println("Direccion:" + t.getDireccion());
		System.out.println("Calificacion:" + t.getCalificacion());
		

		

		System.out.println("Restaurante 2: Valores Asignados");
		
		Restaurante t2 = new Restaurante("Sol's Restaurant", "Quito", 10); 
		
		System.out.println("nombre:" + t2.getNombre());
		System.out.println("direccion:" + t2.getDireccion());
		System.out.println("calificacion:" + t2.getCalificacion());
		
		
		System.out.println("Restaurante 3: Valores Asignados");
		
		Restaurante t3 = new Restaurante("Giorginno's Pizza"); 
		
		System.out.println("nombre:" + t3.getNombre());
		System.out.println("direccion:" + t3.getDireccion());
		System.out.println("calificacion:" + t3.getCalificacion());
		
		
		
		

	}

}
