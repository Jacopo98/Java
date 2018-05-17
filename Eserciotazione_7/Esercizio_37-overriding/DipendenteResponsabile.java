public class DipendenteResponsabile extends Dipendente{

	double bonus;
	
	/*costruttore auto generato dopo aver messo: extends*/
	public DipendenteResponsabile(String n, String c, int ore, int ret, double bonus) {
		super(n, c, ore, ret);
		this.bonus=bonus;
	}

	public double calcolaStipendio() {
		double stipendio=0;
		stipendio=oreLavorativeMensili*retribuzioneOraria;
		return stipendio+bonus;
	}
	
	
}
