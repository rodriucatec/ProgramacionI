package ejercicios;

import java.util.Scanner;

public class triangulo {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        double a,b,c;
        String result="";

        System.out.println("Programa para verificar el tipo de triangulo");
        System.out.println("Ingrese las medidas del triangulo [a] [b] [c]");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        if (a == b && a==c) {
            result="El triangulo es equilatero";
        }
        if ((a==b && a!=c)||(b==c && c!=a)||(c==a && a!=b)){
            result = "El triangulo es isoceles";
        }
        if (a!=b && b!=c){
            result = "El triangulo es escaleno";
        }
        if (c*c==(a*a+b*b)){
            result+= " y tambien es rectangulo";
        }

        System.out.println(result);
    }
}
