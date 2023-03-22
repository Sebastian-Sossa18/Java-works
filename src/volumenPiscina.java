import java.util.Scanner;
public class volumenPiscina {


    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la altura de la piscina:");
        int altura = sc.nextInt();

        System.out.println("Ingrese el ancho de la piscina:");
        int ancho = sc.nextInt();

        System.out.println("Ingrese la largo de la piscina:");
        int largo = sc.nextInt();

        int volumen = altura * ancho * largo;

        System.out.println("El volumen de la piscina es: " + volumen);
    }

}
