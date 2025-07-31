package Practica3;
/*Realizar un programa que, dada una opción entera (1,2,3,4),
permita realizar operaciones entre tres números reales (r1,r2,r3)
ingresados desde teclado. Para la opción:
1. Calcular la raíz cuadrada de (r1-r3)
2. Calcular el promedio de r1, r2 y r3
3. Calcular cociente de la raíz cuadrada de (r3 - r2) dividida por
r1
4. Calcular el cociente del promedio de los tres valores dividido
por la raíz cuadrada de r2
Observación: La raíz cuadrada de un número se calcula con la
sentencia: Math.sqrt(numero). Hacer uso del diseño descendente
y de la modularización para la solución. Tener en cuenta posibles
errores o excepciones como la división por cero. */

//Obtemer 3 numeros enteros r1 r2 y r3
//si son numeros validos
    // calcular la raiz cuadrada de r1 y r2
    // calcular el promedio de los 3 numeros 
    //cacular el cociente de r3 y r2 dividia por r1
    // calcular el cociente del promedio de los tres valores por la raiz caudrada de r2


public class Ejercicio_13tp3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero");
        double r1 = Utils.leerDouble();
        System.out.println("Ingrese un numero entero");
        double r2 = Utils.leerDouble();
        System.out.println("Ingrese un numero entero");
        double r3 = Utils.leerDouble();

        System.out.println("Ingrese una opcion");
        int opcion = Utils.leerInt();
        while(opcion <= 4){
            switch (opcion) {
            case 1: 
                calcularRaizcuadrada(r1, r3);
                break;
            case 2: 
                calcularPromedio(r1, r2,r3);
                break;
            case 3:    
                calcularCociente(r1, r2 , r3);
                break;
            case 4: 
                calcularCocientePromedio(r1, r2, r3);
                break;

            default: System.err.println("Ingrese opcion valida");
                break;
            }
            System.out.println("Ingrese un opcion");
            opcion = Utils.leerInt();
        }
        
    }
   //Metodo para calcular el cociente de la raiz cuadrada
    private static void calcularCociente(double r1, double r2, double r3) {
        double resultado = r3 - r2;
        if (resultado < 0) {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
        } else if (r1 == 0) {
            System.out.println("Error: División por cero.");
        } else {
            double cociente = Math.sqrt(resultado) / r1;
            System.out.println("El cociente de la raíz cuadrada de (r3 - r2) dividida por r1 es: " + cociente);
        }
    }
    //// Método para calcular el cociente del promedio de los tres valores dividido por la raíz cuadrada de r2
    private static void calcularCocientePromedio(double r1, double r2, double r3) {
        if (r2 < 0) {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            double promedio = (r1 + r2 + r3) / 3;
            if (r2 == 0) {
                System.out.println("Error: División por cero.");
            } else {
                double cociente = promedio / Math.sqrt(r2);
                System.out.println("El cociente del promedio de los tres valores dividido por la raíz cuadrada de r2 es: " + cociente);
            }
        }
    }
    //Metodo para calcular el promedio de los 3 numeros 
    private static void calcularPromedio(double r1, double r2, double r3) {
        double promedio = (r1 + r2 + r3) / 3;
        System.out.println("El promedio de r1, r2 y r3 es: " + promedio);
    }
    //// Método para calcular la raíz cuadrada de (r1 - r3)
    private static void calcularRaizcuadrada(double r1, double r3) {
        double resultado = r1 - r3;
        if (resultado < 0) {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            System.out.println("La raíz cuadrada de (r1 - r3) es: " + Math.sqrt(resultado));
        }
    }

   
}
