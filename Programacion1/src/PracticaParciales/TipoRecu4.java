package PracticaParciales;

public class TipoRecu4 {
    final static int MAXFILA = 4;
    final static int MAXCOLUMNA = 15;

    public static void main(String [] args){
        int[][] matriz = {
            {0, 625, 815, 900, 0, 562, 952, 300, 0, 365, 169, 254, 0, 0, 0},
            {0, 958, 62, 57, 221, 0, 596, 623, 600, 0, 587, 889, 984, 0, 0},
            {0, 0, 700, 257, 0, 0, 0, 854, 958, 388, 0, 954, 842, 925, 0},
            {0, 988, 899, 874, 0, 254, 258, 652, 200, 0, 568, 958, 210, 0, 0}
        };
        procesarMatriz(matriz);
    }

    public static void procesarMatriz(int [][] mat){
        int cantidadQueCumplen = 0;
        for (int fila = 0; fila < MAXFILA; fila++) {
            //si la fila (dia) cumplio que los promedios son ascendentes
            if (esPromediovalido(mat[fila])) {
                System.out.println("La fila " + fila + " cumple con promedio ascendentemente");
                cantidadQueCumplen++;
            } else {
                System.out.println("La fila " + fila + " NO cumple");
            }
        }

        if (cantidadQueCumplen >= 2) {
            System.out.println("2 filas cumplen que son crecientes");
        } else {
            System.out.println("Ningun fila cumple que sea creciente");
        }
    }

    public static boolean esPromediovalido(int [] arr){
        int inicio = 0;
        int fin = -1;
        boolean flag = true;
        //promedio en -1 para que ingrese al if y cambie el valor actual asi luego se compara 
        double promedioActual = -1;
        double promedioSiguiente;

        while(inicio < MAXCOLUMNA){
            inicio = buscarInicio(arr, fin+1);
            if(inicio < MAXCOLUMNA){
                fin = buscarFin(arr, inicio);
                int total = fin - inicio + 1;
                //busco el primer promedio en promedioSiguiente
                promedioSiguiente = promedioVentaDia(arr, inicio, fin, total);

                //todavia no tengo promedioActual
                if(promedioActual == -1){
                    //si no tengo, el primer promedio x de la secuencia que guarde
                    //en promedioSiguiente, lo guardo ahora en promedioActual
                    promedioActual = promedioSiguiente;
                    //si promedioActual >= promedioSiguiente retorno false
                }else if(promedioActual >= promedioSiguiente){
                    flag = false;
                    //si no, es decir que el promedioActual es <= (creciente) 
                    //actualizo, y sigo buscando
                }else{
                    promedioActual = promedioSiguiente;
                }
            }
        }
        return flag;
    }

    public static double promedioVentaDia(int [] arr, int inicio, int fin, int total){
        double suma = 0;
        while(inicio <=fin){
            suma += arr[inicio];
            inicio++;
        }
        return suma / total;
    }

    public static int buscarInicio(int[] arr, int pos){
        while(pos < MAXCOLUMNA && arr[pos] == 0){
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos){
        while(pos < MAXCOLUMNA && arr[pos] != 0){
            pos++;
        }
        return pos - 1;
    }
}

