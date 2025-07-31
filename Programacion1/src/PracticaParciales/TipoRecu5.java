package PracticaParciales;

public class TipoRecu5 {
    final static int MAXFILA = 3, MAXCOLUMNA = 20, SEP = 0;
    final static int X = 3;

    public static void main(String[] args) {
        int [][] mat = {{0, 67, 67, 67, 67, 67, 67, 67, 67, 0, 14, 0, 33, 33, 33, 33, 0, 5, 98, 0,0},
                        {0, 23, 45, 45, 45, 45, 23, 0, 88, 88, 88, 88, 88, 0, 0, 0, 78, 78, 0, 0},
                        {0, 0, 0, 45, 45, 45, 0, 45, 45, 45, 45, 45, 0, 45, 45, 0, 45, 0, 0, 0}};

        procesarMatriz(mat);
        mostrarMatriz(mat);
    }
    public static void procesarMatriz(int [][]mat){
        int filaMayorComprimida= 0;
        for(int i = 0; i < MAXFILA; i++){
            filaMayorComprimida = comprimirFila(mat[i]);
        }
        System.out.println("La fila con mayorcomprimidos fue: " +filaMayorComprimida);
    }
    public static int  comprimirFila(int [] fila){
        int ini = 0;
        int fin = -1;
        int contador =0;
        int mayorFilacomprimida =0;
        while(ini<MAXCOLUMNA){
            ini = obtenerInicio(fila, fin +1);
            if(ini<MAXCOLUMNA){
                fin = obtenerFin(fila, ini);
                contador = comPrimirSecuencias(fila, ini, fin);
                if(contador > mayorFilacomprimida){
                    mayorFilacomprimida = contador;
                }
                fin = ini+1;
            }
        }
        return mayorFilacomprimida;
    }
    public static int comPrimirSecuencias(int [] fila,int ini, int fin){
        int i = ini; 
        int valor = fila[i];// guardo el valor de la posicion de inicio
        int j = i+1;// guardo la siguiente posicion despues del inicioS
        int contador = 1;

        while(j<=fin && fila[j]==valor){
            contador++; 
            j++;
        }
        if(contador>X){
            fila[i]= -contador;
            fila[i+1]= valor; 
            for(int k =0; k<contador-2; k++){
                corrimientoIzqui(fila, i+2);
            }
            fin = i+1;
        }
        return contador;
    }
    public static void corrimientoIzqui(int [] fila, int pos){
        for(int i = pos; i <MAXCOLUMNA-1; i++){
            fila[i] = fila[i+1];
        }
    }
     public static int obtenerInicio(int [] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] == SEP) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int [] arr, int pos) {
        while (pos < MAXCOLUMNA  && arr[pos] != SEP) {
            pos++;
        }
        return pos - 1;
    }
    public static void mostrarMatriz(int [][] mat){
        for(int i = 0; i<MAXFILA; i++){
            for(int j = 0; j<MAXCOLUMNA; j++){
                System.out.print(mat[i][j] + "|");
            }
            System.err.println();
        }
    }
}
