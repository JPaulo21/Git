package Controller;

import java.util.Random;

public class NumeroController {
	
	private Random random;
	
	public int numeroNaoRepetido(int a, int b) {
		
		int x = 0;
		while (a == b) {

			x = random.nextInt(100);
		}
		
		return x;
	}

}
