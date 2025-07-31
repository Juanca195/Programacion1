package PracticaParciales;

public class TipoRecu3 {
    final static int MAXFILA = 4;
    final static int MAXCOLUMNA = 16;

    public static void main(String [] args){
        char[][] matriz = {
                        {' ','e', 'l', ' ','a', 'g', 'e', 'n', 't', 'e', ' ', ' ', ' ', ' ',' ',' '},
                        {' ','J', 'a', 'm', 'e', 's',' ', 'B', 'o',' ', 's', 'e', ' ', ' ', ' ',' ',},
                        {' ','e', 'n', 'c', 'u', 'e', 'n', 't', 'r', 'a',' ', 'e', 'n', ' ',' ',' '},
                        {' ','C', 'o', 'l', 'o', 'n', 'i', 'a', ' ', ' ', ' ', ' ', ' ',' ',' ',' '}
                        };
    procesarMatriz(matriz);
    imprimirMatriz(matriz);
    }

    public static void procesarMatriz(char [][] matriz){
        int totalSecEncriptadas =0;
        for(int fila = 0; fila < MAXFILA; fila++){
            totalSecEncriptadas +=  procesarArreglo(matriz[fila]);
        }
        System.out.println("La cantidad de secuencias encriptadas fueron: " +totalSecEncriptadas);
    }

    public static int procesarArreglo(char [] arr){
        int inicio = 0;
        int fin = -1;
        int inicioIV = 0;
        int finIV = 0;
        int cantSecEncriptadas =0;
        while(inicio < MAXCOLUMNA){
            inicio = buscarInicio(arr,fin+1);
                if(inicio < MAXCOLUMNA){
                    fin = buscarFin(arr, inicio);
                    if(hayMayuscula(arr, inicio, fin)){
                            inicioIV = inicio;
                            finIV = fin;
                            invertirArreglo(arr, inicioIV, finIV);
                            int contador = duplicarVocal(arr, inicio, fin);
                            cantSecEncriptadas++;
                            fin += contador;
                    }
                }
        }
        return cantSecEncriptadas;
    }

    public static int duplicarVocal(char [] arr, int inicio, int fin){
        int contador = 0;
        while(inicio <= fin){
            if(esVocal(arr[inicio])){
                corrimientoDerecha(arr, inicio);
                arr[inicio + 1] = arr[inicio];
                inicio++;
                fin++;
                contador++;
            }
            inicio++;
       }
       return contador;
    }
    public static void corrimientoDerecha(char[] arr, int pos){
        for (int i=MAXCOLUMNA-1; i > pos ;i--)
            arr[i] = arr[i-1];
    }
    public static void invertirArreglo(char [] arr, int inicio, int fin){
        char aux = ' ';
        while(inicio < fin){
            aux = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = aux;
            inicio++; 
            fin--;
        }

    }

    public static boolean hayMayuscula(char [] arr, int inicio, int fin){
        /*boolean hayMayuscula = false;

        while(inicio<=fin && !hayMayuscula){
            if(arr[inicio] >= 'A' && arr[inicio] <= 'Z'){
                hayMayuscula = true;
            }else{
                inicio++;
            }
        }*/
        return arr[inicio] >= 'A' && arr[inicio] <='Z';
    }
    public static boolean hayVocal(char [] arr, int inicio, int fin){
    boolean hayVocal = false;

        while(inicio<=fin && !hayVocal){
            if(esVocal(arr[inicio] )){
                hayVocal = true;
            }else{
                inicio++;
            }
        }
        return hayVocal;
    }
    public static boolean esVocal(char c){
        return c == 'a' || c == 'e' || c== 'i' ||  c == 'o' || c == 'u';
    }
     public static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
    }
     public static int buscarInicio(char[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] == ' ') {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(char[] arr, int pos) {
        while (pos < MAXCOLUMNA  && arr[pos] != ' ') {
            pos++;
        }
        return pos - 1;
    }
}
