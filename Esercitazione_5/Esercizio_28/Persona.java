public class Persona {

	String nome;
	String cognome;
	
	//costruttore
	public Persona(String nome, String cognome){
		this.nome=nome;
		this.cognome=cognome;

	}
	
	@Override
	public String toString() {
		return nome+ " "+ cognome;
	}
	
	
}
