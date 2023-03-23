package exercises;
import java.util.Scanner ;


public class granja{

    static Scanner dato = new Scanner(System.in);

    public static void main (String[] args){

            int comidaDiaria, numAnimales, kilosPorAnimal;

            System.out.print("Introduzca la comida diaria que compra : ");

            comidaDiaria = dato.nextInt();

            System.out.print("Introduzca el numero de animales : ");

            numAnimales = dato.nextInt();

            System.out.print("Introduzca los kilos necesarios por cada animal : ");

            kilosPorAnimal = dato.nextInt();

            int valorReal = comidaDiaria/numAnimales;

            if (comidaDiaria ==0 && numAnimales ==0 && kilosPorAnimal ==0){
                    System.out.print("Fallo (No digitó numero correcto o válido)");
            }else{
                if(valorReal == kilosPorAnimal){
                    System.out.println("Cantidad exitosa : " +  valorReal);
    
                }else{
                    System.out.print("Error ");
                    System.out.println("la cantidad necesaria para cada aniumal es : " +  valorReal);

                }

            }









    }
}

