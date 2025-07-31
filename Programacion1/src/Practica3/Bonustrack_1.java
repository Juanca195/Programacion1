package Practica3;
/* La cadena de supermercados Carrefive ha pedido la
refactorización del componente de software que usa para el
control de stock. El código original no estaba modularizado por lo
tanto no era legible y no se aprovechaba la reutilización. Dado un
artículo (id y nombre), fecha y hora y una cantidad, el componente
que maneja el stock genera los siguientes reportes:
    
    Variables/contantes 
    int id
    string nombre
    int fecha
    int hora 
    int cantidad

*/
/*Cuando la cantidad de unidades del artículo llega a un límite
de seguridad (valor constante) se debe reportar (por
consola) los siguientes datos que deben ser enviados al
proveedor de dicho artículo: ID_Producto, Nombre, Fecha y
Hora (ingresada por el usuario), Cantidad, Prioridad baja.
 */

public class Bonustrack_1 {
    final static int MAXLIMITE = 100;
    final static String  DIAMARCADERIA= "Lunes";
    public static void main(String[] args) {

        Resolver();
        

    }
    private static void Resolver() {
        consigna2();
        int numero = 0 ;
        System.out.println("Ingrese un numero distinto de cero");
        numero = Utils.leerInt();

        while (numero !=0) {
            System.out.println("Ingrese un ID");
            int ID = Utils.leerInt();

            System.out.println("Ingrese un nombre");
            String nombre = Utils.leerString();

            System.out.println("Ingrese una fecha");
            String fecha = Utils.leerString();

            System.out.println("ingrese una hora");
            int hora = Utils.leerInt();

            System.out.println("ingrese una cantidad");
            int cantidad = Utils.leerInt();

            consingaA(ID, nombre, fecha, hora, cantidad);
            consingaB(ID, nombre, fecha, hora, cantidad);
            consingaC(ID, nombre, fecha, hora, cantidad);
            consignaD(ID, nombre, fecha, hora, cantidad);
            //consignaE(ID);


            System.out.println("Ingrese un numero distinto de cero");
            numero = Utils.leerInt();
        }
        
    }
     private static void consigna2() {
        
        String dia = "";
        System.out.println("Que dia es hoy?");
        dia = Utils.leerString();
        modificaStock(dia);
        // TODO Auto-generated method stub
       
    }
    //consingaA();
    public static void consingaA(int ID, String nombre, String fecha, int hora, int cantidad ) {
        if(cantidad >= MAXLIMITE){
            System.out.println("Id: " +ID+ "nombre: " +nombre+ "fecha: " +fecha+ "Hora: " + hora+ "Cantidad: " + cantidad);
            System.out.println("La priorirad es baja");
        }
    }
    public static void consingaB(int ID, String nombre, String fecha, int hora, int cantidad ) {
       /* */
       /*Cuando la cantidad de unidades está por debajo del límite
        de seguridad en más de un 30% se debe aumentar la
        prioridad de baja a media y actualizar la cantidad, la fecha y
        la hora en el reporte */

        if(cantidad < MAXLIMITE * 0.7 && cantidad >  MAXLIMITE* 0.3 ){
            System.out.println("Id: " +ID+ " nombre:  "  +nombre+ " fecha: " +fecha+ " Hora: " + hora+ " Cantidad: " + cantidad);
            System.out.println("La priorirad es Media");
        }
    }
    public static void consingaC(int ID, String nombre, String fecha, int hora, int cantidad) {
        if(cantidad < MAXLIMITE * 0.3 && cantidad > 0){
            System.out.println("Id: " +ID+ " nombre:  "  +nombre+ " fecha: " +fecha+ " Hora: " + hora+ " Cantidad: " + cantidad);
            System.out.println("La priorirad es Alta");
        }
    }
    public static void consignaD(int ID, String nombre, String fecha, int hora, int cantidad) {
        if(cantidad == 0){
            System.out.println("No hay mas unidas del producto: " + ID+ " nombre: " + nombre);
            System.out.println("Id: " +ID+ " nombre:  "  +nombre+ " fecha: " +fecha+ " Hora: " + hora+ " Cantidad: " + cantidad);
        }
    }

    /*. Los días lunes se recibe la mercadería que envían los
proveedores y se debe actualizar el stock. Suponga que se tiene
un método que modifica el stock con la cantidad recibida y que
invoca a otro método que elimina la línea del pedido para el
producto recibido (se conoce el ID_Producto). Programar un
método al cual se le pase el día de la semana y si es lunes pida al
usuario el ID_Producto y la cantidad recibida. Con estos datos
invoque al método que modifica el stock (no implementar) y al que
elimina la línea del pedido (no implementar). Hacer un programa
que llame a los diferentes métodos, establezca variables y
constantes. Finalmente imprima cuanto stock quedó.
 */

 public static void modificaStock( String dia) {
    int cantidad = 0; // estan inicializadas para que no de error
    int Id = 0;
    if (dia == DIAMARCADERIA){
        modifica(cantidad, Id);
        eliminarPedido(Id);

    }
 }
private static void eliminarPedido(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'eliminarPedido'");
}
private static void modifica(int cantidad, int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'modificaStock'");
}

}
