package comportamentoComune.iteratore;

import java.util.Iterator;

public class Sequenza implements Iterable {
	
	private Persona[] lista;
	
	public Sequenza(Persona[] lista) {
		this.lista = lista;
	}
	@Override
	// restituisce una classe interna che implementa Iterator
	public Iterator iterator() {
		return new Seq();
	}
	// classe interna 
	class Seq implements Iterator{
		private int i=0;
		// restituisce il confronto l'attributo i
		// che mantiene e la lungehzza della lista
		// per vedere se ci sono ancora elementi
		
		public boolean hasNext() {
			return i<lista.length;
		}
        // passa all'elemento successivo
		@Override
		public Object next() {		
			return lista[i++];
		}
	}
}
