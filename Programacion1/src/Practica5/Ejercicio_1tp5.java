package Practica5;
/*
Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado.
 */
  //Cargar el arregloo
  //pedirlo al usuario
  //mostrar el arreglo
public class Ejercicio_1tp5 {
    final static int MAX = 15;
    public static void main(String[] args) {
        int[]arreglo = new int[MAX];
        cargarArreglo(arreglo);
        mostrarArreglo(arreglo);
        
    }
    public static void mostrarArreglo(int[] arreglo) {
       for(int pos = 0; pos<MAX ; pos++){
        System.out.print("|" + arreglo[pos]);
       }
    }
    public static void cargarArreglo(int [] arreglo) {
        for(int pos = 0; pos< MAX; pos++){
            System.out.println("Ingrese un numero entre 1 y 12");
            arreglo[pos]= Utils.leerInt();
        }
       
    }
}
