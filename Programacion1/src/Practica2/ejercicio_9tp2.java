package Practica2;
/* Escribir un programa que mientras que el usuario ingrese un
carácter dígito o carácter letra minúscula, imprima si es carácter
dígito o carácter letra minúscula, y si es letra minúscula imprimir si
es vocal o consonante.
 */

public class ejercicio_9tp2 {
    public static void main(String[] args) {
            char caracter = ' ' ;

            System.out.println("Ingrese un caracter digito o letra minuscula");
            caracter = Utils.leerChar();

            if(((caracter >= '0')&&(caracter <='9'))||((caracter >= 'a') && (caracter <= 'z'))) {
                if(caracter >= '0' && caracter <= '9'){
                    System.out.println("El caracter es digito: " + caracter);
                } 
                else if((caracter >= 'a') && (caracter <= 'z')){
                    System.err.println("Es letra minuscula: " + caracter);

                    switch (caracter) {
                        case 'a': case 'e': case 'i': case 'o': case 'u':
                            System.out.println("Es una vocal");
                            break;
                        default:System.out.println("Es una consonante");
                            break;
                    }
                }
            }
          
    }
}
