package Practica3;
/*Un comercio de la ciudad, que realiza horario de corrido de 8:30hs a
19hs, necesita un programa que responda si está abierto o cerrado
cuando un usuario/cliente ingresa una hora determinada (hora y
minutos).
 */

public class BonusTrack_1tp4 {
    public static int obtenerEntero(int inf, int sup) {
        int hora = 0;
        int minuto = 0;
        if(hora >= 8 && hora <= 19){
            return hora;
        }
        if(minuto >= 0 && minuto <= 30){
            return minuto;
        }   
        return hora;
        // retorna un valor entero mayor o igual a inf y menor o
        // igual a sup
        }
        public static void main(String[] args) {
            int horaApertura = 8; // hora de apertura
            int minutoApertura = 30; // minuto de apertura
            int horaCierre = 19; // hora de cierre
            int minutoCierre = 0; // minuto de cierre
            int hora = obtenerEntero(0, 23);
            int minuto = obtenerEntero(0, 59);
           
           // Comprobamos si la hora ingresada está dentro del horario
        //    de apertura y cierre
           if (hora > horaApertura ||
            (hora == horaApertura && minuto >= minutoApertura)
            && hora < horaCierre ||
            (hora == horaCierre && minuto <= minutoCierre)) {
            System.out.println("El comercio está abierto.");
           } else {
            System.out.println("El comercio está cerrado.");
           }
        }   
}
