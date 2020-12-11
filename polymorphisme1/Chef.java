package polymorphisme1;

public class Chef extends Employe {
		private String service; 
		public Chef(String nom, String prenom, String adresse, String vill,
				int dateNaissance, double salaire,String service) {
			super(nom, prenom, adresse, vill, dateNaissance, salaire);
			
			this.service=service;
		}
		@Override
		public String toString() {
			return super.toString() + ", service=" + service;
		}
		
		@Override
		public void afficher() {
			
			System.out.println("Chef :"+  toString());
			
		}
		
		
}
