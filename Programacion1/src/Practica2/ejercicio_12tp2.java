package Practica2;
/*Escribir un programa que mientras el usuario ingrese un
carácter letra minúscula, se quede con la menor y la mayor letra
ingresada. Finalmente muestre por pantalla dichas letras.
 */

public class ejercicio_12tp2 {
    public static void main(String[]args){
		char caracter = ' ';
		char caracter_menor = 'z';
		char caracter_mayor = 'a';
		System.out.println("Ingrese un caracter letra minúscula: ");
        caracter = Utils.leerChar();
		System.out.println("Ingrese otro caracter para salir");

		while(caracter >= 'a' && caracter <= 'z') {
			if(caracter > caracter_mayor) {
				caracter_mayor = caracter;
			} else if(caracter < caracter_menor) {
				caracter_menor = caracter;
			}
			System.out.println("Ingrese un caracter letra minúscula: ");
			System.out.println("Ingrese otro caracter para salir");
			caracter = Utils.leerChar();
		}
		System.out.println("El caracter menor ingresado es: "+caracter_menor);
		System.out.println("El caracter mayor ingresado es: "+caracter_mayor);

    }
}
