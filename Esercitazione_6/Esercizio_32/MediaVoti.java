import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Esercizio32 {

	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out =new ConsoleOutputManager();
		
		String voti = new String("a;22;20;21;27;30");
		
		String[] elencoVoti = voti.split(";");

		double somma=0;
		double media=0;
		
		try {
			
		for(int i = 0; i<elencoVoti.length; i++) {
			
			somma+=(Integer.parseInt(elencoVoti[i]));
		}
		
		}catch(NumberFormatException e){
			System.out.println("Valore non valido!");
		
			
		}
		media=somma/(elencoVoti.length);
		
		out.println("La media è: " + media);
		
		
	}

}
