package Practica3;
    /* Escribir un programa que mientras que el usuario ingrese un
    número entero natural, llame a un método que calcule la
    sumatoria desde 1 a dicho número (Ej: si n= 5 sumatoria =
    1+2+3+4+5=15) y retorne el resultado.
*/

//Obtener numero entero natural
  // si numero > 0 
   //calcular sumatoria 
    // retornar resultado 
public class Ejercicio_15tp3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero natural");
        int numero = Utils.leerInt();

        while(numero > 0){
            int sumatoria = CalcularSumatoria(numero);
            System.out.println("LA suma es: " +sumatoria);
            System.out.println("ingrese un numero entero natural");
            numero = Utils.leerInt();
            
        }
    }

    private static int CalcularSumatoria(int numero) {
        int suma = 0;
        for(int i = 1; i <= numero; i++){
            System.out.println(i);
            suma += i;
        }
        return suma;
    }
}
