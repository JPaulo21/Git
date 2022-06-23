package Main;

import java.util.Random;

import Controller.NumeroController;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();
		NumeroController nc = new NumeroController();

		int a = random.nextInt(100);
		int b = nc.numeroNaoRepetido(a, random.nextInt(100));

		int soma = a + b;

		System.out.printf("%d + %d = %d", a, b, soma);

	}

}
