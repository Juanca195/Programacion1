package Practica3;
/*Escribir un programa que mientras el usuario ingrese un
número entero entre 1 y 10 realice:
a. Si el numero ingresado es múltiplo de 3 pida ingresar un
caracter y para el caracter ingresado imprima a qué tipo de
carácter está asociado:
i. “letra minúscula” si el carácter es una letra del
abecedario en minúscula;
ii. “letra mayúscula” si el carácter es una letra del
abecedario en mayúscula;
iii. “dígito” si el carácter corresponde a un número;
iv. “otro” para los restantes casos de caracteres.
b. Si el número ingresado es múltiplo de 5 imprima la tabla de
multiplicar del número ingresado.
 */

 //Obtener un numero entero entre 1 y 10 
   // Si el numero es multiplo de 3
     // Obtener un caracter
        // si caracter es letra minuscula
        // si caracter es letra mayucula
        // si caracter es digito
        // sino otro tipo 
     // Si el numero ingresado es multiplo de 5 
        //imprimir la tabla de multiplicar del numero ingresado

public class Ejercicio_10tp3 {
    final static char Minminuscula = 'a', Maxminuscula = 'z', minMayuscula = 'A', maxMayuscula = 'Z', digitoMin = '0', digitoMax = '9';

    public static void main(String[] args) {

        System.out.println("Ingrese un numero entero entre 1 y 10");
        int numero = Utils.leerInt();
       while (numero >= 1 && numero <=10) {
            if(numero % 3 == 0){
                System.out.println("Ingrese un caracter");
                char caracter = Utils.leerChar();
                verificarTipoDecaracter(caracter);
            }
            if (numero % 5 == 0) {
                tablaDemultiplicar(numero);
            }
            System.out.println("Ingrese un numero entero entre 1 y 10");
            numero = Utils.leerInt();
       }

    }

    public static void tablaDemultiplicar(int numero) {
        for(int i = 1; i <= 10; i++){
            System.out.println("La tabla de: " +numero+ "es: " + (numero*i));
        }
    }

    public static void verificarTipoDecaracter(char caracter) {
       if(caracter >=Minminuscula && caracter <= Maxminuscula){
        System.out.println("Es letra del abecedario en minuscula");
         }else if(caracter >=minMayuscula && caracter <=maxMayuscula){
            System.out.println("Es letra del abecedario en Mayuscula");
            }else if(caracter >=digitoMin && caracter <=digitoMax){
                System.out.println("Es digito");
                }else {
                    System.out.println("Otro");
                }
    }
}
