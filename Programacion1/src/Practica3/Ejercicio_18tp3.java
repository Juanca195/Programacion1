package Practica3;
/*Escribir un programa que imprima por pantalla los números
perfectos que existen entre 2 y 10000. Un número perfecto es
aquel cuya suma de sus divisores (excepto sí mismo) es igual al
propio número. Ejemplo: 6 es un número perfecto dado que sus
divisores (excepto sí mismo) son 1, 2 y 3 cuya suma da 6. En
cambio 12, no es un número perfecto dado que sus divisores
(excepto sí mismo) 1, 2, 3, 4 y 6 cuya suma es 16. */

//Declarar dos costantes con valos MIN = 2 Y MAX= 10000;
  //imprimir los numeros perfecto


public class Ejercicio_18tp3 {
    public static void main(String[] args) {
        System.out.println("Numeros perfectos entre 2 y 10000");
        for(int numero = 2; numero <= 100; numero++){
            if(esNumeroperfecto(numero)){
                System.out.println(numero);
            }
            // else{
            //     System.out.println("este no es un numero perfecto");
            // }

        }
    }
    private static boolean esNumeroperfecto(int numero) {
        int sumaDivisores = 0; 
        for(int i = 1; i <= numero / 2; i++){
            if(numero % i ==0){
                    sumaDivisores += i;

            }
        }
        return sumaDivisores == numero;
    }
}
