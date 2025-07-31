package Practica5;
/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra cargado, solicite al usuario un número entero
y lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada.
 */
   //Definir una constante con el tamaño del arreglo 
    //solicitar al usuario un numero entero
     //Agregar al pricio del arreglo

public class Ejercicio_17tp5 {
    final static int MAX = 10; 

    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10,12,14,16,18,20};

        System.out.println("Ingrese un numero entero");
        int numero = Utils.leerInt();

        agregarNumero(arr, numero);
        mostrarArreglo(arr);
    }
    public static void agregarNumero(int [] arr, int numero){
        for(int pos = MAX-1; pos >0; pos--){
            arr[pos] = arr[pos-1];
        }
        arr[0]= numero;
    }
    public static void mostrarArreglo(int [] arr){
        for(int i = 0; i < MAX; i++){
            System.out.print("|" + arr[i]);
        }
    }
}
