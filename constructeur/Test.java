package calculerage;

public class Test {

	public static void main(String[] args) {
		Employer r = new Employer("Mohammad", " El alami", "casa", 1963, 2020);
		Employer r1 = new Employer("Khalid", "El wahabi ", "Safi", 1990 , 2020);
		Employer r2 = new Employer("Fouad", "Sbai", "Salé", 2006, 2020);
		r.afficherInfoClients();
		r1.afficherInfoClients();
		r2.afficherInfoClients();
	}

}
