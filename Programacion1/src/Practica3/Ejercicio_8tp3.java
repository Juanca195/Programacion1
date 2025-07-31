package Practica3;
/*Realizar un programa que dado dos números enteros y un
carácter (todos ingresados por el usuario) muestre por pantalla el
resultado de una operación matemática básica según el valor del
carácter ingresado. Si se ingresó el carácter ‘a’ debe realizar la
suma, para ‘b’ la resta, para ‘c’ la multiplicación y para ‘d’ la
división entre ambos números */

//Obtener 2 numeros enteros y un caracter 
// si el caracter es a, b ,c y d 
// realizar una de las operacones basicas.
  // Para 'a' = suma 
  // Para 'b' = resta
  // Para 'c' = multiplicacion
  // para 'd' = division

public class Ejercicio_8tp3 {
    public static void main(String[] args) {
        int numero1 = obtenerNumero();
        int numero2 = obtenerNumero();
        
        System.out.println("Ingrese un caracter");
        char caracter = Utils.leerChar();

        while(caracter >= 'a' && caracter <= 'd'){
            operacionesBasicas(numero1, numero2, caracter);
            System.out.println("Ingrese un caracter");
            caracter = Utils.leerChar();
        }
    }

    private static void operacionesBasicas(int numero1, int numero2, char caracter) {
        if(caracter == 'a'){
            System.out.println("La suma entre los dos numeros es: " + (numero1+numero2));
            }else if(caracter == 'b'){
                System.out.println("La resta entre los dos numeros es: " + (numero1-numero2));
            }   else if(caracter == 'c'){
                     System.out.println("La multiplicacion entre los dos numeros es: " + (numero1*numero2));
                }
                else{
                    System.out.println("La division entre los dos numeros es: " + (numero1/numero2));
                }
    }

    public static int obtenerNumero() {
       int numero = 0;
       System.err.println("Ingrese un numero entero");
       numero = Utils.leerInt();

       return numero;
    }
}
