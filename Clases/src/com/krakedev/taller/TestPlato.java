package com.krakedev.taller;

public class TestPlato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plato pA;
		pA = new Plato();
		System.out.println("Plato 1 : Creado");
		
		
		System.out.println("Nombre:" + pA.nombre);
		System.out.println("Tipo:" + pA.tipo);
		System.out.println("Precio:" + pA.precio);
		System.out.println("Disponible" + pA.disponible);
		
		System.out.println("Plato 1 : Valores asignados");

		pA.nombre = "Sandwich Ingles";
		pA.tipo = "Desayuno";
		pA.precio = 5;
		pA.disponible = false;
		
		System.out.println("Nombre: " + pA.nombre);
		System.out.println("Tipo: " + pA.tipo);
		System.out.println("Precio: " + pA.precio);
		System.out.println("Disponible: " + pA.disponible);
		
		
		
		Plato pB;
		pB = new Plato();
		System.out.println("Plato 2 : Creado");
		
		
		System.out.println("Nombre:" + pB.nombre);
		System.out.println("Tipo:" + pB.tipo);
		System.out.println("Precio:" + pB.precio);
		System.out.println("Disponible" + pB.disponible);
		
		System.out.println("Plato 2 : Valores asignados");

		pB.nombre = "Filete de carne con papas fritas";
		pB.tipo = "Almuerzo";
		pB.precio = 10;
		pB.disponible = true;
		
		System.out.println("Nombre: " + pB.nombre);
		System.out.println("Tipo: " + pB.tipo);
		System.out.println("Precio: " + pB.precio);
		System.out.println("Disponible: " + pB.disponible);
		
		
		
		Plato pC;
		pC = new Plato();
		System.out.println("Plato 3 : Creado");
		
		
		System.out.println("Nombre:" + pC.nombre);
		System.out.println("Tipo:" + pC.tipo);
		System.out.println("Precio:" + pC.precio);
		System.out.println("Disponible" + pC.disponible);
		
		System.out.println("Plato 3 : Valores asignados");

		pC.nombre = "Empanada de viento con cafe";
		pC.tipo = "Cena";
		pC.precio = 6;
		pC.disponible = true;
		
		System.out.println("Nombre: " + pC.nombre);
		System.out.println("Tipo: " + pC.tipo);
		System.out.println("Precio: " + pC.precio);
		System.out.println("Disponible: " + pC.disponible);
		
		
		

	}

}
