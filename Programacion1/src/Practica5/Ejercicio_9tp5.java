package Practica5;
/*Dado un arreglo de caracteres, determinar si en el arreglo existe al
menos una letra repetida. */
 //Determinar un arreglo de caracteres 
  //determinar si existe al menos una letra repetida

public class Ejercicio_9tp5 {
    final static char MAX = 10;

    public static void main(String[] args) {
        char [] caracter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i','j'};
        boolean Existe = existeLetrarepetida(caracter);
        System.out.println("Existen letras repetidas: " +Existe);
        mostrarArreglo(caracter);
    }

    private static boolean existeLetrarepetida(char [] caracter) {
        boolean existe = false;
        for(int i = 0; i < MAX-1; i++){
            if(caracter[i] == caracter[i +1]){
                return existe = true;
            }
        } 
        return existe;

    }

    private static void mostrarArreglo(char[] caracter) {
        for(int pos = 0; pos < MAX; pos++){
            System.out.print("|" + caracter[pos]);
        }
    }
}
