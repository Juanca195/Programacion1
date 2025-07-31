package PracticaParciales;

public class TipoRecu1 {
    final static int MAXFILA = 3;
    final static int MAXCOLUMNA = 20; 
    final static char SEP = 'x';// No lo usas si ya se contempla en los buscadores de inicio y fin
    final static int MAXB = 3;
    final static int R = 2;
    
    public static void main(String[]args){
        char [][] huerta = {{'x','t','a','C','M','O','t','a','a', 't','O','C','t','t','a','O','M','C','t','x'},
                            {'x', 'r', 'r', 'r', 'C', 'C', 'O', 'O', 'r', 'r', 'C', 'r', 'G', 'G', 'G', 'r', 'r', 'x', 'x', 'x'},
                            {'x', 'm', 'G', 'm', 'h', 'h', 'L', 'G', 'G', 'O', 'h', 'h', 'm', 'm', 'O', 'B', 'M', 'C', 'x', 'x' }};
                               // Matriz resultante
                            /*{"x", "t", "a", "C", "O", "t", "a", "a", "t", "O", "C", "t", "t", "a", "O", "C", "t", "x", "x", "x"},
                            {"x", "r", "r", "r", "C", "C", "O", "O", "r", "r", "C", "r", "r", "r", "x", "x", "x", "x", "x", "x"},
                            {"x", "m", "G", "m", "h", "h", "L", "O", "h", "h", "m", "m", "O", "C", "x", "x", "x", "x", "x", "x"} */
                                            
        char [] B = {'C', 'O', 'L'};
        
        recorrerHuerta(huerta, B);
        mostrarMatriz(huerta);
        }

        public static void recorrerHuerta(char [][] huerta, char [] B){
            int totalMalezasEliminadas = 0;
            for(int fila = 0; fila < MAXFILA; fila++){
              totalMalezasEliminadas = combatirMalezas(huerta[fila], B);
            }
            infomarMalezaEliminada(totalMalezasEliminadas);
        }
        
        public static int combatirMalezas(char [] huerta, char [] B){
            int inicio = 0;
            int fin = -1;
            int malezasEliminadas = 0;

            while(inicio < MAXCOLUMNA){
                inicio = buscarInicio(huerta, fin+1);
                    if(inicio < MAXCOLUMNA){
                        fin = buscarFin(huerta, inicio);
                        if(activacionDeRayo(inicio, fin)){
                         malezasEliminadas = compararVegetacion(huerta, B, inicio, fin); 
                        }
                    }
            }
            return malezasEliminadas;
             
        }

        public static int compararVegetacion(char [] huerta, char [] B, int inicio, int fin){
            int contador = 0;
                for(int pos = inicio; pos <= fin; pos++){
                     int posB = 0;
                    while(B[posB] != huerta[pos] && posB < MAXB-1 ){
                        posB++;
                    }
                    if(posB >= MAXB - 1){
                        eliminamosMaleza(huerta, pos);
                        contador++;
                    }
                }
                fin = fin - contador;
                return contador;
        }
        public static void infomarMalezaEliminada(int contador){
            System.out.println("Se eliminaron en total: " + contador + " malezas");
        }

        public static void eliminamosMaleza(char [] huerta, int pos){
                for(int i = pos; i < MAXCOLUMNA-1;i++){
                    huerta[i] = huerta[i + 1];
                }
        }

        public static boolean activacionDeRayo(int inicio, int fin){
            int tamanio = fin - inicio + 1;
            return tamanio > R;
        }
                
        public static int buscarInicio(char [] arrSec, int pos){
            char esSep = esSepador(arrSec, pos);
        while (pos<MAXCOLUMNA && arrSec[pos]==esSep) {// && arrSec[pos]==SEP se tiene que comparar que sea las dos condiciones? podria ser en ua  funcion?
            pos++;
        }
        return pos;
        }
        public static char esSepador(char [] arrSec, int pos){
           char letra = ' ';
            if(arrSec[pos] == SEP || arrSec[pos] < 'A' && arrSec[pos] < 'Z'){
                letra = arrSec[pos];
            }
            return letra;
        }
    public static int buscarFin(char [] arrSec, int pos){
        while(pos<MAXCOLUMNA &&arrSec[pos] != esSepador(arrSec, pos)){// && arrSec[pos]!=SEP
            pos++;
        }
        return pos-1;
    }

                public static void mostrarMatriz(char [][] matriz){
        for(int fila = 0; fila <MAXFILA; fila++){
            for(int column = 0; column<MAXCOLUMNA; column++){
                System.out.print( "|" +matriz[fila][column]);
            }
            System.out.println();
        }
    }
                 
}
