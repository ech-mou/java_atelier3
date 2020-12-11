package heritage1;

public class ArticleEnSolde extends Article  {
	private double remise;

	public double getRemise() {
		return remise;
	}

	public void setRemise(double remise) {
		if(remise <1){
			this.remise = remise;
		}else {
			this.remise = remise / 100;
		}
		
	}
	
	@Override
	public void afficher(){
		double h = getPrix() - (getPrix() * remise);
		System.out.println("le pourcentage de remise :" + remise);
		System.out.println("le prix final : "+ h + "dh");
	}
}
