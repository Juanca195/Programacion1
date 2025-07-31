package PracticaParciales;
//Ventas de supermercado online
  //Definir el arreglo P, este va a tener los pedidos
  //Definir el arreglo T, este va a tener al menos un valor almacenado del arreglo P
   //Definir el producto promocional R que podria ser agregado por el usuario o definido por extencion
     //Hay que definir una cantidad C que va a ser la cantidad de prodcutos promocionados

public class Ejercicio_4tipoparcial {
    final static int MAXP = 25; 
    final static int MAXT = 2;
    final static int SEP = 0;

    public static void main(String[] args) {
        int [] arrP = {0,0,12,9,18,0,15,5,4,7,10,0,8,9,12,0,19,10,9,0,0,0,0,0,0};
        int [] arrT = {8,9};
        int producto = 22;
        int cantidC = 4;

        int ini = 0; 
        int fin = -1;

        while(ini<MAXP && cantidC > 0){
            ini = obtenerInicio(arrP, fin+1);
            if(ini<MAXP){
                fin = obtenerFin(arrP, ini);
                if(hayElemento(arrP, arrT, ini, fin)){
                    agregarProducto(arrP,producto,ini, fin);
                    cantidC--;
                }
            }
        }
        mostrarArreglo(arrP);
        System.err.println("");
        System.out.println("cantidad de ellemtos por agregar: " +cantidC);
    }
    public static void mostrarArreglo(int [] arrP){
        for(int i = 0; i <MAXP; i++){
            System.out.print("|" + arrP[i]);
        }
    }
    public static boolean hayElemento(int [] arrP, int [] arrT, int ini, int fin){
        boolean hayElementos = false;
        while (ini<MAXP && ini <= fin  && !hayElementos) {
           if(elememtoIgual(arrT, arrP[ini])){
             hayElementos = true;
           }
            ini++;
        }
        return hayElementos;
    }
    public static boolean elememtoIgual(int [] arrT, int valorProducto){
        int pos = 0;
        boolean hayElemento = false;
        while(pos <MAXT && !hayElemento && arrT[pos]<=valorProducto){
            if (arrT[pos] == valorProducto) {
                hayElemento = true;
            }
            pos++;
        }
        return hayElemento;

    }
    public static void agregarProducto(int [] arrP, int producto,int ini, int fin){
            correrDerecha(arrP, fin+1);
            arrP[fin+1]= producto;
    }
    public static void correrDerecha(int [] arrP, int pos){
        for(int i = MAXP-1; i > pos; i--){
            arrP[i]= arrP[i-1];
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
