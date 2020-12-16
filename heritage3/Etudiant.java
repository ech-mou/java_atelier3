package heritage3;

public class Etudiant extends Person {
	  String diplomeEtudier;


	@Override
	public String toString() {
	    return "Etudient [diplomeEtudier=" + diplomeEtudier + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
	            + ", ville=" + ville + ", dateNaissance=" + dateNaissance + "]";
	}

	
	public Etudiant(String nom, String prenom, String adresse, String ville, int dateNaissance, String diplomeEtudier) {
	    super(nom, prenom, adresse, ville, dateNaissance);
	    this.diplomeEtudier = diplomeEtudier;

	}
	@Override
	public void ecrirePersonne() {
	    System.out.println("name :"+nom);
	    System.out.println("prenom :"+prenom);
	    System.out.println("adresse :"+adresse);
	    System.out.println("ville :"+ville);
	    System.out.println("dateNaissance :"+dateNaissance);
	    System.out.println("diplome Etudier :"+diplomeEtudier);
	}

	}
