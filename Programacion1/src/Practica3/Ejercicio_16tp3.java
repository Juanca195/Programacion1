package Practica3;
/*Escribir un programa que mientras el usuario ingresa un
número de mes (entero) entre 1 y 12 inclusive, muestre por
pantalla la cantidad de días del mes ingresado (suponer febrero
de 28 días) (Mostrar por pantalla la cantidad de días del mes
debería realizarse con un método).
 */
    // Obtener un numero de mes
     // si esta entre 1 y 12 
     //mostrar la cantidad de dias 
 
public class Ejercicio_16tp3 {
    public static void main(String[] args) {
        System.err.println("Ingrese un numero de mes ");
        int mes= Utils.leerInt();

        while(mes>1 && mes <12){
            MostraCantdias(mes);

            System.out.println("Ingrese un numero de mes");
            mes = Utils.leerInt();
        }
    }

    private static void MostraCantdias(int mes) {
        switch (mes) {

            case 1: case 3: case 5: case 8: case 10: case 12:{
                System.out.println("El mes: " +mes+ " tiene 31 dias");
                break;
            }
            case 4: case 6: case 7: case 9: case 11:{
                System.out.println("El mes: " +mes+ " tiene 30 dias");
                break;
            }
            case 2:{
                System.out.println("El mes: " +mes+ "tiene 28 dias");
                break;
            }
            default: System.out.println("El numero ingresado no es un numero de mes");
                break;
        }
        
    }
}
