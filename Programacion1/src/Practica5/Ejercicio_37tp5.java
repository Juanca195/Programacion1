package Practica5;
/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario el ingreso de
dos números enteros (posiciones del arreglo) y ordene de forma
creciente el arreglo entre dos posiciones correspondientes a los
números ingresados.
 */
  // Dado un arrego de enteros de tamaño 10
   // pedir dos numero enteros al usuario(posisciones del arreglo)
    // ordene de forma creciente el arreglo entre las dos posiciones ingresados
public class Ejercicio_37tp5 {
    final static int MAX =10;

    public static void main(String[] args) {
        int [] arrEnteros = {2,4,3,1,7,5,6,10,8,9};

        System.out.println("Ingrese un numero de posicion");
        int numero1 = Utils.leerInt();
        System.out.println("Ingrese otro numero de posicion");
        int numero2 = Utils.leerInt();

        ordenarArreglo(arrEnteros, numero1, numero2);
        mostrarArreglo(arrEnteros);
    }
    public static void ordenarArreglo(int [] arrEnteros, int numero1, int numero2){
             int temp ;
             int aux ;
            for(int i = 0;i < MAX;i++){
                for(int e = numero1; e< MAX-1; e++){
                    for (int j = numero2; j < MAX - 1; j++){
                        if(arrEnteros[e] >arrEnteros[e+1]){
                             if (arrEnteros[j] > arrEnteros[j+1]){
                                aux = arrEnteros[e];
                                temp = arrEnteros[j];
                                arrEnteros[e]=arrEnteros[e+1];
                                arrEnteros[j] = arrEnteros[j+1];
                                arrEnteros[e+1] = aux;
                                arrEnteros[j+1] = temp;
                            }
                        }
                    
                  }
                }
                
            }

    }
    public static void mostrarArreglo(int [] arrEnteros){
        for(int i = 0; i< MAX; i++){
            System.out.print("|" + arrEnteros[i]);
        }
    }
}
