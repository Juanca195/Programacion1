package Practica5;
/*Hacer un programa que dado un arreglo de caracteres de tamaño
MAX que se encuentra cargado, invierta el orden del contenido.
 */
    //cargar un arreglo de caracteres un tamaño definido
    //invertir el orden del contenido 
public class Ejercicio_5tp5 {
    final static char MAX = 10;
    public static void main(String[] args) {
        char []caracter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        mostrarArreglo(caracter);
        invertirArreglo(caracter);
        System.out.println("");
        mostrarArreglo(caracter);
    }
    public static void invertirArreglo(char[] caracter) {
        for(int pos = 0 ; pos < MAX/ 2; pos++){
            char aux = caracter[pos];
            caracter[pos] = caracter[MAX - 1 - pos];
            caracter[MAX -1- pos] = aux; 
            
        }
    }
    public static void mostrarArreglo(char[] caracter) {
        for(int pos = 0; pos < MAX; pos++){
            System.out.print("|" +caracter[pos]);
        }
    }
}
