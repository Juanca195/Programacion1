package Practica5;
/*Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola.
 */
    //cargar un arreglo con 10 enteros
    //calcular el promedio de esos nummeros 
    //mostrar el promedio 
public class Ejercicio_2tp5 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int [] Arrenteros = {2,4,6,8,10,12,14,16,18,20};
        double promedio = calcularPromedio(Arrenteros);
        System.out.println("El promedio es: " +promedio);
        promedioMayor(promedio, Arrenteros);

    }
    private static void promedioMayor(double promedio, int[]Arrenteros) {
        //int elementos = 0;
        for(int pos = 0; pos < MAX ; pos++){
            if(Arrenteros[pos] > 11){
                System.out.println("los promeios mas altos son: " + Arrenteros[pos]);
            }
        }
    }
    private static double calcularPromedio(int[] arrenteros) {
        double promedio = 0.0;
        for(int pos = 0; pos < MAX; pos++){
            promedio+=arrenteros[pos];
        }
        return ((double) promedio/MAX);
    }
}
