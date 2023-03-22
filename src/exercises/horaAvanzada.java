package exercises;

import java.util.Scanner;

public class horaAvanzada {

    static Scanner date = new Scanner (System.in);

    public static void main(String[] args){
        int h, m, s;

        System.out.print("Introduzca hora :");

        h = date.nextInt();

        System.out.print("Introduzca minuto :");

        m = date.nextInt();

        System.out.print("Introduzca Segundo :");

        s = date.nextInt();

        //La hora debería estar bien

        s++;//Incrementamos segundos

        if (s >=60){//Se suman hasta 59 , esto lo supera entonces tomará el valor 0
            s=0;
            m++;
            //si los minutos superran los 59 segundos entoneces el nuevo valor será 0

            if (m >=60){
                m=0;
                h++;

                if (h >=24){

                    h=0;

                 }

         }

        }
        System.out.println("Fecha:" + h + " : " + m + " : " + s);
    }
}
