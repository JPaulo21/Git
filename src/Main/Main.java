package Main;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int a = random.nextInt(100);
		int b = random.nextInt(100);
		
		while(a==b) {
			
			b = random.nextInt(100);
		}
		
		int soma = a + b;
		
		System.out.printf("%d + %d = %d", a, b, soma);		
		
		
	}

}
