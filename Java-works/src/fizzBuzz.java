//Creamos la clase Fizz Buzz
public class fizzBuzz {
    //iniciamos el main (Desde donde se leerá el code)
    public static void main(String[]args) {
        // Creamos la variable i como int y su maximo será 100, por cada vez que se haga se sumará uno
        for ( int i = 1; i <= 100; i++){
            //Le decimos al metodo(rompeMentes) que imprima cada numero que se va sumando(i)
           System.out.println(rompeMentes(i));
        }

    }
    /*Le indicamos al sistema que la variable numero será dividida por 3 y por cinco y, de acuerdo al residuo
    podremos calcular si es multiplo y no y con ellos retornar el dato correspondiente que se mostrará en pantalla*/
    public static String rompeMentes(int numero) {

            if (numero % 3 == 0 && numero % 5 == 0) {
            return  numero + " " +  "FizzBuzz";
            } else if (numero % 3 == 0) {
                return  numero + " " + "Fizz";
            } else if (numero % 5 == 0) {
                return  numero + " " + "Buzz";
            }else{
                //retornará el string de numero()variable
                return String.valueOf(numero);
            }
    }
}
