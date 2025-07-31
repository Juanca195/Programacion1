package PracticaParciales;
/*
 * se almacena en un arreglo M de tamaño MAXM el número de
    legajo de los inscriptos a cada una de las materias.
    Para separar cada materia, se utiliza uno o más ceros
    (dado que ningún alumno posee un cero como número de legajo)
    //NOTA: Una secuencia del arreglo es la materia y los elementos los numeros de legajo.
     La capacidad se almacena en un arreglo A de tamaño MAXA ordenado ascendentemente. En este
        arreglo, el valor almacenado en la posición i se corresponde con la capacidad del aula número i. 
        Se pide implementar un programa en Java que asigne a cada materia almacenada en el arreglo M, un aula
            del arreglo A. La asignación debe realizarse en el orden en que aparecen las materias en el arreglo M y
            considerando, una asignación eficiente del espacio, esto es, el aula asignada debe ser aquella que deje
            menos cantidad de lugares sin ocupar (y que ya no haya sido asignada). Para indicar que un aula ya ha sido
            asignada, la capacidad debe ser cambiada por el valor original pero negativo. Una vez realizada la asignación
            se debe eliminar la secuencia del arreglo M. En caso de no existir un aula disponible con la capacidad
            necesaria, se debe informar que no se pudo asignar y se debe conservar la secuencia.
 */
public class EjercicioTipoparacial_3 {
    final static int MAXM = 20;
    final static int MAXA = 3;
    final static int SEP = 0;

    public static void main(String[]args){
        int [] M = {0,0,34,2,12,25,0,32,55,12,3,88,14,0,0,17,36,19,0,0};
        int [] A = {2, 3, 6};

        int ini =0; 
        int fin = -1;
        int posA = 0;
        int cantElementos =0;
        while (ini<MAXM) {
            ini = obtenerInicio(M, fin+1);
            if (ini<MAXM) {
                fin = obtenerFin(M, ini);
                cantElementos = fin-ini+1;
                posA = buscarPosA(A,cantElementos);
                  if(posA !=-1){
                    A[posA]= -A[posA];
                    eliminarSec(M,ini,fin);
                    fin = ini;
                  }
                    else{
                    System.out.println("No se pudo aisgnar");
                    }
            }
        }
        mostrarArregloA(A);
        System.out.println("");
        mostrarArregloM(M);
    }
    public static int buscarPosA (int [] A, int cantElementos){
        int pos = 0;
        while(pos < MAXA && A[pos]<cantElementos){
            pos++;
        }
        if(pos < MAXA){
            return pos;
        }
        else {
            return -1;
        }
    }
     public static int obtenerInicio(int[] arreglo, int pos){
        while (pos<MAXM && arreglo[pos]==SEP) {
            pos++;
        }
        return pos;
    }
    public static int obtenerFin(int [] arreglo, int pos){
        while (pos<MAXM && arreglo[pos]!=SEP) {
            pos++;
        }
        return pos-1;
    }
    public static void eliminarSec(int [] M, int ini, int fin){
        int cantdiad = fin-ini+1;
         for(int i = 0; i < cantdiad; i ++){
            corrimientoIzquierda(M, ini);
         }
    }
    public static void corrimientoIzquierda(int [] M, int ini){
        for(int i = ini; i< MAXM-1; i++){
            M[i]= M[i+1];
        }
    }
    public static void mostrarArregloM(int [] M){
        for(int i = 0; i <MAXM; i++){
            System.out.print("|" + M[i]);
        }
    }
    public static void mostrarArregloA(int [] A){
        for(int i = 0; i <MAXA; i++){
            System.out.print("|" + A[i]);
        }
    }
}
