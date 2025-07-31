package Practica2;
/*Construir un programa que solicite desde teclado un número de
mes válido y posteriormente notifique por pantalla la cantidad de
días de ese mes. En el caso de que ingrese 2 como número de
mes (febrero) deberá además solicitar ingresar un número de año
entre 2000 y 2024 inclusive (no debe seguir si no está en ese
rango), y dependiendo de si es bisiesto o no imprimir la cantidad
de días correspondiente.
 */

public class Ejercicio_19tp2 {
    public static void main(String[] args) {
        int mes = 1; 
        int anio; 
        
        System.out.println("Ingrese un mes valido");
        mes = Utils.leerInt();

        for(mes = 1; mes <=12; mes++){
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
                    System.out.println("Ingrese un anio entre 2000 y 2024");
                    anio = Utils.leerInt();

                    if((anio >= 2000 && anio <= 2024)&&(anio % 4==0)&&(anio %100==0)||(anio %400==0)){
                        System.out.println("El mes: " +mes+ "tiene 29 dias");
                    }
                    else {
                        System.out.println("El mes: " +mes+ " tiene 28 dias");
                    }
                    break;
                }
            
                default:System.out.println("No es mes valido");
                    break;
            }
        }
    }
}
