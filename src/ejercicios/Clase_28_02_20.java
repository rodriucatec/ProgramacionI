package ejercicios;

import java.util.Scanner;

public class Clase_28_02_20 {
    public static void main (String[] args){
        //Clase que nos permite leer desde teclado
        Scanner scan = new Scanner(System.in);

        //Declaracion y asignacion de parametros
        String paterno, nombre="Rodrigo";
        int edad;
        double peso;

        //System.out.println("Buen dia "+nombre);

        //Peticion de datos
        System.out.println("Ingrese su apellido paterno:");
        paterno = scan.nextLine();
        System.out.println("Ingrese su edad:");
        edad = scan.nextInt();
        System.out.println("Ingrese su peso:");
        peso = scan.nextDouble();

        //Mostrar los datos
        System.out.println("Hola "+nombre+" "+paterno+" tienes "+edad+" años de edad" +
                "y tu peso es de "+peso+" kilogramos.");

    }
}
