package PracticaParciales;

public class TipoRecu2 {
    final static int MAXFILA = 7, MAXCOLUMN =20, SEP = 0, NARR = 7;
    public static void main(String[] args) {
        int [] [] entrenamiento = { {0, 300, 298, 298, 297, 0, 240, 233, 245, 240, 0, 257, 254, 254, 0, 234, 230, 222, 0, 0},
                                    {0, 310, 302, 284, 271, 0, 280, 263, 263, 0, 0, 0, 264, 264, 0, 234, 230, 0, 0, 0},
                                    {0, 310, 302, 294, 0, 0, 250, 243, 0, 245, 0, 257, 255, 253, 0, 234, 229, 0, 0, 0},
                                    {0, 315, 320, 395, 398, 0, 351, 333, 353, 0, 0, 0, 334, 354, 0, 454, 490, 499, 0, 0},
                                    {0, 410, 400, 397, 0, 0, 250, 243, 0, 0, 0, 257, 255, 253, 0, 234, 229, 220, 0, 0},
                                    {0, 0, 420, 430, 430, 450, 420, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                    {0, 415, 425, 435, 420, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}    };
        double p =0.5;
        int [] dias = {1,2,5,0,0,0,0};
        int i =0;
        int diasCumplidos = 0;
        int diasEntrenamiento= 0; 
        while (i<NARR && dias[i]!=SEP) {
            if (progresivo(entrenamiento[dias[i]-1])) {
                diasCumplidos++;
                correrIzquierda(dias, i);
            }
            else{
                i++;
            }
        }
        informar(diasCumplidos, p, diasEntrenamiento);
    }
    public static boolean progresivo(int [] dia){
        int ini =0; 
        int fin = -1; 
        boolean progresiva = true; 
        while(ini<MAXCOLUMN && progresiva){
            ini = buscarInicio(dia, fin+1);
            if(ini<MAXCOLUMN){
                fin = buscarFin(dia, ini);
                progresiva = esProgresiva(dia, ini, fin);
            }
        }
        return progresiva;
    }
    public static boolean esProgresiva(int [] arr, int ini, int fin){
        while(ini<fin && arr[ini]>=arr[ini+1]){
            ini++;
        }
        return ini == fin; 
    }
    public static void informar(int dias, double p, int diasEntrenamiento){
        if(((double)dias/diasEntrenamiento)>=p){
            System.out.println("Cumplio " + dias);
        }else{
            System.out.println("No cumpolio");
        }
    }
    public static int buscarInicio(int [] arr, int pos){
        while (pos<MAXCOLUMN && arr[pos]==SEP) {
            pos++;
        }
        return pos;
    }
    public static int  buscarFin(int [] arr, int pos ){
        while (pos<MAXCOLUMN && arr[pos]!=SEP) {
            pos++;
        }
        return pos-1;
    }
    public static void correrIzquierda(int [] arr, int pos){
        for(int i = pos; i < NARR-1; i++){
            arr[i]= arr[i+1];
        }
    }
}
