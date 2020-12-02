package comportamentoComune.iteratore;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Persona[] elenco = { new Persona("Paolo","Rossi"),
		          new Persona("Gigi","Neri"),
		          new Persona("Mario","Bianchi")
         };
		Sequenza seq=new Sequenza(elenco);
		Iterator it = seq.iterator();
		
		while(it.hasNext()) {
			Object elemento= it.next();
			System.out.println(elemento);
		}

	}

}
