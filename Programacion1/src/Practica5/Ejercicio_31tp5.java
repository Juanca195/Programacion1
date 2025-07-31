package Practica5;
/*Hacer un programa que invierta el orden de la última secuencia
en un arreglo. */
        //definir arreglo
         //Definir inicio y fin 
          //guardar el ultimo inicio de la ultima secuencia y el ultimo fin
          //invertir la ultima secuencia 
          // mostrarArreglo
    //CONSULTAR POR QUE NO ME FUNCIONA COMO QUIERO
public class Ejercicio_31tp5 {
    final static int MAX = 20;
    final static int SEPARADOR =0;

    public static void main(String[] args) {
        int[] arreglo = {0,4,6,8,7,0,7,11,10,0,4,5,6,9,0,0,12,13,14,0};

        int inicio = 0; 
        int fin = -1;
        int iniUltimaSec = -1;
        int finUltimaSec = -1;

        while (inicio<MAX) {
            inicio = obtenerInicio(arreglo, fin+1);
            if (inicio<MAX) {
                fin = obtenerFin(arreglo, inicio);
                iniUltimaSec=inicio;
                finUltimaSec=fin;
                invertirUltimaSec(arreglo, iniUltimaSec, finUltimaSec);
            }  
        }
        System.out.println("ultimo inicio: " +iniUltimaSec+  " Ultimo fin: " +finUltimaSec);
        mostrarArreglo(arreglo);
    }
    public static void invertirUltimaSec(int [] arreglo, int iniUltimaSec, int finUltimaSec){//ME INVIERTE SOLO LOS DOS PRIMEROS DE LA SECUENCIA Y EL ULTIMO NO.
            int aux ;                                                               //CONSULTAR
        for(int i = iniUltimaSec; i <= finUltimaSec; i++){
            aux = arreglo[iniUltimaSec];
            arreglo[iniUltimaSec] = arreglo[finUltimaSec];
            arreglo[finUltimaSec] = aux;
        }
    }
    public static void mostrarArreglo(int [] arreglo){
        for(int i= 0; i <MAX; i++ ){
            System.out.print("|" + arreglo[i]);
        }
    }
    public static int obtenerInicio(int[] arreglo, int pos){
        while (pos<MAX && arreglo[pos]==SEPARADOR) {
            pos++;
        }
        return pos;
    }
    public static int obtenerFin(int [] arreglo, int pos){
        while (pos<MAX && arreglo[pos]!=SEPARADOR) {
            pos++;
        }
        return pos-1;
    }  

}
