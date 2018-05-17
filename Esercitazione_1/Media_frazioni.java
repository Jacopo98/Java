import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class PrimoEsercizio {

	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		//CALCOLO MEDIA di frazioni inserite da tastiera
		
		int cont=0;
		Frazione totale = new Frazione(0,1);
		Frazione media;
		
		do {
			out.println("Inserisci frazione");
			int n = in.readInt("Inserisci numeratore: ");
			int d = in.readInt("Inserisci denominatore: ");
			
			Frazione f1 = new Frazione(n,d);
			totale= totale.piu(f1);
			
			cont=cont+1;
			
		}while(in.readSiNo("Vuoi continuare?"));
		
		Frazione f3 = new Frazione(1,cont);
		
		media = totale.per(f3);
		
		out.println(media);
		
	}

}
