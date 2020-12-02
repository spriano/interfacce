package comportamentoComune.sort;

import java.util.Arrays;

public class TestStudente {

	public static void main(String[] args) {
		Studente[] studenti= {new Studente(1,"Paolo","Rossi"),
				              new Studente(2,"Gigi","Neri"),
				              new Studente(3,"Mario","Bruni")
		};
	stampa(studenti);
	
	Arrays.sort(studenti);
	
	System.out.println();
	
	stampa(studenti);
		
	}
	static void stampa(Studente[] stud) {
		for(Studente s:stud) {
			System.out.println(s);
		}
	}

}
