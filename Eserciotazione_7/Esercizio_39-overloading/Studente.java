import java.util.ArrayList;
import java.util.List;

import Esame.Esame;
import Persona.Persona;

public class Studente extends Persona {

	String nome;
	String cognome;
	int matricola;
	List<Esame> esami;
	double mediaVoti;

	public Studente(String nome, String cognome, int matricola, List<Esame> esami) {
		super(nome, cognome); // ereditate dalla superclase persona
		this.matricola = matricola;
		this.esami = esami;

	}

	public double calcolaMediaVoti() {
		double somma = 0;
		int cont = 0;
		for (int i = 0; i < esami.size(); i++) {
			somma = somma + esami.get(i).getVoto();
			cont++;
		}
		return somma / cont;
	}

	public double getTassa(double tassamax, int fascia) {

		double tassaLorda = tassamax;
		double tassaScontata = 0;

		// sconto in base alla fascia
		switch (fascia) {
		case 1:
			tassaScontata = tassaLorda - (tassaLorda * 50 / 100);
			break;
		case 2:
			tassaScontata = tassaLorda - (tassaLorda * 35 / 100);
			break;
		case 3:
			tassaScontata = tassaLorda - (tassaLorda * 25 / 100);
			break;
		case 4:
			tassaScontata = tassaLorda - (tassaLorda * 10 / 100);
			break;
		case 5:
			tassaScontata = tassaLorda;
			break;
		}

		// sconto in base alla media voti
		int mediaVoti = (int) calcolaMediaVoti();
		double tassaSuperScontata = 0;

		switch (mediaVoti) {
		case 30:
			tassaSuperScontata = tassaScontata - (tassaScontata * 10 / 100);
			break;
		case 29:
			tassaSuperScontata = tassaScontata - (tassaScontata * 8 / 100);
			break;
		case 28:
			tassaSuperScontata = tassaScontata - (tassaScontata * 6 / 100);
			break;
		case 27:
			tassaSuperScontata = tassaScontata - (tassaScontata * 4 / 100);
			break;
		}
		if (mediaVoti < 27) {
			tassaSuperScontata = tassaScontata;
		}

		return tassaSuperScontata;
		
	}

	public double getTassa(double tassamax) {

		// sconto in base alla media voti perché non viene fornita la fascia
				int mediaVoti = (int) calcolaMediaVoti();
				double tassaLorda = tassamax;
				double tassaSuperScontata = 0;

				switch (mediaVoti) {
				case 30:
					tassaSuperScontata = tassaLorda - (tassaLorda * 10 / 100);
					break;
				case 29:
					tassaSuperScontata = tassaLorda - (tassaLorda * 8 / 100);
					break;
				case 28:
					tassaSuperScontata = tassaLorda - (tassaLorda * 6 / 100);
					break;
				case 27:
					tassaSuperScontata = tassaLorda - (tassaLorda * 4 / 100);
					break;
				}
				if (mediaVoti < 27) {
					tassaSuperScontata = tassaLorda; //no sconto
				}

				return tassaSuperScontata;
		
	}

}
