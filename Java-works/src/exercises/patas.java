package exercises;
import java.util.Scanner;

public class patas {
    static Scanner patas = new Scanner(System.in);

    public static void main (String[] args){
        int h;
        int a;
        int ch;

        System.out.print("Ingrese cuantas hormigas capturó: ");

        h = patas.nextInt();

        System.out.print("Ingrese cuantas arañas capturó: ");

        a = patas.nextInt();

        System.out.print("Ingrese cuantas cochinillas capturó: ");

        ch = patas.nextInt();

        int total = (6 * h ) + (8 * a) + (ch * 14) ;

        System.out.print("La cantidad de patas de los bugs capturados son: " +  total);


    }
}
