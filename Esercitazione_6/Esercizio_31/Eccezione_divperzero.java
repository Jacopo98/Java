import java.util.Random;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Esercizio31 {

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		int n;
		n = in.readInt("Inserisci numero");

		/*
		 * CREAZIONE NUMERO CASUALE ALTERNATIVA while(divisore>=4) { divisore = (int)
		 * Math.floor(Math.random()*10); }
		 */

		Random casuale = new Random();
		int divisore1 = casuale.nextInt(3);

		out.println(divisore1);

		double risultato = 0;

		try {

			risultato = n / divisore1;

		} catch (ArithmeticException a) {
			System.out.println("DIVISIONE PER ZERO!");
		}

		out.println(risultato);

	}

}
