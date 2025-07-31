package Practica2;
/*Pedir números enteros positivos por teclado. En cada iteración
el usuario puede ingresar 0 para salir del programa. Si ingresa un
número distinto de 0 se debe pedir el ingreso de un carácter.
a. Si es ‘a’ se debe permitir al usuario escribir un texto libre e
imprimirlo por pantalla.
b. Si es ‘b’ se deben pedir 5 números positivos e informar si
fueron ingresados en orden ascendente.
c. Si es ‘c’ se deben pedir dos números enteros negativos e
imprimir la raíz cuadrada de su multiplicación. La raíz
cuadrada de un número se calcula con la sentencia:
Math.sqrt(numero).
d. Ante cualquier otro carácter ingresado se debe informar un
error y pedir nuevamente el carácter. */

public class ejercicio_20tp2 {
    public static void main(String[] args) {
        int entero = 0;
        char carácter = ' ';
        String texto; 
        int numerob =0;

        System.out.println("Ingrese un numero entero positivo");
        entero = Utils.leerInt();

        while(entero !=0){
            System.out.println("Ingrese un caracter");
            carácter = Utils.leerChar();

            if(carácter == 'a'){
                System.out.println("Ingrese un texto");
                texto = Utils.leerString();

                System.out.println("El texto es: " +texto);
            }
            if(carácter == 'b'){
                for(int i = 1; i <= 5; i++){
                    System.out.println("Ingrese un numero");
                    numerob = Utils.leerInt();

                    if(numerob >= 0){
                        System.err.println("Los numeros ingresados estan en orden ascendente: " +numerob);
                    }
                    else{
                        System.out.println("Los numeros estan en orden desendente: " +numerob);
                    }
                }
            }
            if(carácter == 'c'){
                int numerosN1 = 0;
                int numeroN2 = 0;
                int multiplicación = 0;

                System.out.println("Ingress un numero negativo");
                numerosN1 = Utils.leerInt();
                System.err.println("Ingrese otro numero negativo");
                numeroN2 = Utils.leerInt();

                multiplicación = numerosN1*numeroN2;

                System.out.println("La raiz de la multiplacion es: " + Math.sqrt(multiplicación));

            }
            else {
                System.err.println("error de ingreso");
            }
        }
    }
}
