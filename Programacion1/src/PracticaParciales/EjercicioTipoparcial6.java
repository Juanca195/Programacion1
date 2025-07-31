package PracticaParciales;

public class EjercicioTipoparcial6 {
    final static int MAXP = 28;
    final static int MAXR = 2;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arrP = { 0, 0, 9, 12, 18, 0, 1, 5, 43, 73, 88, 0, 8, 9, 52, 0, 1, 10, 90, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] arrR = { 44, 6};

        int ini = 0;
        int fin = -1;
        int contador = 0;

        // Cantidad limitada de productos a regalar
        int cantLimite = 2 * MAXR;
        int cantPedidosSinRegalo = 0;

        while (ini < MAXP) {
            ini = buscarInicio(arrP, fin + 1);
            if (ini < MAXP) {
                fin = buscarFin(arrP, ini);
                // Tengo una secuencia valida entre ini y fin
                if (contador < cantLimite) {
                    insertarRegalos(arrP, ini, fin, arrR);
                    contador += MAXR; // Cuenta todos los productos regalados
                    // contador++; // Cuenta los pedidos en los cuales agregue productos
                    fin = fin + MAXR;
                }
                else
                    cantPedidosSinRegalo++;
            }
        }
        System.out.println("La cantidad de productos regalados fue: " + contador);
        System.out.println("La cantidad de pedidos sin regalos fue: " + cantPedidosSinRegalo);  // Agregado fuera de enunciado
        mostrarArreglo(arrP);
    }

    public static void insertarRegalos(int[] arrP, int ini, int fin, int[] arrR) {
        // Recorrer cada elemento del arreglo R
        for (int i = 0; i < MAXR; i++) {
            //   Insertar ordenado en la secuencia
            insertarOrdenado(arrP, ini, fin, arrR[i]);
            fin++;
        } 
    }

    public static void insertarOrdenado(int[] arr, int ini, int fin, int valor) {
        // Buscar posicion donde insertar
        int posAInsertar = buscarPosicion(arr, ini, fin, valor);
        // Correr a derecha
        correrADerecha(arr, posAInsertar);
        // Insertar valor
        arr[posAInsertar] = valor;
    }

    public static int buscarPosicion(int[] arr, int ini, int fin, int valor) {
        // Mientras no me caiga de la secuencia y donde estos parado sea menor a valor, avanzo
        while (ini <= fin && arr[ini] < valor)
            ini++;

        // que retorno???
        return ini;
    }

    public static void correrADerecha(int[] arr, int pos) {
        for (int i = MAXP - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
    }

    public static int buscarInicio(int[] arreglo, int pos) {
        while (pos < MAXP && arreglo[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arreglo, int pos) {
        while (pos < MAXP && arreglo[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAXP; i++)
            System.out.print(" | " + arr[i]);
        System.out.println();
    }

}
