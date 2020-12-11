package heritage22;

public class Test {

	public static void main(String[] args) {
		Epargne a = new Epargne();
		a.setSolde(150);
		a.setNumeroCompte(2345234567853423L);
		
		a.Afficher();
		
		a.setInteret(20);
		a.calculer();
	}
}
