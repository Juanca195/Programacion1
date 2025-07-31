package Practica2;
/*Escribir un programa que mientras el usuario ingrese un caracter
distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
si es carácter vocal minúscula.
 */

public class ejercicio_7tp2 {
    public static void main(String[] args) {
        final char carac = '*';
        char caracteingresado;

        System.out.println("Ingrese un caracter");
        caracteingresado = Utils.leerChar();

        while(caracteingresado != carac) {
            //.out.println("El caracter es: " + caracteingresado);

            if(caracteingresado >= '0' && caracteingresado <= '9'){
                System.out.println("El caracter es digito");
            }

            else if (caracteingresado == 'a' || caracteingresado == 'e' || caracteingresado == 'i' || caracteingresado == 'o' || caracteingresado == 'u' ){
                System.out.println("El caracter es vocal minuscula: " + caracteingresado);
            }
            caracteingresado++;
           
        }

         System.out.println("El caracter es: " + caracteingresado);
    }
}
