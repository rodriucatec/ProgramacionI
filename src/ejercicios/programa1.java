package ejercicios;

import java.util.Scanner;

public class programa1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //Contar los menores de 21
        //Sacar el promedio de los mayores de 21
        int edad, menores=0, mayores=0, cont=0;

        do{
            System.out.println("Ingrese edad:");
           edad = scan.nextInt();
            if (edad<21){
                menores++;
            }else{
                mayores+=edad;
                cont++;
            }
        }while (edad!=0);

        System.out.println("Hay "+menores+" menores de 21");
        System.out.println("El promedio de los mayores de 21 es "+mayores/cont);
    }
}
