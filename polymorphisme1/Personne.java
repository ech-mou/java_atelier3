package polymorphisme1;

public abstract class Personne {
     
		private String nom,prenom,adresse,ville;
		private int dateNaissance;
		public Personne(String nom, String prenom, String adresse, 
				String ville,int dateNaissance) {
			super();
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



		public abstract void afficher();
		
		
}
