public class ArregloSecuencias4 {

    final static int MAX = 12;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arreglo = {0,-8,4,-2,0,-10,0,0,1,25,3,0};
        mostrarArreglo(arreglo);
        int inicio = 0;
        int fin = -1;
        int tamanio = 0;
        int cantEliminados = 0;
        // Recorrer secuencia a secuencia el arreglo
        while (inicio < MAX) {
            // Buscar el inicio de la secuencia
            inicio = buscarInicio(arreglo, fin + 1);
            // Si el inicio es valido
            if (inicio < MAX) {
                //  Buscar el fin de la secuencia
                fin = buscarFin(arreglo, inicio);
                // Inicio y fin valido -> procesarla
                tamanio = fin - inicio + 1;
                // Si el tamaño es impar y tiene al menos un multiplo de 2
                if (tamanio % 2 != 0 && tieneElementoPar(arreglo, inicio, fin)) {
                    // Eliminar los negativos de la secuencia
                    cantEliminados = eliminarNegativos(arreglo, inicio, fin);
                    // MODIFICAR el FIN
                    fin = fin - cantEliminados;
                }
            }
        }

        mostrarArreglo(arreglo);

    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < MAX; i++)
            System.out.print(" | " + arreglo[i]);

        System.out.println();
    }

    public static int eliminarNegativos(int[] arreglo, int ini, int fin) {
        // Eliminar todos los elementos negativos del arreglo
        // Debe informar cuandos "modificaciones" realizo
        // NO PUEDO USAR EL FOR PQ NECESITO MODIFICAR LA VARIABLE DE CONTROL
        /*for (int i = ini; i <= fin; i++) {
            if (arreglo[i] < 0) {
                corrimientoAIzquierda(arreglo, i);
                fin--;
                i--; NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
            }
        }*/
        int cant = 0;
        while (ini <= fin) {
            if (arreglo[ini] < 0) {
                corrimientoAIzquierda(arreglo, ini);
                fin--;
                cant++;
            }
            else {
                ini++;
            }
        }

        return cant;
    }

    public static void corrimientoAIzquierda(int[] arreglo, int pos) {
        for (int i = pos; i < MAX - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }

    }

    public static boolean tieneElementoPar(int[] arreglo, int ini, int fin) {
        // Retornar true si existe al menos UN elemento par
        // No pasarme de los limites de la secuencia
        // y no encuentro lo que busco (elemento par), avanzo
        int i = ini;
        while (i <= fin && arreglo[i] % 2 != 0) {
            i++;
        }

        // 2 alternativas:
        // Salgo del while por i<=fin -> i > fin -> todos los elementos son impares -> FALSE
        // Salgo del while por arreglo[i] % 2 != 0 -> encontre un elemento par -> TRUE
        if (i <= fin)
            return true;
        else
            return false;

        // return i <= fin;
    }

    public static int buscarInicio(int[] arreglo, int pos) {
        // Mientras no me caigo del arreglo y
        // donde estoy parado sea un separador
        while (pos < MAX && arreglo[pos] == SEPARADOR) {
            pos++;
        }

        return pos;
    }

    public static int buscarFin(int[] arreglo, int pos) {
        // Mientras haya elementos en el arreglo
        // donde estoy NO sea un separador (estoy arriba de la secuencia)
        while (pos < MAX && arreglo[pos] != SEPARADOR) {
            pos++;
        }

        return pos - 1;
    }

}
