import java.util.Arrays;

import Esame.Esame;

public class Test_39 {

	public static void main(String[] args) {
		
		Studente s1 = new Studente("Jacopo", "Boffelli", 999999, Arrays.asList(new Esame("Informatica", 28), new Esame("Matematica",30)));
		
		Studente s2 = new Studente("Lorenzo", "Boffelli", 888888, Arrays.asList(new Esame("Informatica", 28), new Esame("Matematica",27)));
		
		double media = s1.calcolaMediaVoti();
		System.out.println("La media è: " + media);
		
		double tassa = s1.getTassa(12000, 2); //fornisco sia tassamax che fascia
		System.out.println("La tassa scontata è: "+ tassa);
		
		double tassa2 = s1.getTassa(12000); //fornisco solo tassamax
		System.out.println("La tassa scontata è: "+ tassa2);
		
	}
