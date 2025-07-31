package Practica3;
    //Obtener  un caracter 
    //Si es minuscula 
      // Imprilir la tabla del 9

public class ejercicio_6tp3 {
    final static char minMinuscula = 'a', maxMinuscula = 'z';
    public static void main(String[] args) {
        
        System.out.println("Ingrese un caracter ");
        char caracter = Utils.leerChar();

        while (caracter >= minMinuscula && caracter <= maxMinuscula) {
            int tabla = tabladel9();
            System.out.println(tabla);
            System.out.println("Ingrese un caracter ");
            caracter = Utils.leerChar();
        }
    }
    private static int tabladel9() {
        int resultado = 0;
        int numero = 9;
        for(int i = 1; i <= 10; i++){
            System.out.println("La tabla del nueve es: " + (numero * i));
        }
        return resultado;
    }
}
