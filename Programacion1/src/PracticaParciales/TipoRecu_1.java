package PracticaParciales;

public class TipoRecu_1 {
    public class Huerta {
    final static int MAXB = 3;
    final static int MAXFILA = 3;
    final static int MAXCOLUMNA = 20;
    final static int R = 2;

    public static void main(String [] args){
           char[][] matriz = {
            {'x', 't', 'a', 'C', 'M', 'O', 't', 'a', 'a', 't', 'O', 'C', 't', 't', 'a', 'O', 'M', 'C', 't', 'x'},
            {'x', 'r', 'r', 'r', 'C', 'C', 'O', 'C', 'r', 'r', 'C', 'r', 'G', 'G', 'G', 'r', 'r', 'x', 'x', 'x'},
            {'x', 'm', 'G', 'm', 'h', 'h', 'L', 'G', 'G', 'O', 'h', 'h', 'm', 'm', 'O', 'B', 'M', 'C', 'x', 'x'}
        };
        char [] B = {'C', 'O', 'L'};
        int cantidadEliminadas = procesarMatriz(matriz, B);
        imprimirMatriz(matriz);
        System.out.println("Se eliminaron " + cantidadEliminadas);

    }
 
    public static int procesarMatriz(char [][] mat, char [] B){
        int cantidadEliminadas = 0;
        for(int fila = 0; fila < MAXFILA; fila++){
            cantidadEliminadas += procesarFila(mat[fila], B);
        }
        return cantidadEliminadas;
    }

    public static int procesarFila(char [] arr, char [] B){
        int inicio = 0;
        int fin = -1;   
        int cantidadEliminadas = 0;

        while(inicio < MAXCOLUMNA){
            inicio = buscarInicio(arr, fin+1);
                if(inicio < MAXCOLUMNA){
                    fin = buscarFin(arr, inicio);

                    if((fin - inicio + 1) > R){
                     cantidadEliminadas += eliminarMaleza(arr,B, inicio, fin);
                    }
                }
        }
        return cantidadEliminadas;
    }

    public static int eliminarMaleza(char[] arr, char[] B, int inicio, int fin) {
    int cantidadEliminadas = 0;
    while (inicio <= fin) {
        int iB = 0;
        while (iB < MAXB && arr[inicio] != B[iB]) {
            iB++;
        }
        if (iB < MAXB) {
             inicio++;
        } else {
           cortarMaleza(arr, inicio);
            fin--; 
            cantidadEliminadas++;  
         }
        }
    return cantidadEliminadas;
    }

    public static void cortarMaleza(char [] arr, int pos){
        for(int i = pos; i < MAXCOLUMNA - 1; i++){
            arr[i] = arr[i + 1];
        }
    }

public static int buscarInicio(char[] arr, int pos) {
    while (pos < arr.length && (arr[pos] == 'x' || arr[pos] < 'A' || arr[pos] > 'Z')) {
        pos++;
    }
    return pos;
}

public static int buscarFin(char[] arr, int pos) {
    while (pos < arr.length && arr[pos] >= 'A' && arr[pos] <= 'Z') {
        pos++;
    }
    return pos - 1;
}
    public static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
    
}
}
