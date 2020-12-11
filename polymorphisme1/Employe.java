package polymorphisme1;

public class Employe extends Personne {
		
		private double salaire;
			
			public Employe(String nom, String prenom, String adresse, String vill,
					int dateNaissance,double salaire) {
				super(nom, prenom, adresse, vill, dateNaissance);
				
				this.salaire=salaire;
			}
			
			@Override
			public String toString() {	
				return super.toString() + ", salaire=" + salaire;
			}

			@Override
			public void afficher() {
				
				System.out.println("Employe :" + toString());
				
			}
			
			
}
