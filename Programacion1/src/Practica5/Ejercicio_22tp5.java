package Practica5;
/*Hacer un programa que elimine los valores pares en un arreglo
de tamaño MAX=10. */
 //definir el tamaño de un arreglo
  //definir el arreglo
   //si tiene valores pares
     // eliminar esos valores
public class Ejercicio_22tp5 {
    final static int MAX = 10; 

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        mostrarArreglo(arr);
        System.out.println();
        procesarArreglo(arr);
        System.out.println("Arreglo modificado");
        mostrarArreglo(arr);
    }
    private static void mostrarArreglo(int[] arr) {
        for(int i = 0; i<MAX; i++ ){
            System.out.print("|" + arr[i]);
        }
    }
    public static void procesarArreglo(int [] arr){
        for(int i = 0; i < MAX; i++){
            if(arr[i] % 2==0){
                eliminarPares(arr, i);
                arr[MAX -1]= 0;
            }
        }
    }
    private static void eliminarPares(int[] arr, int pos) {
        for(int i = pos; i< MAX-1; i++ ){
            arr[i]= arr[i+1];
        }
        
    }
}
