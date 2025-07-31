package Practica2;
/*Pedir por consola el ingreso de números enteros. Cuando se
ingrese un 0 se debe terminar el programa informando el
promedio de los números ingresados, cuál fue el mayor número y
cuál fue el menor número.
 */

public class ejercicio_15tp2 {
    public static void main(String[] args) {
		System.out.println("Ingrese un número entero: ");
		System.out.println("Ingrese el número 0 para salir");
		int numero = Utils.leerInt();
		int cant_numeros_ingresados = 0;
		int suma = 0;
		double promedio = 0;
		int menor_numero = Integer.MAX_VALUE;
		int mayor_numero = Integer.MIN_VALUE;
		
		while(numero != 0) {
			cant_numeros_ingresados ++;
			promedio = (suma += numero) / cant_numeros_ingresados;
			
			if(numero > mayor_numero) {
				mayor_numero = numero;
			}
			
			if(numero < menor_numero) {
				menor_numero = numero;
			}
			
			System.out.println("Ingrese un número entero: ");
			System.out.println("Ingrese el número 0 para salir");
			numero = Utils.leerInt();
		}
		System.out.println("El promedio de todos los números ingresados es: "+promedio);
		System.out.println("El menor número encontrado es: "+menor_numero);
		System.out.println("El mayor número encontrado es: "+mayor_numero);

	}

}
