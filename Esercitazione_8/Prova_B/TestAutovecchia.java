
public class TestAutovecchia {

	public static void main(String[] args) {

		/*creazione tre automobili */
		Automobile YpsilonJacopo = new Automobile(25000);
		Automobile FordFiestaEnrico = new Automobile(3000);
		Automobile OpelCorsaYari = new Automobile(200000);
		
		Automobile[] vett= new Automobile[] {YpsilonJacopo, FordFiestaEnrico, OpelCorsaYari};
		trovaAutoPiuVecchia(vett);
	}

	//metodo che restituisce l'auto più vecchia in base ai km
	private static Automobile trovaAutoPiuVecchia(Automobile[] vett) {
		
		Automobile piuVecchia = null;
		if(vett.length>0) {
			int old=0;
			for(int i=1; i<vett.length;i++) {
				if(vett[i].NumKm>vett[old].NumKm) {
					old = i;
				}
				piuVecchia=vett[old];
			}
		}
		System.out.println("Auto piu vecchia: \n" +  piuVecchia);
		return piuVecchia;
		
	}

}
