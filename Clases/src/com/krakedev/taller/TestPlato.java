package com.krakedev.taller;

public class TestPlato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plato pA;
		pA = new Plato("Sanwich Ingles", "Desayuno", 5, false);
		System.out.println("Plato 1 : Valores Asignados");
		
		
		System.out.println("Nombre: " + pA.getNombre());
		System.out.println("Tipo: " + pA.getTipo());
		System.out.println("Precio: " + pA.getPrecio());
		System.out.println("Disponible " + pA.isDisponible());
		
		
		
		Plato pB;
		pB = new Plato("Filete con papas", "Almuerzo", 10, true);
		System.out.println("Plato 2 : Valores Asignados");
		
		
		System.out.println("Nombre: " + pB.getNombre());
		System.out.println("Tipo: " + pB.getTipo());
		System.out.println("Precio: " + pB.getPrecio());
		System.out.println("Disponible: " + pB.isDisponible());
		
		
		
		
		Plato pC;
		pC = new Plato("Empanada con cafe", "Cena", 6, true);
		System.out.println("Plato 3 : Valores Asignados");
		
		
		System.out.println("Nombre: " + pC.getNombre());
		System.out.println("Tipo: " + pC.getTipo());
		System.out.println("Precio: " + pC.getPrecio());
		System.out.println("Disponible: " + pC.isDisponible());
		
		
		Plato p4;
		System.out.println("Vehiculo 4 : Valores asignados");
		p4 = new Plato("Hamburguesa de pollo");
		
		System.out.println("Nombre: " + p4.getNombre());
		System.out.println("Tipo: " + p4.getTipo());
		System.out.println("Precio: " + p4.getPrecio());
		System.out.println("Disponible: " + p4.isDisponible());
		
		

	}

}
