package exercises;
import java.util.Scanner;

public class medidaTiempo {
    static Scanner medida = new Scanner(System.in);
    public static void main(String[]args){

        double s;


        System.out.print("Digite su medida en segundos: ");

        s = medida.nextDouble();

        if ( s > 0 ){
                System.out.print("Su medida de tiempo son: " + (s / 3600) + " Horas" + "\n" );
                System.out.print("Su medida de tiempo son: " + (s/60) + " Minutos" + "\n" );
                System.out.print("Su medida de tiempo son: " + s + " Segundos" );
        }else {
            System.out.print("medida incalculable");
        }
    }
}
