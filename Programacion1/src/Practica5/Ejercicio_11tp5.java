package Practica5;
/* Dado dos arreglos de números enteros A y B determinar si
todos los números almacenados en el arreglo A están presentes
en el arreglo B.
*/

 //Dado 2 arreglos de numeros enteros A y B 
   //determinar si todos los numeros almacenados 
    // en A estan en B
public class Ejercicio_11tp5 {
    final static int MAXA = 10;
    final static int MAXB = 10;
    public static void main (String[]args){
        //definir los dos arreglos 
        int [] arrA = {2,3,4,5,6,7,8,9,10,11}; 
        int [] arrB = {2,3,4,5,6,7,8,9,10,11};

        if(todosPresentes(arrA, arrB)){
            System.out.println("Todos los elementos de A estan en B.");
        }else {
            System.out.println("No todos los elementos del A estan en B.");
        } 
    }
    
    public static boolean todosPresentes(int[] arrA, int[] arrB) {
      for(int i = 0; i < MAXA; i++){
          boolean encontrado = false; 
          for(int j = 0; j < MAXB; j++){
            if(arrA[i]==arrB[j]){
              encontrado = true;
            }
          }
          if(!encontrado){
            return false;
          }
      }
      return true;
    }
}
