package PracticaParciales;

public class Ejercicio_practicafinal {
    final static int MAXFILA = 3, MAXCOLUMNA = 20; 
    final static char SEP = ' ';

    public static void main(String[] args) {
        char [][] maquinaEnigma = { {' ','E','L',' ','A','U','T','O',' ','C','H','I','C','O',' ','D','E',' ',' ',' '},
                                    {' ',' ','L','A',' ','B','R','I','G','A','D','A',' ',' ',' ','V','A',' ','A',' '},
                                    {' ','L','A',' ',' ','U','N','A',' ','A','L',' ','C','U','A','R','T','E','L',' '}
                                };

        procesarMatriz(maquinaEnigma);
        mostrarMatriz(maquinaEnigma);
    }
    public static void procesarMatriz(char [][] maquinaEnigma){
        int totalEncriptadas = 0;
        for(int i = 0 ; i < MAXFILA; i++){
            totalEncriptadas += procesarArreglo(maquinaEnigma[i]);
        }
        System.out.println("La cantidad total de encriptadas : " +totalEncriptadas);
    }
    public static int procesarArreglo(char [] fila){
        int ini = 0; 
        int fin = -1; 
        int contador = 0; 
        int tamPalabra = 0; 
        int tamPalabraActual = 0; 

        while(ini<MAXCOLUMNA){
            ini = buscarInicio(fila, fin+1);
            if(ini<MAXCOLUMNA){
                fin = buscarFin(fila, ini);
                tamPalabraActual = fin -ini+1;
                encriptarSec(fila, ini, fin);
                contador++;
                if(tamPalabraActual > tamPalabra){
                    tamPalabra = tamPalabraActual;
                }

            }
        }
        System.out.println(tamPalabra);
        return contador;
    }
    public static void encriptarSec (char [] fila, int ini, int fin){
        while(ini<=fin){
            fila[ini] = (char)('Z' - (fila[ini] - 'A'));// Esta linia comvierte el valor de la letra al opuesto;
            ini++;
        }
    }
    public static void mostrarMatriz(char[][] matriz) {
        for (int i = 0; i< MAXFILA; i++) {
            for (int j = 0; j < MAXCOLUMNA; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
    }

     public static int buscarInicio(char[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] == SEP) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(char[] arr, int pos) {
        while (pos < MAXCOLUMNA  && arr[pos] != SEP) {
            pos++;
        }
        return pos - 1;
    }
}
