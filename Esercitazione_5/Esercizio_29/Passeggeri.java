public class Passeggeri {

	int idbiglietto;
	String nome;
	String cognome;
	double prezzo;
	char classe; // P: prima classe; E: economica

	
	//costruttore
	public Passeggeri(int idbiglietto, String nome, String cognome, double prezzo, char classe) {
		this.idbiglietto = idbiglietto;
		this.nome = nome;
		this.cognome = cognome;
		this.prezzo = prezzo;
		this.classe = classe;
	}
	
	//metodi
	public char getClasse() {
		return classe;
	}
	
	public int getId(){
		return idbiglietto;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public String getNominativo() {
		return nome + " " + cognome;
	}
	
}
