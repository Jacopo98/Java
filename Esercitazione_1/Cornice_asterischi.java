import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class SecondoEsercizio {

	public static void main(String[] args) {
		
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		String s = in.readLine("Inserisci un stringa: ");
		
		String asterischi = "**************************";
		
		String bordo = asterischi.substring(0,(s.length()+8));
		
		int x = s.length();
		x= x+6;
		
		
		out.println(bordo);
		out.print("*");
		
		for(int i=0; i<x; i++) {
			out.print(" ");					
		}
		out.println("*");
		
		
		out.print("*   ");
		out.print(s);
		out.println("   *");
		
		
		out.print("*");
		
		for(int i=0; i<x; i++) {
			out.print(" ");					
		}
		
		
		out.println("*");
		out.println(bordo);

	}

}
