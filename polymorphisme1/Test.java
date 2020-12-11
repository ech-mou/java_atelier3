package polymorphisme1;

import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		Employe b = new Employe("hamid", "hamid", "casa", "casa", 1990, 34);
		Employe b2 = new Employe("simo", "hamid", "casa", "casa", 1990, 34);
		Employe b3 = new Employe("kamal", "hamid", "casa", "casa", 1990, 34);
		Employe b4 = new Employe("mohamed", "hamid", "casa", "casa", 1990, 34);
		Employe b5 = new Employe("jamal", "hamid", "casa", "casa", 1990, 34);
		//b.afficher();
		
		Chef c = new Chef("hamid", "hamid", "casa", "casa", 1990, 456, "hi");
		Chef c1 = new Chef("imad", "hamid", "casa", "casa", 1990, 456, "hi");
		//c.afficher();
		
		Directeur d = new Directeur("hamid", "hamid", "casa", "casa", 1990,456, "hi", "you");
		//d.afficher();
		
		
		ArrayList <Employe> table = new ArrayList<Employe>();
		table.add(b);
		table.add(b2);
		table.add(b3);
		table.add(b4);
		table.add(b5);
		table.add(c);
		table.add(c1);
		table.add(d);
		
		for (int i = 0; i < table.size(); i++) {
			table.get(i).afficher();
		}
		
	}
	}


