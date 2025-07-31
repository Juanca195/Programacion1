package PracticaParciales;
// Este ejercicio esta hecho como para este ejemplo, pero tambien se podria hacer pidiendo la cantida y gusto al usuario.
public class Ejercicio5tipoParcial {
    final static int MAXE = 16;

    public static void main(String[]args){
        int [] arr = {-1,5,5,7,7,-6,4,9,10,-4,1,1,2,7,-9,-8};
        int numeroPedido = 2;
        int gustoEmpanada =7;

        int ini = 0;
        int fin = -1;
        int contador =0;
        while (ini<MAXE) {
            ini = obtenerInicio(arr, fin+1);
            if(ini<MAXE){
                fin = obtenerFin(arr, ini);
                contador++;
                if(contador==numeroPedido){
                    agregarEmpanada(arr, ini+1);
                    arr[ini+1]= gustoEmpanada;
                }
            }
        }
        mostrarArreglo(arr);
    }
    public static void agregarEmpanada(int []arr, int pos){
        for(int i = MAXE-1; i > pos; i--){
            arr[i] = arr[i-1];
        }
    }
    public static int obtenerInicio(int[] arr, int pos){
        while(pos < MAXE && arr[pos]<0){
            pos++;
        }
        return pos;
    }
    public static int obtenerFin(int [] arr, int pos){
        while(pos<MAXE && arr[pos]>0){
            pos++;
        }
        return pos-1;
    }
    public static void mostrarArreglo(int [] arr){
        for(int i = 0; i < MAXE; i++){
            System.out.print("|" + arr[i]);
        }
    }
}
