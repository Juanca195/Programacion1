package Practica3;
/*Escribir un programa que mientras el usuario ingrese un caracter
distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
si es carácter vocal minúscula. */
//Obtener un caracter 
 // verificar si el caracter es distinto a '*'
  // mostrar si es digito o vocal minuscula 


public class Ejercicio_7tp3 {
    final static char carac= '*', digitoMin = '0', digitoMax='9';
     public static void main(String[] args) {

        System.out.println("Ingrese un caracter");
        char caracter = Utils.leerChar();

        while (caracter != carac) {
            verificarCaracter(caracter);
            System.out.println("Ingrese un caracter");
            caracter = Utils.leerChar();
        }
     }
     public static void verificarCaracter(char caracter) {
        if(caracter >= digitoMin && caracter <= digitoMax ){
            System.out.println("Es caracter digito: " + caracter);
        }else if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
            System.out.println("Es caracter vocal minuscula: " +caracter);
        }else{
            System.out.println("Es otro caracter");
        }
     }
}
