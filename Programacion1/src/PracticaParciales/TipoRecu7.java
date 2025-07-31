package PracticaParciales;

public class TipoRecu7 {
    final static int MAXFILA = 3; 
    final static int MAXCOLUMN = 20;
    final static int SEP =0;

    public static void main (String[]args){
        int [] [] mat = {
            {0, -8, 67, 0, 14, 0, -4, 33, 0, 5, 98, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 25, 25, 0, -5, 3, 0, 25, 44, 44, 0, -4, 1, 0, 0, 0, 0, 0, 0},
            {0, 44, 44, 44, 0, -7, 15, 0, -4, 9, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0}
            };
        int totaldescomprimidos =procesarMatriz(mat);
        imprimirMatriz(mat);
        System.out.println("El total de descomprimidos es: " +totaldescomprimidos);
    }
    public static int procesarMatriz(int [][] mat){
        int totaldescomprimidos = 0;
        for(int i = 0; i <MAXFILA; i++){
              totaldescomprimidos +=procesarArreglo(mat[i]);
        }
        return totaldescomprimidos;//Devuelvo la sumaTotal de los descomprimidos por fila 
    }
    public static int procesarArreglo(int [] fila){
        int ini = 0; 
        int fin = -1; 
        int cantidadDescomprimidas= 0;
        int negativo = 0;
        while(ini <MAXCOLUMN){
            ini = buscarInicio(fila, fin+1);
            if(ini<MAXCOLUMN){
                fin = obtenerFin(fila, ini);
                negativo = buscarNegativo(fila, ini, fin);// guardo el valor negativo
                //Si es negativo lo modifico 
                if(negativo<0){
                    fila[ini] = -negativo;//Lo que hago aca es cambiar el valor a positivo
                    desComprimir(fila, ini, fin , -negativo);
                    fin = obtenerFin(fila, ini);//Si tenemos dudas de como actualizar el fin volvemos a reutlzar el busacr fin;
                    cantidadDescomprimidas += -negativo;
                }
            }
        }
        return cantidadDescomprimidas;//Devuelvo la cantidad de descomprimidos por secuencia
    }
    public static void desComprimir(int [] fila, int ini, int fin, int negativo){
        for(int i = 0; i<negativo-2; i++){//Este for va a marcar la cantidad de veces que tenemos que hacer el corrimiento
            correrAderecha(fila, fin);
            fila[ini]= fila[ini+1];
        }
    }
    public static void correrAderecha(int [] fila, int pos){
        for(int i = MAXCOLUMN-1; i>pos; i--){
            fila[i] = fila[i-1];
        }
    }
    public static int buscarNegativo(int [] fila, int ini, int fin){
        int numeroNegativo= 0;
        while(ini<=fin && fila[ini]<0){// corroboro que siga en la secuencia y que sea negativo 
            numeroNegativo = fila[ini];
            ini++;
            }
            
        return numeroNegativo;
    }
    public static void imprimirMatriz(int [][] mat){
        for(int i = 0; i<MAXFILA; i++){
            for(int j = 0; j<MAXCOLUMN; j++){
                System.out.print(mat[i][j] + "|");
            }
            System.err.println();
        }
    }
    public static int buscarInicio(int [] arr, int pos) {
        while (pos < MAXCOLUMN && arr[pos] == SEP) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int [] arr, int pos) {
        while (pos < MAXCOLUMN&& arr[pos] != SEP) {
            pos++;
        }
        return pos - 1;
    }
}
