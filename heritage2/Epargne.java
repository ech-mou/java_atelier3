package heritage22;

public class Epargne extends Compte {
	double interet;
	double h;

	public double getInteret() {
		return interet;
	}

	public void setInteret(double interet) {
		this.interet = interet;
	}
	
	public void calculer(){
		if(getSolde()<200){
			System.out.println("la valeur minimale du solde est 200 MAD");
		}else{
			if(interet <1){
			
				h= getSolde();

			}else if(interet>1) {
				interet = interet / 100;
				 h= getSolde() - (getSolde()*interet);

			}
							System.out.println("votre nouveau solde avec interet : "+ h );

		}
	}
}
