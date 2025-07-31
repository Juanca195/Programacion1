package Practica5;
/*Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también.
 */
    //Cargar un arreglo de caracteres de tamaño 10
    // mostra las posisiciones del elemento 
      // controlar si esta o no

public class Ejercicio_4tp5 {
    final static char MAX = 10;
    public static void main(String[]args){
        char[] caracter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char car = obtenerCaracter();
        int pos = obtenerPos(caracter, car);
        if(pos<MAX){
            System.out.println(car + " esta en la posicion: " +pos);
        }
        else{
            System.out.println("No existe: " +car);
        }
    }
    public static int obtenerPos(char[] caracter, char car) {
        int pos = 0; 
        while((pos<MAX) && (caracter[pos]!=car)){
            pos++;
        }
        return pos;
    }
    public static char obtenerCaracter() {
        char caracter = ' ';
        System.out.println("ingrese un caracter");
        caracter = Utils.leerChar();
        return caracter;
    }
}
