package exercises;
import java.util.Scanner;

public class numeroRedondo {
    //Se crea la variable input con el Scanner
    static Scanner input= new Scanner(System.in);

    public static void main(String[] args){

        double n;
        int redondear;
    //Pide el numero en formato decimal
        System.out.print("Digite su numero en formato decimal (,):");
        //Llamamos a input y el codigo nextDouble();
        n =  input.nextDouble();
        //Se redondea la n
        redondear = (int) (n + 0.5);
        //Mostramos mensaje

        System.out.println(n + "Fue redondeado a: " + redondear);

    }

}
