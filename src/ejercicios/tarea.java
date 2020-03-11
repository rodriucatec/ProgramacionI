package ejercicios;

import java.util.Scanner;

// crear un programa que simule la funcion potencia donde se lean de teclado 2 numeros en los que representen la base y el exponente
// respectivamente
//Se pide diseñar una funcion recursiva que realice este calculo
//nota, verificar que el exponente debe ser un numero positivo
public class tarea {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b;
        a=scan.nextInt();
        b=scan.nextInt();

        System.out.println(potencia(a,b));
    }

    public static int potencia(int a, int b){
        if (b==1) return a;
        else return a*potencia(a,b-1);
    }
}
