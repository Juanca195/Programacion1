package PracticaParciales;

public class Ejercicio8tipoParcial {
        final static int MAX =21;
        final static double SEP = 0.0;

    public static void main(String[] args) {
        double [] arr= {0,2.1,1.5,4.1,0,3.4,0,2.5,3.0,0,3.8,0,2.7,2.7,3.9,2.5,0,4.2,2.0,0,0};
        boolean cumpleSec = false;
        int ini = 0; 
        int fin = -1;
        int N = 2;
        double M = 2.6;
        while(ini<MAX && !cumpleSec){
            ini = obtenerInicio(arr, fin+1);
            if(ini<MAX){
                fin = obtenerFin(arr, ini);
                if(cumple(arr,ini,fin,N,M)){
                    mostrar(arr,ini, fin);
                    cumpleSec = true;
                }
            }
        }

    }
    public static boolean cumple(double [] arr, int ini, int fin, int N, double M){
        if((fin-ini+1)>=N && promedio(arr,ini,fin)>M){
            return true;
        }
        return false;
    }
    public static double promedio(double [] arr, int ini, int fin){
        double suma = 0.0;
        while(ini<=fin){
            suma += arr[ini];
            ini++;
        }
        return (suma/(fin-ini+1));
    }
    public static void mostrar(double [] arr, int ini, int fin){
        for(int i = ini; i <=fin; i++){
            System.out.print("|" + arr[i]);
        }
    }
    public static int obtenerInicio (double [] arr, int pos){
        while(pos<MAX && arr[pos]==SEP){
            pos++;
        }
        return pos;
    }
    public static int obtenerFin(double [] arr, int pos){
        while(pos<MAX && arr[pos]!=SEP){
            pos++;
        }
        return pos-1;
    }
}
