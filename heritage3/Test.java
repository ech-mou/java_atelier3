package heritage3;

public class Test {

	public static void main(String[] args) {
		Secretaire S1=new Secretaire("ech-choufi","mouhsine", "laghdir", "youssoufia", 1996, 07);
		S1.toString();
		S1.ecrirePersonne();
		
		Enseignant E1=new Enseignant("yaya", "ensprenom", "hamriya", "meknes", 1979, "physique");
		E1.toString();
		E1.modifierPersonne("quartier","casablanca");
		E1.ecrirePersonne();
		
		Etudiant et1=new Etudiant("ziko","etPrenom", "giliz", "Marrekech", 1998, "developpement informatique");
		et1.modifierPersonne("nouveau", "berrechide");
		et1.ecrirePersonne();
	}

}
