package Practica2;
/*Escribir un programa que mientras el usuario ingrese un
caracter letra minúscula, acumule la cantidad de vocales que
ingresó. Finalmente muestre por pantalla dicha cantidad.*/

public class ejercicio_11tp2 {
    public static void main(String[] args) {
         char letra ;
         int vocales = 0;

        //System.out.println("Ingrese un caracter letra minuscula");
        //letra = Utils.leerChar();

        for(letra = 'a'; letra <= 'z'; letra++){
            System.out.println("Ingrese un caracter letra minuscula");
            letra = Utils.leerChar();
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                vocales++;   
            }
            
        }
        System.out.println("Cantidad de vocales son: " + vocales);
    }
}
