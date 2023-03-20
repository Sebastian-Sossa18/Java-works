package exercises;

import java.util.Scanner;

public class entrada {

    static Scanner edad = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Por favor digite su edad :");

        int e = edad.nextInt();

        if ( e >= 18){
             System.out.print("Puede ingresar a la fiesta");
        }else{
            System.out.print("No puede ingresar a la fiesta");
        }

    }


}
