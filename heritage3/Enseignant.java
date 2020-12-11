package heritage33;

public class Enseignant extends Personne {
		

		private String specialite;
		
		public Enseignant(String nom, String prenom, String adresse, String ville,
				int dateNaissance,String specialite) {
			super(nom, prenom, adresse, ville, dateNaissance);
			
			this.specialite=specialite;
			
		}

		
		@Override
		public String toString() {
			return "specialite=" + specialite;
		}



		@Override
		void ecrirePersonne() {
			System.out.println("Enseignant :" + toString() + " " + toString());
			
		}
		
		
	}

