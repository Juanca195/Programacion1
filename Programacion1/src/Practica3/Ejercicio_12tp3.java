package Practica3;
/*Escribir un programa que simule 1000 lanzamientos de un dado
y muestre por pantalla cuántas veces salió el valor del dado
correspondiente al número entero N ingresado por el usuario.
Considerar que el valor N ingresado se corresponda a un valor
posible para un dado. Usar la sentencia Math.random() que
devuelve un valor aleatorio real entre 0 y 1.
Para asignar un posible valor a la variable dado entero:
dado = (int) (6*Math.random() + 1)
 */
    //crear una contante con la cantidad de lanzamientos
    //obtener un numero entero N(Entre 1 y 6)
    //En base a lo ingreso, mostra la cantidad de veces que salio ese numero
     


public class Ejercicio_12tp3 {
    final static int MAXlanzamientos = 1000;
    public static void main(String[] args) {
        System.out.println("Ingresar un numero entero entre 1 y 6");
        int numero= Utils.leerInt();

        while(numero <= 6){
            int CantNum = calcularCantVeces(numero);
            System.out.println("Cantidad de numero es: " + CantNum);

            System.out.println("Ingrear otro numero entre 1 y 6");
            numero = Utils.leerInt();
        }
    }
    private static int calcularCantVeces(int numero) {
        int cant = 0;
        for(int i = 1; i <= MAXlanzamientos; i++){
            int dado = (int) (6*Math.random() + 1);
            if(dado == numero){
                cant ++;
            }
        }
        return cant;
    }
}
