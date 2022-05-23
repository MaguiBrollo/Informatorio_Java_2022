package Level1;

import java.util.Scanner;

/*
7.	Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo 
    a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().
*/

public class Ejercicio07Mayuscula {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("------PASAR A MAYUSCULAS------------");
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Ingrese una palabra en minúsculas......: ");
            String palabra = scan.nextLine();

            System.out.println("Mayúsculas de ("+ palabra+") es ("+ mayuscula(palabra)+")");
            System.out.println("-----------------------------------");
            scan.close();
        }
    }

    // a=97
    //A=65   //dif 97-65 =32
    private static String mayuscula(String minus) {
        String mayus="";

        for(int i = 0; i < minus.length(); i++){
            if(minus.charAt(i)>='a' && minus.charAt(i)<='z') { 
	       	    mayus += Character.toString (minus.codePointAt(i) - 32);
	    	}
        }
        return mayus;
    }
}
