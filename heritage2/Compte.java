package heritage22;

import java.util.Scanner;

public class Compte {
	Scanner input = new Scanner(System.in);
	private long numeroCompte; 
	private double solde;
	public long getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public void Afficher(){
		System.out.println("numero de compte : " + numeroCompte);
		System.out.println(" tu veux ajouter ou retirer ");
	      String reponse=input.next().toLowerCase();
	      
	      if(reponse.equals("ajouter")) {
	    	  System.out.println("  ajouterle prix ");
	    	  int ajout=input.nextInt();
	    	  solde =solde + ajout;
	      }
	      else if(reponse.equals("retirer")) {
	    	  System.out.println("  ajouterle prix ");
	    	  int reti=input.nextInt();
	    	  solde =solde - reti;
	      }
	      
		System.out.println("votre solde : " + solde);
	}
}
