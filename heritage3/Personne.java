package heritage33;

public abstract class Personne {

		private String nom;
		private String prenom;
		private String adresse;
		private String ville;
		private int dateNaissance;
		
		public Personne(String nom, String prenom, String adresse, String ville,
				int dateNaissance) {
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
			this.ville = ville;
			this.dateNaissance = dateNaissance;
			
		}

		public String toString() {
			return "nom=" + nom + ", prenom=" + prenom + ", adresse="
					+ adresse + ", ville=" + ville + ", dateNaissance="
					+ dateNaissance;
		}
		public void modifiePersonne(String adresse, String ville){
			this.adresse=adresse;
			this.ville=ville;
		}
		
		abstract void ecrirePersonne();
	}

