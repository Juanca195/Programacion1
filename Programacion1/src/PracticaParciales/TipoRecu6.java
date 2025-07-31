package PracticaParciales;

public class TipoRecu6 {
    final static int MAXFILA = 3, MAXCOLUMN = 23;
    public static void main(String[]args){
        char [][] matriz = {
            { '-', 'S', 'u', 'p', 'e', 'r', ' ', 's', 'e', 'c', 'r', 'e', 't', 'o', ':', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
            { '¡', '¡', 'n', 'o', ' ', 'c', 'o', 'r', 't', 'a', 'r', ' ','f', 'o', 'r', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
            { ' ','c', 'o', 'n',' ', 'r', 'e', 't', 'u', 'r', 'n', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!'},
            };
        procesarMatriz(matriz);
        imprimirMatriz(matriz);
    }
    public static void procesarMatriz(char [][] matriz){
        int cantidadEncriptada = 0;
        for(int i = 0; i<MAXFILA; i++){
            cantidadEncriptada +=procesarFila(matriz[i]);
        }
        System.out.println("LA cantidad encriptada : " +cantidadEncriptada);
    }
    public static int procesarFila(char [] fila){
        int ini = 0; 
        int fin = -1; 
        int contador = 0; 
        int tamanio = 0; 
        while(ini<MAXCOLUMN){
            ini = buscarInicio(fila, fin+1);
            if(ini<MAXCOLUMN){
                fin = buscarFin(fila, ini);
                tamanio = fin- ini+1;
                contador = encriptarSec(fila, ini, fin, tamanio);
                fin = fin+contador;
            }
        }
        ///System.out.println("La cantidad de encripatados fue: " +contador);
        return contador;
    }
    public static int encriptarSec(char [] fila , int ini, int fin, int tamnio){
        int cantidadEncriptada= 0; 
        while(ini<=fin){
            if(esVocal(fila[ini])){
                char c = fila[ini];
                c = (char)(c+tamnio);
                fila[ini] = c; 
                ini++;
            }else{
                char valor = fila[ini];
                corrimientoDerecha(fila, ini);
                fila[ini+1]= valor; 
                fin++; 
                ini = ini+2; 
                cantidadEncriptada++;
            }
        }
        return cantidadEncriptada; 
    }
    public static void corrimientoDerecha(char [] fila, int pos){
        for(int i = MAXFILA-1; i>pos; i--){
            fila[i]= fila[i-1];
        }
    }
    public static boolean esVocal(char c){
        boolean esVocal = false;
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            esVocal = true; 
        }
        return esVocal;
    }
    public static boolean esLetra(int c){
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
      public static int buscarInicio(char[] arr, int pos) {
        while (pos < MAXCOLUMN && !esLetra(arr[pos])) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(char [] arr, int pos) {
        while (pos < MAXCOLUMN  && esLetra(arr[pos])) {
            pos++;
        }
        return pos - 1;
    }
     public static void imprimirMatriz(char [][] mat){
        for(int i = 0; i<MAXFILA; i++){
            for(int j = 0; j<MAXCOLUMN; j++){
                System.out.print(mat[i][j] + "|");
            }
            System.err.println();
        }
    }
}
