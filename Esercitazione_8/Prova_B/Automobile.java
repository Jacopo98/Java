public class Automobile implements Comparable<Automobile>{

	int NumKm;
	
	public Automobile(int numkm) {
		this.NumKm=numkm;
	}
	

	@Override
	public int compareTo(Automobile auto) {
		return NumKm<auto.NumKm ? 1 : NumKm==auto.NumKm ? 0 : -1;
	}
	
	public String toString() {
		return "Auto con "+ NumKm + " km";
	}
	
}
