package PracticaParciales;

public class ExtraPrrfinal {
    final static int MAXFILA = 5, MAXCOLUMN = 20;
    final static char SEP = ' ';

    public static void main(String[] args) {
        char [][] matriz = { { ' ','1', '2', 'G', 'H', ' ', '2', 'A', '3', ' ','3','R', 'B', 'J', ' ','6', '5', 'K', ' ', ' '},
                            { ' ', ' ','2', '1', '4', '5',' ', 'R', 'P',' ', 'D', '3',' ','7', 'M', 'N', 'W', ' ' , ' ', ' '},
                            { ' ','4', 'G', '8',' ' ,'3', '5', '7', ' ','1', ' ','2', 'X',' ', 'D', '4', '1', ' ', ' ', ' ',},
                            {' ',' ' ,' ','5', 'T', 'T', 'M', ' ','A', 'P', 'P', 'P', ' ','2', '1', '3',' ', '1', '3', ' '},
                            { ' ','6', '6', '4', ' ','5', '4',' ',' ', 'A', '2', 'Z', 'Z',' ','G', '4', '2', '1', '8', ' '}
        };
        int P = 2;
        int k = 2;
        char L = 'F';
        imprimirMatriz(matriz);
        int cantSenañles = procesarMatriz(matriz, P, k, L);
        System.out.println(cantSenañles);
        imprimirMatriz(matriz);
    }  
    public static int procesarMatriz(char [][] matriz, int P, int k, char L){
        int cantTotales =0;
        int cantCosecutivo =0;
        for(int i = 0; i < MAXFILA; i++){
            if(procesarArregl(matriz[i], k ,L)){
                cantCosecutivo++;
            }
            else{
                cantCosecutivo =0;
            }
            if(cantCosecutivo==P){
                cantTotales++;
                cantCosecutivo = 0;
            }
        }
        return cantTotales;
    }
    public static boolean procesarArregl(char [] fila, int k, char L){
        boolean cumple = false;
        int ini = 0;
        int fin = -1;
        while(ini<MAXCOLUMN && !cumple){
            ini = obtenerInicio(fila, fin +1);
            if(ini<MAXCOLUMN){
                fin = obtenerFin(fila, ini);
                if(cumpleSec(ini, fin, fila, k, L)){
                    cumple = true;
                }
            }
        }
        return cumple;
    }
    public static boolean cumpleSec(int ini, int fin, char [] fila, int k, char L){
        boolean cumple = false;
        int cont =0;
        while(ini <= fin && !cumple){
            if(fila[ini]> L){
                cont++;
                if(cont ==k){
                    cumple = true;
                }
            }
            ini++;
        }
        return cumple;
    }
    public static int obtenerInicio(char [] arr, int pos) {
        while (pos < MAXCOLUMN && arr[pos] == SEP) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(char [] arr, int pos) {
        while (pos < MAXCOLUMN && arr[pos] != SEP) {
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
