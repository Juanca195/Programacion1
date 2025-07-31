package Practica5;
/*Implementar un método que realice un corrimiento a izquierda
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición.
 */
    // Definir el tamaño MAX 
    //Cargarle valores 
     //buscar una posicion
     // realizar el corrimeineto
public class Ejercicio_16tp5 {
    final static int MAX = 10;

    public static void main(String[] args) {
        int[] arrEnteros = {1,2,3,4,5,6,7,8,9,10};
       
        System.out.println("ingrese un posicion");
        int pos = Utils.leerInt();

        correrIzquierda(arrEnteros, pos);
        mostrarArreglo(arrEnteros);

    }
    private static void mostrarArreglo(int[] arrEnteros) {
        for(int i = 0; i < MAX; i++){
            System.out.print("|"  + arrEnteros[i]);
        }
    }
    public static void correrIzquierda(int [] arrEnteros, int pos){
        for(int i = pos; i <MAX-1; i++ ){
            arrEnteros[i]= arrEnteros[i+1];
        }
         //arrEnteros[pos]= 4;
        
    }

}
