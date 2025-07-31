package Practica3;
/*Escribir un método que retorne el mayor de dos números. Usar
ese método para calcular el máximo de una serie de números
ingresados por el usuario (20 números en total). */

//Obtener 2 numeros 
  //obtener el mayor de esos dos 
//calcular el maximo de una serie de numeros

public class Ejercicio_11tp3 {
  public static void main(String[] args) {
     System.out.println("Ingrese un numero");
     int numero1 = Utils.leerInt();
     System.out.println("ingrese otro numero");
     int numero2 = Utils.leerInt();
     
     int numeroAux = obtenerElmayor(numero1,numero2);
      System.out.println("EL numero de series es: " + numeroAux);
     
  }

  private static int obtenerElmayor(int numero1, int numero2) {
      int mayor = numero1;
    
      for(int i = numero2; i >= numero1; i--){
        if(i > mayor){
          mayor = i;
        }

      }
    /*if (numero1 > numero2) {
      System.out.println("El numero: " +numero1+ " es mayor que: " +numero2);
    } else if (numero2 > numero1) {
        System.out.println("El numero: " +numero2+ " es mayor que: " +numero1);
      } else{
        System.out.println("Es igual");
        }*/
        return mayor;
  }
}
