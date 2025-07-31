package PracticaParciales;

public class Ejercicio2tipoParcial {
    final static int MAXC = 20;
    final static int MAXM = 5;
    final static int SEP = 0;

    public static void main(String[] args) {
        int [] C = {4,3,8,6,2,12,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int [] M = {2,3,5,6,12};

        procesarArreglo(C,M);

        mostrarArregloM(M);
        System.out.println("");
        mostrarArregloC(C);
    }
    public static void procesarArreglo(int [] C, int [] M){
       int ini =0;
       int fin = -1;
       int posM =0;
       while(ini<MAXC){
        ini = obtenerInicio(C, fin+1);
           if(ini<MAXC){
            fin = obtenerFin(C, ini);
            posM = obtenerPosM(M,C, ini, fin);
              if(posM !=-1){
                M[posM] =-M[posM];
                System.out.println(posM);
                eliminClientes(C,ini,fin);
                fin = ini;
              }
           }
       }
       //System.out.println("El cliente: " +C[ini]+ " Se asingo a la mesa " +M[posM]);
    }
    public static void eliminClientes(int [] C, int ini, int fin){
        int cantidad = fin -ini+1;
        for(int i = 0; i<cantidad; i++){
            correrIzquierda(C, cantidad);
        }
    }
    public static void correrIzquierda(int [] C, int pos){
        for(int i = pos; i<MAXC-1; i++){
            C[i] = C[i+1];
        }
    }
    public static int obtenerPosM(int [] M, int [] C, int ini, int fin){//{2,3,5,6,12};
        int pos = 0;                                                    //{4,3,8,6,2,12,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        //int posC= C[ini];
        while (pos<MAXM && ini<=fin && M[pos]<=C[ini]) {
            pos++;
            ini++;
        }
        //ini++;
        if (pos<MAXM) {
            return pos;
        }
        else{
            return -1;
        }
    }
    public static int obtenerInicio(int[] arreglo, int pos){
        while (pos<MAXC && arreglo[pos]==SEP) {
            pos++;
        }
        return pos;
    }
    public static int obtenerFin(int [] arreglo, int pos){
        while (pos<MAXC && arreglo[pos]!=SEP) {
            pos++;
        }
        return pos-1;
    }
     public static void mostrarArregloC(int [] C){
        for(int i = 0; i <MAXC; i++){
            System.out.print("|" + C[i]);
        }
    }
     public static void mostrarArregloM(int [] M){
        for(int i = 0; i <MAXM; i++){
            System.out.print("|" + M[i]);
        }
    }
}
