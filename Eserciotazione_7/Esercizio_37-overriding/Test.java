public class Prova {

	public static void main(String[] args) {
		
		Dipendente A1 = new Dipendente("Jacopo", "Boffelli", 150, 15);
		Dipendente A2 = new DipendenteResponsabile("Lorenzo", "Boffelli", 130, 13, 200);
		
		System.out.println("Lo stpendio di " + A1.getNome() + ": \n" + A1.calcolaStipendio());
		System.out.println("Lo stpendio di " + A2.getNome() + ": \n" + A2.calcolaStipendio());
		
	}

}
