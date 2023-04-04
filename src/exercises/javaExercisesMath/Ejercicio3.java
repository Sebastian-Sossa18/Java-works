package javaExercisesMath;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		
		int num1 = (int)Math.floor(Math.random()*10);
		int num2 = (int)Math.floor(Math.random()*10);;
		int num3 = (int)Math.floor(Math.random()*10);;
		int num4 = (int)Math.floor(Math.random()*10);;
		int num5 = (int)Math.floor(Math.random()*10);;
			
		
		int promedio = num1 + num2+ num3+ num4 + num5 / 5;
		
		System.out.println("El promedio de notas random es  :" + promedio);
			
		}

}
