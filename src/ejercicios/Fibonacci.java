package ejercicios;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        //Definimos los parametros necesarios
        //La logica es la siguiente
        //    ↓ es la suma de los 2 anteriores
        //1 1 2 3 5 8 13 21 34 55
        //b
        //a b
        //  a b
        //    a b

        //2 parametros enteros para sumar sus valores
        //1 variable aux para almacenar momentaneamente
        //1 variable limite para definir hasta donde queremos mostrar la serie de Fibonacci
        Integer a=0, b=1, limite, aux;

        //1 variable de tipo cadena donde almacenamos cada numero de la serie
        String cadena = "";

        System.out.println("Ingrese el limite para la serie de Fibonacci:");

        //Herramienta que nos permite leer de teclado
        Scanner scan = new Scanner(System.in);

        //Leemos de teclado y lo asignamos a limite
        limite=scan.nextInt();

        //Realizamos un ciclo for para ir recorriendo hasta el limite
        for (int i = 0; i < limite; i++) {
            //Vamos concatenando la variable b
            cadena += b+", ";
            //Asignamos momentaneamente el valor de a a aux
            aux = a;
            //Asignamos el valor de 'b' a la variable 'a'
            a = b;
            //Y colocamos el valor momentaneo de aux, que pertenecia a 'a' a la variable 'b'
            b +=aux;
        }

        //Imprimimos la cadena
        System.out.println(cadena);
    }
}
