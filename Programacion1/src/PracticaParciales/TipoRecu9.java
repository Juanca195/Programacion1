package PracticaParciales;

public class TipoRecu9 {
    final static int MAXFILA = 3; 
    final static int MAXCOLUMN = 15; 
    final static int SEP = 0;
    final static int X = 600;
    public static void main(String[] args) {
        int[][] ventas = {
            {0, 0, 150, 200, 165, 0, 154, 352, 240, 256, 0, 900, 750, 0, 0},
            {0, 940, 105, 265, 845, 215, 0, 245, 765, 348, 0, 741, 125, 541, 0},
            {0, 851, 543, 625, 845, 914, 0, 754, 184, 452, 637, 917, 0, 0, 0}
        };
        int[] A1 = {1, 2, 0}; // meses para promedio máximos diarios
        int[] A2 = {3, 0, 0}; // meses para validar promedio diario > X
        double mayorValordeventas =valoresMeximosdelmes(A1, ventas);
        System.out.println("Promedio dia mayor " +mayorValordeventas);
        valoresVentaMayoX(A2, ventas);
       
    }
    public static void valoresVentaMayoX (int [] A2, int [][] ventas){
        int i2 = 0;
         while(i2< MAXFILA && A2[i2]!=0){
            if(cumplioPromedio(ventas[A2[i2] - 1])){
                System.out.println("No se cumplio  " + i2 );
            }
            i2++;
        }
    }
    public static boolean cumplioPromedio(int [] fila){
        int ini = 0; 
        int fin = -1;
        int tamnio = 0; 
        double promedio =0.0; 
        boolean cumplio = false; 
         while(ini < MAXCOLUMN && !cumplio){
            ini = obtenerInicio(fila, fin+1);
            if(ini<MAXCOLUMN){
                fin = obtenerFin(fila, ini);
                tamnio = fin -ini +1; 
                promedio = buscarPromedio(fila, ini, fin , tamnio);
                if(promedio>X){
                    promedio = buscarPromedio(fila, ini, fin , tamnio);
                }else{
                    cumplio = true;
                }
            }
         }
        return cumplio;
    }
    public static double buscarPromedio(int [] fila, int ini , int fin , int tamnio){
        int suma = 0;
        for(int i = ini; i<= fin; i++){
            suma += fila[i];
        }
        return (double) suma/tamnio;
    }
    public static double valoresMeximosdelmes(int [] A1, int [][]ventas){
        int iA = 0; 
        double valoresMaximos = 0;
        while(iA< MAXFILA && A1[iA]!=0){
             valorMaxSec(ventas[A1[iA] - 1]);
            iA++;
        }
        return valoresMaximos;
    }
    public static void valorMaxSec(int [] fila){
        int ini = 0; 
        int fin = -1;
        int diasVentas=0; 
        int valoresMaximosEncontrados=0; 
        while(ini < MAXCOLUMN){
            ini = obtenerInicio(fila, fin+1);
            if(ini<MAXCOLUMN){
                fin = obtenerFin(fila, ini);
                valoresMaximosEncontrados += sacarValorMax(fila, ini, fin);
                if(valoresMaximosEncontrados>0){
                    diasVentas++;
                }
            }
        }
        System.out.println("Pomedio del dia: " +(double)valoresMaximosEncontrados/diasVentas);
    }
    public static int sacarValorMax(int [] fila, int ini, int fin){
        int valorMayor=fila[ini];
        while(ini<fin){
            if(fila[ini+1]>valorMayor){
                valorMayor = fila[ini+1];
            }
            ini++;
        }
        return valorMayor;
    }
    public static int obtenerInicio(int [] arr, int pos) {
        while (pos < MAXCOLUMN && arr[pos] == SEP) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int [] arr, int pos) {
        while (pos < MAXCOLUMN && arr[pos] != SEP) {
            pos++;
        }
        return pos - 1;
    }
}
