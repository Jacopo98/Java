public abstract class TestVolo {

	public static void main(String[] args) {

		Passeggeri pers1= new Passeggeri(1, "Jacopo","Boffelli",25, 'E');
		Passeggeri pers2= new Passeggeri(2, "Lorenzo","Boffelli", 23, 'P');
		Passeggeri pers3= new Passeggeri(3, "Martina","Boffelli", 45, 'P');
		Passeggeri pers4= new Passeggeri(4, "Maurizio","Boffelli", 33, 'E');
		Passeggeri pers5= new Passeggeri(5, "Barbara","Sonzogni", 28, 'P');
		Passeggeri pers6= new Passeggeri(6, "Diego","Sonzogni", 38, 'E');

		/*public Volo(int idvolo_dest, int idvolo_part, int posti_economica, int posti_primaclasse,
				ArrayList<Passeggeri> passeggeri)*/
		
		Volo Oceanic_815 = new Volo(1, 3, 50, 80);
		
		Oceanic_815.aggiungiPasseggero(pers1);	//aggiungo le persone al volo Oceanic_815
		Oceanic_815.aggiungiPasseggero(pers2);
		Oceanic_815.aggiungiPasseggero(pers3);
		Oceanic_815.aggiungiPasseggero(pers4);
		Oceanic_815.aggiungiPasseggero(pers5);
		Oceanic_815.aggiungiPasseggero(pers6);
		
		System.out.println("I passeggeri del volo sono: ");
		
		Oceanic_815.stampaLista();	//visualizzo lista passeggeri
		
		double incasso = Oceanic_815.calcolaIncasso(); 
		System.out.println("L'incasso del volo è: " + incasso);	//stampo incasso volo
		
		System.out.println("");
		System.out.println("Elenco passeggeri aggiornato:");
		
		Oceanic_815.rimuoviPaseggero(pers6); 	//rimuovo dal volo pers6
		
		Oceanic_815.stampaLista();	//visualizzo lista passeggeri aggiornata
		
	}
}
