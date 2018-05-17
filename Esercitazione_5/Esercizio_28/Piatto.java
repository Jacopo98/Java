public class Piatto {

	int idpiatto;	//identificativo
	int qta;		//quantità
	double prezzo;	//prezzo
	
	//costruttore
	public Piatto(int idpiatto, int qta, double prezzo){
		this.idpiatto=idpiatto;
		this.qta=qta;
		this.prezzo=prezzo;
	}
	
	public int getQta() {
		return qta;
	}

	public double getPrezzo() {
		return prezzo;
	}
	
	public int getId() {
		return idpiatto;
	}
	
	public void setQta(int qta) {
		this.qta = qta;
	}
	
	@Override
	public String toString() {
		return idpiatto + " " + qta + " "+ prezzo;
	}
	
	
}
