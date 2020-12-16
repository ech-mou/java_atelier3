package heritage3;

public class Secretaire extends Person{
 
	    int numeroBureau;


	    @Override
	    public String toString() {
	        return "Secretaire [numeroBureau=" + numeroBureau + ", nom=" + nom + ", prenom=" + prenom + ", adresse="
	                + adresse + ", ville=" + ville + ", dateNaissance=" + dateNaissance + "]";
	    }

	    public Secretaire(String nom, String prenom, String adresse, String ville, int dateNaissance, int numeroBureau) {
	        super(nom, prenom, adresse, ville, dateNaissance);
	        this.numeroBureau = numeroBureau;
	    }

	    @Override
	    public void ecrirePersonne() {
	    System.out.println("name :"+nom);
	    System.out.println("prenom :"+prenom);
	    System.out.println("adresse :"+adresse);
	    System.out.println("ville :"+ville);
	    System.out.println("dateNaissance"+dateNaissance);
	    System.out.println("nNumero de bureau :"+numeroBureau);
	    }

	}
