package Practica2;
/*  Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
‘a’ seguidas que se ingresaron. */

public class ejercicio_16tp2 {
    public static void main(String[] args) {
        char caracter = ' '; 
        final int cantMIN = 1;
        final int cantMAX = 15;
        int cant = 0;
        
       // while(cantMIN <= cantMAX){
            //System.out.println("Ingrese un caracter");
            //caracter = Utils.leerChar();
            for(int i = cantMIN; i <= cantMAX; i++){
                System.out.println("Ingrese un caracter");
                caracter = Utils.leerChar();
                if(caracter == 'a'){
                    cant++; 
                }
                if(cant > 2 && cant < 15){
                    System.out.println("La mayor cantidad de a seguidas es: " + cant);
                }
            }
            System.out.println("cantidad de a es: " + cant);
       // }
        
    }
}
