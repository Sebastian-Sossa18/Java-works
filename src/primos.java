import java.util.Scanner;

public class primos {
    //Creamos clase llamada Input (igual que el nombre del archivo)

    /*Le decimos a Java que habrá un valor de entrada por parte del usuario(Scanner)
    y la creamos static para que no se repita en la variable "entrada"*\
     */
    static Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        //Definimos dos variables numero como entero y m, tambien nombramos valor que recibirá un valor booleano
        int numero, m;
        boolean valor;

        //Pedimos al usuario que ingrese el numero hasta donde mostrar numeros primos
        System.out.print("Por favor ingrese el numero al que quiere llegar");
        //NextInt() sirve para verificar si hay algún dato para escanear
        numero = entrada.nextInt();

        for (int i = 2; i < numero; i++){

            m = 2;
            valor =true;
            //apreciamos que ejecutamos el while en donde si el valor Y m es menor que i entonces hacemos if:
            while (valor && m < i){
                if (i % m ==0)
                    valor = false;
                else
                    m = m +1;
            }
            if(valor)
                System.out.print("El numero es "+ "\n" +  i + "\n" +  "Primo");
        }
    }
}