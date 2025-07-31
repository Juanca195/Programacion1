package PracticaParciales;

public class EjercicioTipoParcial9 {
    final static char MAXS= 17;
    final static int MAXC = 3;

    public static void main(String[]args){
        char [] arrSec = {' ','H','O','L','A',' ','C','O','M','O',' ','E','S','T','A','S',' '};
        int[] clave = {1,2,3};

        int ini =0; 
        int fin =-1;
        int posClave = 0;
        while(ini<MAXS){
            ini = obtenerIni(arrSec, fin+1);
            if(ini<MAXS){
                fin = obtenerFin(arrSec, ini);
                if(!hayRepetidos(arrSec, ini, fin)){
                    posClave = encriptarSec(arrSec, clave, ini,fin, posClave);
                }
            }
        }
        mostrarArreglo(arrSec);
    }
    public static boolean hayRepetidos(char [] arrSec, int ini, int fin){
        boolean hayRepetidos= false;
        int contador =1;
        while(ini<=fin && hayRepetidos){
            if(arrSec[ini]==arrSec[ini+1]){
                contador++;
            }
            else{
                contador =1;
            }
            if(contador==3){
                hayRepetidos = true;
            }
            ini++;
        }
        return hayRepetidos;
    }
    public static int encriptarSec(char [] arrSec, int [] clave, int ini, int fin, int j){
        for(int i = ini; i<=fin; i++){
           arrSec[i]+=clave[j];
           j++;
           if(j==MAXC){
            j = 0;
           }
        }
        return j;
    }
    public static int obtenerIni(char [] arrSec, int pos){
        while (pos<MAXS && arrSec[pos]==' ') {
            pos++;
        }
        return pos;
    }
    public static int obtenerFin(char [] arrSec, int pos){
        while(pos<MAXS && arrSec[pos]!=' '){
            pos++;
        }
        return pos-1;
    }
    public static void mostrarArreglo(char [] arrSec){
        for(int i = 0; i< MAXS; i++){
            System.out.print("|" + arrSec[i]);
        }
    }
}
