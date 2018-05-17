import java.util.ArrayList;
import java.util.Arrays;

//esercizio28
public class Tavolo {

	int idtavolo; // id numerico
	int maxCoperti; // massimo coperti

	// ___ _ ___

	int copertiresidui;

	private static int counter = 0; // id autoincrement, viene incrementato nel costruttore
									// NB da dichiarare private static!
	ArrayList<Piatto> listapiatti = new ArrayList<Piatto>();
	ArrayList<Persona> listapersone = new ArrayList<Persona>();

	// costruttore
	public Tavolo(int maxCoperti) {
		idtavolo = ++counter;
		this.maxCoperti = maxCoperti;
		this.copertiresidui = maxCoperti;

	}

	// metodi
	public void aggiungiPersona(Persona p) {

		if (copertiresidui > 0) {
			listapersone.add(p); // metodo predefinito di ArrayList
			copertiresidui--;
		} else {
			System.out.print("Tavolo pieno!");
		}

	}

	// questa funzione serve nel metodo successivo
	boolean esistePiatto(Piatto p) { // verifico se il piatto è già stato inserito
		for (int i = 0; i < listapiatti.size(); i++)
			if (p.getId() == listapiatti.get(i).getId())
				return true;
		return false;
	}

	public void inserisciPiatto(Piatto p) {

		if (esistePiatto(p)) {
			System.out.println("Piatto gia inserito!");
		} else {
			listapiatti.add(p);
		}
	}

	// questa funzione serve nel metodo successivo
	int indicePiatto(int id) {
		for (int i = 0; i < listapiatti.size(); i++)
			if (id == listapiatti.get(i).getId())
				return i;
		return -1;
	}

	void rimuoviPiatto(int idpiatto) {
		int indice = indicePiatto(idpiatto);
		if (indice != -1)
			listapiatti.remove(indice);
		else
			System.out.println("Piatto non trovato!");
	}

	void modificaQta(int idpiatto, int nuovaqta) {
		for (int i = 0; i < listapiatti.size(); i++) {
			if (idpiatto == listapiatti.get(i).getId()) {
				listapiatti.get(i).setQta(nuovaqta);
			}
		}
	}

	void visualizzaPersone() {
		for (int i = 0; i < listapersone.size(); i++)
			System.out.println(listapersone.get(i).toString());
	}

	void visualizzaPiatti() {
		for (int i = 0; i < listapiatti.size(); i++)
			System.out.println(listapiatti.get(i).toString());
	}

	double calcolaTotale() {
		double tot = 0;
		for (int i = 0; i < listapiatti.size(); i++) {
			tot = tot + ((Piatto) listapiatti.get(i)).getPrezzo();
		}
		return tot;
	}

	double calcolaPrezzoMedio() {
		return calcolaTotale() / (maxCoperti - copertiresidui);
	}

	public int getId() {
		return idtavolo;
	}

	public int getNumeroCoperti() {
		return maxCoperti;
	}

}
