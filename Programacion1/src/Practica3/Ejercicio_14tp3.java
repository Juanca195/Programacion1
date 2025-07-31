package Practica3;
/*Escribir un programa que mientras el usuario ingresa un
carácter distinto del carácter ‘*’, invoque a un método que imprima
si es carácter dígito o carácter letra minúscula, y si es letra
minúscula imprimir si es vocal o consonante. */

//Obtener un carcater 
  //Mientras caracter sea  distinto 
   //Imprimir si el caracter es digito o caracter letra minuscula
    // si es letra minuscula 
    // imprimir si es vocal o consonte 
public class Ejercicio_14tp3 {
    final static char Car = '*', digMin = '0', digMax = '9', minculaMin = 'a', minusculaMax = 'z';
    public static void main(String[] args) {
        System.out.println("Ingrese un caracter");
        char carcater = Utils.leerChar();

        while (carcater != Car) {
            tipoDecaracter(carcater);
            System.out.println("Ingrese un caracter");
            carcater = Utils.leerChar();

        }
    }
    private static void tipoDecaracter(char carcater) {
        if(carcater >=digMin && carcater <= digMax){
            System.out.println("El caracter es digito: " +carcater);
        } else if(carcater >= minculaMin && carcater <= minusculaMax){
            System.out.println("El caracter es letra Minuscula: " +carcater);
                switch (carcater) {
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                        System.out.println("Es vocal: " +carcater);
                        break;
                    default: System.out.println("Es consonante");
                        break;
                }
            }
                
    }
}
