package polymorphisme1;

public class Directeur extends Chef {
		private String societe;
		
		
		public Directeur(String nom, String prenom, String adresse, String vill,int dateNaissance, double salaire, String service,String societe) {
			super(nom, prenom, adresse, vill, dateNaissance, salaire, service);
			
			this.societe=societe;
		}


		@Override
		public String toString() {
			return super.toString()+ ", societe=" + societe;
		}
		
		@Override
		public void afficher() {
			
			System.out.println("Directeur :" + toString());
			
		}
		
		
		
}
