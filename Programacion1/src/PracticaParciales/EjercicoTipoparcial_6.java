package PracticaParciales;

public class EjercicoTipoparcial_6 {
    final static int MAXP = 28;
    final static int MAXR = 2; 
    final static int SEP = 0;

    public static void main(String[]args){
        int [] arrP = {0,0,9,12,18,0,1,5,43,73,88,0,8,9,52,0,1,10,90,0,0,0,0,0,0,0,0,0};
        int[] arrR = {44,6};

        int ini = 0; 
        int fin = -1;
        int pos ; 
        while(ini<MAXP){
            ini = obtenerInicio(arrP, fin+1);
            if(ini<MAXP){
                fin = obtenerFin(arrP, ini);
                pos = encontrarPos(arrP, ini, fin, arrR);
                if(arrR[pos] <= arrP[ini]){
                    System.out.print(arrR[pos]);
                    agregraPromo(arrP, ini, fin, pos);
                }
            }
        }
        mostrarArreglo(arrP);
    }
     public static void mostrarArreglo(int [] arrP){
        for(int i = 0; i <MAXP; i++){
            System.out.print("|" + arrP[i]);
        }
    }
    public static int encontrarPos(int[] arrP, int ini, int fin, int [] arrR){
        int pos = 0;
        while(ini<=fin && arrP[ini]>=arrR[pos]){
            ini++;
            pos++;
        }
        return pos;
    }
    public static void agregraPromo(int [] arrP, int ini, int fin, int pos){
        for(int i = ini; i <= fin; i++){
            correrAderecha(arrP, pos);
            arrP[ini] = pos;
        }
    }
    public static void correrAderecha(int [] arrP, int pos){
        for(int i = MAXP-1; i>pos; i--){
            arrP[i] = arrP[i-1];
        }
    }
    public static int obtenerInicio(int[] arrP, int pos){
        while (pos<MAXP && arrP[pos]==SEP) {
            pos++;
        }
        return pos;
    }
    public static int obtenerFin(int [] arrP, int pos){
        while (pos<MAXP && arrP[pos]!=SEP) {
            pos++;
        }
        return pos-1;
    }
}
