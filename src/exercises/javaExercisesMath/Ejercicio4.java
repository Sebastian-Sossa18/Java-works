package javaExercisesMath;

public class Ejercicio4 {
	
public static void main(String[] args) {
		
	double num1 = Math.random()*50;
	double num2 = Math.random()*50;
	
	double redondeo1 = Math.round(num1);
	double redondeo2 = Math.round(num2);
	
	
	
	 System.out.println("El numero mayor entre los dos en : " + Math.max(redondeo1, redondeo2));
		
		
	}

}
