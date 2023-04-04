package javaExercisesMath;

public class Ejercicio2 {
	
public static void main(String[] args) {
	
	int [] numeros = {2, 8, 9, 27, 28, 55, 121};
	
	for(int i = 0 ; i < numeros.length; i++ ) {
	
	
		System.out.printf("%d", (int) numeros[i]);
		System.out.print("    ");
		System.out.print(Math.sqrt(numeros[i]));
		
	}
		
	}

}
