package Practica5;
/*Hacer un programa que dado el arreglo definido y precargado,
y un número entero ingresado por el usuario, copie de forma
continua las secuencias de tamaño igual al número ingresado en
otro arreglo de iguales características e inicializado con 0. La
copia en este último arreglo deben comenzar desde el principio
del mismo.
 */  
    //Definir y cargar un arreglo 
      //pedir un numero entero 
       //verificar si el tamaño de la secuencia es igual a numero 
         // tamaño == numero
           //copiar las secuencias en otro arreglo de iguales caracteristicas inicializada con ceros
            //copiar desde el pricipio
   
public class Ejercicio_33tp5 {
    //definir el tamaño del arreglo 
    final static int MAX = 20;

    public static void main(String[] args) {
         // Arreglo precargado con tamaño MAX
        int[] arregloOriginal = {0,1,2,3,4,0,0,0,5,6,10,0,0,7,8,9,0,0,0,0};
        
        // Arreglo destino inicializado con ceros
        int[] arregloDestino = new int[MAX];

        procesarArrglo(arregloOriginal,arregloDestino);
    }
    public static void procesarArrglo(int [] arregloOriginal, int [] arregloDestino){

        
    }

}
