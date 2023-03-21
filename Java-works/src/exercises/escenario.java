package exercises;
import java.util.Scanner;

/* Un empresario que se dedica al espectáculo quiere tener una herramienta (un programa)
que le ayude a sacar ciertos cálculos cada vez que trae una banda a tocar en algún estadio.
Lo primero que necesita saber es cuánta gente va a poder asistir a cada recital. Para eso,
cuando arregla con un club para usar su estadio, pregunta cuántos metros cuadrados tiene.
Él sabe que, por metro cuadrado, entran 4 personas. También sabe que las tribunas ocupan un 20% de ese espacio,
entonces pregunta cuántas personas caben en las tribunas.
Cuando contrata a la banda que va a tocar, le pregunta qué porcentaje del espacio necesitan ellos para su escenario.
Con estos datos, debe calcularse cuánta gente va a caber en el estadio para un recital determinado,
para saber cuántas entradas tiene que mandar a imprimir. El empresario, cada vez que use el programa,
va a ingresar la cantidad de metros cuadrados que tiene el estadio que contrató,
la cantidad de gente que cabe en las tribunas y el porcentaje de espacio ocupado por el escenario.
Luego, él quiere saber cuánto dinero ingresaría si vende todas las entradas disponibles,
sabiendo que el 30% de las entradas vendidas son “entradas vip” y el resto son “entradas comunes”.
El empresario ingresa el precio de cada tipo de entrada cuando usa el programa.*/

public class escenario {
    static Scanner cantidad= new Scanner(System.in);

    public static  void main(String[] args){
         System.out.print("Ingrese cuantos metros cuadrados tiene el sitio: ");

         float mt = cantidad.nextFloat();

        System.out.print("Ingrese cuantos metros cuadrados ocupará la banda: ");

        float esban = cantidad.nextFloat();

        System.out.print("Ingrese cual es el precio de boletas Normal: ");

        float boletasNormal = cantidad.nextFloat();

        System.out.print("Ingrese cual es el precio de boletas VIP: ");

        float boletasVip = cantidad.nextFloat();

        float genteAsistir = mt * 4 / esban;
        double tribuna = genteAsistir / 0.2;
        double gananciaNormal = boletasNormal * (genteAsistir / 0.3 );
        double ganaciaVip = boletasVip * (genteAsistir / 0.7 );


        System.out.print("El total de gente que irá al evento son :"  + genteAsistir + "personas \n");
        System.out.print("El total de gente que estará en la tribuna son :"  + tribuna + "personas\n");
        System.out.print("El total de ganancia de boletas normales son :"  + gananciaNormal +"\n");
        System.out.print("El total de ganancia de boletas VIP son ::"  + ganaciaVip );
    }

}
