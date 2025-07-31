package Practica5;
/*Hacer un programa que inserte un elemento en un arreglo
(ordenado decrecientemente) de tamaño MAX=10.
 */
  // Preguntar si podria ser asi 
public class Ejercicio_21tp5 {
    final static int MAX = 10;

    public static void main(String[] args) {
        int [] arr = {10,9,8,7,6,5,4,3,2,1};
        int numero = obtenerNumero();
        int pos = obtenerPos(arr,numero);

        insertaElemento(arr, numero, pos);
        arr[pos] = numero;
        mostrarArreglo(arr);
    }
    public  static int obtenerPos(int[] enteros, int numero) {
        System.out.println("ingrese una posicion");
        int posicion = Utils.leerInt();
        return posicion;
    }
    public static int obtenerNumero() {
        System.out.println("Ingrese un numero entero");
        int numero = Utils.leerInt();

        return numero;
    }
    public static void insertaElemento(int[] arrEnteros, int numero, int pos) {
        for(int i = MAX-1; i>pos; i--){
            arrEnteros[i] = arrEnteros[i-1];
        }
        //arrEnteros[pos] = numero;
    }
    private static void mostrarArreglo(int[] arrEnteros) {
        for(int i = 0; i < MAX; i++){
            System.out.print("|"  + arrEnteros[i]);
        }
    }

}
