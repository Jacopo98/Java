public class Dipendente {

	String nome;
	String cognome;
	int oreLavorativeMensili;
	int retribuzioneOraria;
	
	/*Costruttore dipendente */
	public Dipendente(String n, String c, int ore, int ret) {
		this.nome=n;
		this.cognome=c;
		this.oreLavorativeMensili=ore;
		this.retribuzioneOraria=ret;
	}
	
	/*metodi*/
	public double calcolaStipendio() {
		double stipendio=0;
		stipendio=oreLavorativeMensili*retribuzioneOraria;
		return stipendio;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	
}
