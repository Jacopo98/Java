import java.util.ArrayList;

public class Volo {

	int idvolo_dest;
	int idvolo_part;
	int posti_economica;
	int posti_primaclasse;

	int eco_residui;
	int prima_residui;

	public ArrayList<Passeggeri> passeggeri = new ArrayList<Passeggeri>();

	// costruttore 

	public Volo(int idvolo_dest, int idvolo_part, int posti_economica, int posti_primaclasse) { 	/*ArrayList<Passeggeri> passeggeri*/
		this.idvolo_dest = idvolo_dest;
		this.idvolo_part = idvolo_part;
		this.posti_economica = posti_economica;
		this.posti_primaclasse = posti_primaclasse;
		// this.passeggeri=passeggeri;
		this.prima_residui = posti_primaclasse;
		this.eco_residui = posti_economica;
	}

	// metodi

	public void aggiungiPasseggero(Passeggeri p) {
		if (p.getClasse() == 'E') { // posto in economy
			if (eco_residui > 0) {
				passeggeri.add(p);
			} else {
				System.out.println("Posti esauriti!");
			}
		} else { // posto in first class
			if (prima_residui > 0) {
				passeggeri.add(p);
			}else {
				System.out.println("Posti esauriti!");
			}

		}
	}
	
	
	public boolean passeggeroRegistrato(Passeggeri p) {
		for(int i=0; i<passeggeri.size(); i++) {
			if(p.getId()==passeggeri.get(i).getId()) {
				return true; // il passeggero c'è!
			}
		}
		return false;
	}
	
	
	
	public void rimuoviPaseggero(Passeggeri p){
		if (passeggeroRegistrato(p)) { // se il passeggero è registrato
			passeggeri.remove(p);
		}else {
			System.out.println("Il passeggero non aveva un biglietto su quest'aereo!");
		}
	}
	
	
	public double calcolaIncasso() {
		//TODO calcolare incasso volo
		double incasso= 0;
		for(int i=0; i<passeggeri.size();i++) {
			incasso= incasso + passeggeri.get(i).getPrezzo();
		}
		return incasso;
	}
	
	public void stampaLista() {
		//TODO stampare la lista dei passeggeri
		for(int i=0; i<passeggeri.size();i++) {
			System.out.println(passeggeri.get(i).getNominativo());
		}
	}

	
	
	
}
