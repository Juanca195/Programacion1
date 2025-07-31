package PracticaParciales;

public class EjecicioTipoParcialBobino {
    /*
     * Ejercicio tipo parcial
     * Un dispositivo que lleva un animal bovino en su cuello recolecta datos de un
     * acelerómetro en tres ejes: X Y Z. Cada toma de datos se representa como una
     * secuencia de valores enteros entre 0 y 1023 para cada eje, las secuencias
     * están separadas por -1 (valor no válido para esta lógica). El productor
     * quiere conocer cómo se ha comportado su animal en el transcurso del día y
     * para ello ingresa un patrón de aceleración X Y Z y una cantidad N de
     * repeticiones. Un patrón que se repite una cierta cantidad de veces
     * consecutivas significa que el animal puede estar pastoreando, caminando,
     * rumiando, etc. Dado un valor N y el patrón X Y Z en un arreglo inicializado
     * con -1 (de tamaño igual al arreglo que tiene los datos), hacer un programa en
     * JAVA que:
     * - Compruebe si el patrón se repitió N o más veces y si es así que elimine del
     * arreglo las secuencias que se siguen repitiendo consecutivamente luego de la
     * cantidad N. Por ejemplo, si tenemos el siguiente arreglo de datos:
     * -1 12 22 44 -1 23 34 55 -1 23 34 55 -1 23 34 55 -1 23 34 57 -1
     * El arreglo patrón X Y Z a analizar es X=23, Y=34, Z=55 y el N=2
     * -1 -1 -1 -1 -1 -1 -1 -1 23 34 55 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
     * El arreglo resultante sería
     * -1 12 22 44 -1 23 34 55 -1 23 34 55 -1 -1 23 34 57 -1 -1 -1 -1
     * 
     */
    final static int maxA = 21;
    final static int N = 2;

    public static void main(String[] args) {

        int ini = 0;
        int fin = -1;
        int limite_de_N = 0;

        int[] Arreglo = { -1,12,22,44,-1,23,34,55,-1,23,34,55,-1,23,34,55,-1,23,34,57,-1};
        int[] ArregloP = { -1, -1, -1, -1, -1, -1, -1, -1, 23, 34, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        mostrarArreglo(Arreglo);
        while (ini < maxA) {
            ini = BuscarInicio(Arreglo, fin + 1);
            fin = BuscarFin(Arreglo, ini);
            if (esPatron(Arreglo, ini, fin, ArregloP)&&limite_de_N<N) {
                eliminarSecuencia(Arreglo, ini, fin);
                limite_de_N++;
            }
        }
        mostrarArreglo(Arreglo);

    }
    public static void eliminarSecuencia(int[] arr,int ini,int fin) {
        for(int i=ini;i<=fin;i++){
            corrimientoIzquierda(arr, ini);
        }
    }

    public static int BuscarInicio(int[] arreglo, int pos) {
        while (pos < maxA && (arreglo[pos] == -1)) {
            pos++;
        }
        return pos;
    }
    public static int BuscarFin(int[] arreglo, int pos) {
        while (pos < maxA && (arreglo[pos] != -1)) {
            pos++;
        }
        return pos - 1;
    }
    public static void corrimientoIzquierda(int[] arreglo, int ini) {       
        for (int i = ini; i < maxA -1; i++) {
            arreglo[i] = arreglo[i + 1];
        }

    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < maxA; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println(".");
    }

    public static boolean esPatron(int[] arr, int iniA, int finA, int[] arrP) {

        boolean condi = false;
        int iniP = 0;
        int finP = -1;
        iniP = BuscarInicio(arrP, finP + 1);
        finP = BuscarFin(arrP, iniP);
        int tamanioA = (finA - iniA + 1);
        int tamanioP = (finP - iniP + 1);

        if (tamanioA == tamanioP) {
            while (iniA < finA && iniP<finP && !condi) {
                if (arr[iniA] == arrP[iniP]) {
                    condi = true;
                } else {
                    condi = false;
                }
                iniA++;
                iniP++;
            }
        } else {
            condi = false;
        }
        return condi;
    }

}
