package Controller;

import java.util.Random;

public class NumeroController {
	
	private Random random;
	int x;
	
	public NumeroController() {
		
		random = new Random();
	}
	
	public int numeroNaoRepetido(int a, int b) {
		
		if(a == b){
		
			while(a == b) {
				
				x = random.nextInt(100);
			}
			
			return x;
		} else {
			
			x = b;
			return x;
		}
		
	}

}
