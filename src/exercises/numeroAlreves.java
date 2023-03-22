import java.util.Scanner;
   
 public class numeroAlreves{
   static Scanner numero = new Scanner(System.in);
      
      public static void main(String[] args){
            int valor;
            int dm, um, c, d, u;
            
            System.out.print("Introduzca un numero entre 0 y 99.999: ");
             valor = numero.nextInt();
            //Realizamos la operación para tener al reves los numeros
            u = valor %10;
            valor = valor/10;
            
             d = valor %10;
            valor = valor/10;
            
             c = valor %10;
            valor = valor/10;
            
             um = valor %10;
            valor = valor/10;
            
            dm=valor;
            //Finalmente mostramos el resultado
            System.out.println(u + " " + d +  " " + c +  " " + um +  " " + dm);
            
      }
  }  