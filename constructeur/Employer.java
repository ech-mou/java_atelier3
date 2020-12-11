package calculerage;

public class Employer {
	private String nom;
	private String prenom;
	private String adresse;
	private int anneeN;
	private int anneeE;
	
	
	public Employer(String nom, String prenom, String adresse, int anneeN,int anneeE) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.anneeN = anneeN;
		this.anneeE = anneeE;
	}
	public void calculerAge(){
		double res = anneeE - anneeN;
	}
	public void afficherInfoClients(){
		System.out.println(nom + " " + prenom + ", né le " + anneeN + " habitant a " + adresse);
	}
}
