package exercises;
import java.util.Scanner;

public class Distancias {

    static  Scanner medida = new Scanner(System.in);
    public static void main(String[] args){
        float m, c, mt;

        System.out.print("Ingrese la primera distancia en milímetros: ");

        m = medida.nextFloat();

        System.out.print("Ingrese la segunda distancia en centímetros: ");

        c = medida.nextFloat();

        System.out.print("Ingrese la tercera distancia en metros: ");

        mt = medida.nextFloat();

        float valorTotal = (m /10) + c + (mt*100);

            System.out.print("Su medida de distancia son: " + valorTotal + " centímetros" );


    }
}
