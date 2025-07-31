package Practica3;

public class Ejercicio_5tp3 {
    public static void main(String[] args) {
        final int MAX = 4;
        int numero = obtenerNumero();
        incrementarNUm(numero, MAX);
        
        System.out.println("Se termino");
    }
    private static int incrementarNUm(int numero, int MAX) { 
        int numeroIncrementado = 0;
        for (numero = 1; numero <= MAX; numero++) {
            System.out.println("Incrementado: " + numero);
        }
        return numeroIncrementado;
    }
    private static int obtenerNumero() {
        int numero = 0;
        System.out.println("Ingrese un numero");
        numero = Utils.leerInt();

        return numero;
    }
}
