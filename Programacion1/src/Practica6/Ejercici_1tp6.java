package Practica6;
/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, invierta el orden del contenido
por fila. Este intercambio no se debe realizar de manera explícita,
hay que hacer un método que incluya una iteración de
intercambio. */
public class Ejercici_1tp6 {
    final static int MAXFILA = 5, MAXCOLUMNA= 10;

    public static void main(String[]args){
        int [][] matriz = { {1,2,3,4,5,6,7,8,9,10},
                            {11,12,13,14,15,16,17,18,19,20},
                            {21,22,23,24,25,26,27,28,29,30},
                            {31,32,33,34,35,36,37,38,39,40},
                            {41,42,43,44,45,46,47,48,49,50}};

        System.err.println("Matriz original");
        mostraMatriz(matriz);
        System.out.println("");
        System.out.println("Matriz invertida");
        invertirOrdenFila(matriz);
        mostraMatriz(matriz);
    }
   public static void invertirOrdenFila(int [][] matriz){
    for(int fila = 0;fila < MAXFILA; fila++){
        invertirArreglo(matriz[fila]);
        }
    }
    public static void invertirArreglo(int [] arr ){
        int i = 0, j=MAXCOLUMNA-1,temp =0;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void mostraMatriz(int [][] mat){
        for(int fila = 0; fila<MAXFILA; fila++){
            for(int colum =0; colum<MAXCOLUMNA; colum++){
                System.out.print("|" +mat[fila][colum] );
            }
            System.err.println();
        }
    }
}
