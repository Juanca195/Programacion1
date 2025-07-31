package PracticaParciales;

public class TipoRecu8 {
    final static int MAXFILA = 3; 
    final static int MAXCOLUMN = 15;
    final static int SEP =0;

    public static void main (String[]args){
        int [] [] mat = {
            {0, 120, 250, 80, 0, 0, 620, 410, 645, 0, 0, 240, 960, 0, 0},
            {0, 250, 155, 90, 85, 0, 150, 625, 0, 0, 900, 750, 225, 0, 0},
            {0, 580, 550, 850, 0, 0, 220, 110, 0, 0, 150, 480, 690, 0, 0}
            };
        procesarMatriz(mat);
        imprimirMatriz(mat);
    }
    public static void procesarMatriz(int [][] mat){
        for(int i = 0; i <MAXFILA; i++){
            procesarArreglo(mat[i]);
        }
    }
    public static void procesarArreglo(int [] fila){
        int ini = 0; 
        int fin = -1; 
        int cantProductosOrdenados = 0; 
        while(ini<MAXCOLUMN){
            ini = buscarInicio(fila, fin +1);
            if(ini<MAXCOLUMN){
                fin = buscarFin(fila, ini);
                if(esDesendente(fila,ini,fin)){
                    invertirSecuencia(fila, ini,fin);
                    cantProductosOrdenados++;
                }
            }
        }
        if(cantProductosOrdenados >= 2){
            System.out.println("Se reordenaron " +cantProductosOrdenados+ " grupo de productos");
        }
        
    }
    public static boolean esDesendente(int [] fila, int ini, int fin){
        boolean esDesendente = true;// siempre va ser verdadero 
        while (ini<fin){
            if(fila[ini]<=fila[ini+1]){//Si entre aca significa que el numero seguiente es mayor o igual, que el valor anterior
                esDesendente = false;//se vuelve false y retorna ese valor en caso de romper con la descendencia
            }
            ini++;
        }
        return esDesendente;
    }
    public static void invertirSecuencia(int [] fila, int ini, int fin){
        int aux = 0; 
        while(ini <fin){
            aux = fila[ini];
            fila[ini] = fila[fin];
            fila[fin] = aux; 
            ini++; 
            fin--;      
        }
    }
    public static int buscarInicio(int [] arr, int pos) {
        while (pos < MAXCOLUMN && arr[pos] == SEP) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int [] arr, int pos) {
        while (pos < MAXCOLUMN&& arr[pos] != SEP) {
            pos++;
        }
        return pos - 1;
    }
    public static void imprimirMatriz(int [][] mat){
        for(int i = 0; i<MAXFILA; i++){
            for(int j = 0; j<MAXCOLUMN; j++){
                System.out.print(mat[i][j] + "|");
            }
            System.err.println();
        }
    }
}
