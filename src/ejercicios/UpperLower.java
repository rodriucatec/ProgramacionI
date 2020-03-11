package ejercicios;

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nombre, aux="";
        boolean upper = true;
        System.out.println("Ingrese el nombre de la persona");
        nombre=scan.nextLine();
        System.out.println(nombre.substring(0,1).toUpperCase()+nombre.substring(1,nombre.length()).toLowerCase());

        for (int i = 0; i < nombre.length(); i++) {
            if (upper){
                aux+=nombre.substring(i,i+1).toUpperCase();
                upper=false;
            }
            else{
                aux+=nombre.substring(i,i+1).toLowerCase();
                upper=true;
            }
        }
        System.out.println(aux);
    }
}
