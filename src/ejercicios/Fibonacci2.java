package ejercicios;

import java.util.Scanner;

public class Fibonacci2 {

    //Bajo construccion
    public static void Main(String[] args){
        Scanner scan = new Scanner(System.in);

        Integer a=0, b=1, aux, limite;
        String cadena="", espacios;
        limite = scan.nextInt();


        for (int i = 0; i < limite; i++) {
            espacios="";
            for (int j = limite-1; j > 0; j++) {
                espacios+=" ";
            }
            for (int j = 0; j < i; j++) {
                cadena+=b+" ";

            }
        }
    }
}
