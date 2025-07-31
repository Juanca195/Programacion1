package Practica2;
public class ejercicio_5tp2 {
    public static void main(String[] args) {
        int hora=0;
        System.out.println("Ingrese una hora valida entre 0 y 23");
        hora=Utils.leerInt();
        if (hora<0 || hora>23){
            System.out.println("No ingreso una hora valida");
        }
        else{
            if (hora>=0 && hora<=5){
                int temperatura=0;
                System.out.println("ingrese temperatura");
                temperatura=Utils.leerInt();
                if (temperatura<20){
                    System.out.println("encender la calefaccion");
                } else if (temperatura>25){
                    System.out.println("Apagar la calefaccion");
                } else {
                    System.out.println("Calefaccion encendida, no abra las ventanas");
                }
            } else if (hora>5 && hora<=11){
                char letra=' ';
                System.out.println("Ingrese una letra minuscula");
                letra=Utils.leerChar();
                if (letra>='a' && letra<='z'){
                    int consonantes=2, vocales=3;
                    switch(letra){
                        case 'a','e','i','o','u':{
                            if (hora==6||hora==8||hora==10||hora==11){
                                vocales=2;
                            }
                            System.out.println("La hora " + hora + " tiene " + vocales + " vocales");
                            break;
                        }
                        default: System.out.println("La hora " + hora + " tiene " + consonantes + " consonantes");
                    }
                }
            } else if (hora>=12 && hora <=17){
                if (hora%2==0){
                    System.out.println("El promedio es: " + (hora+12)/2);
                } else{
                    System.out.println("El promedio es: " + (hora+17)/2);
                }
            } else if (hora>=18 && hora<=23){
                final int claveAlmacenada=364;
                int clave=0;
                System.out.println("ingrese una clave");
                clave=Utils.leerInt();
                if (clave==claveAlmacenada){
                    int segundaClave=0;
                    System.out.println("Ingrese segunda clave (100 y 999)");
                    segundaClave=Utils.leerInt();
                    if (segundaClave>=100 && segundaClave<=999){
                        if (((segundaClave/100)%(claveAlmacenada/100))==0){
                            System.out.println("clave correcta");
                        } else {
                            System.out.println("clave incorrecta");
                        }
                    }
                } else{
                    System.out.println("La primera clave es incorrecta");
                }
            }
        }
    }
}

